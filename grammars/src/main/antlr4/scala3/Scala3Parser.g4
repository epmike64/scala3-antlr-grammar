
grammar Scala3Parser;

options {
    tokenVocab = Scala3Lexer;
}

//https://docs.scala-lang.org/scala3/reference/syntax.html
//https://scala-lang.org/files/archive/spec/3.4/13-syntax-summary.html


//-- LITERALS AND PATHS ---------

interpolatedString
                 :  Alphaid '"' ('\\'? interpolatedStringPart | '\\' | '"')* '"'
                   |  Alphaid '"""' ('"'? '"'?   ('"' | '$') | escape)* ('"')* '"""'
                   ;

interpolatedStringPart
                 : PrintableChar  ('"' | '$' | '\\') | escape
                 ;
escape
       :'$$'
       |  '$"'
       |  '$' Alphaid
       |  '$' blockExpr
       ;

simpleLiteral
                :  '-'? IntegerLiteral
                |  '-'? FloatingPointLiteral
                |  BooleanLiteral
                |  CharacterLiteral
                |  StringLiteral
                ;

literal
        :  simpleLiteral
//InterpolatedStringLiteral
        | interpolatedString
        |  SymbolLiteral
        |  'null'
        ;

qualId
        :  Id ('.' Id)*
        ;

ids
        :  Id (',' Id)*
        ;

simpleRef
        :  Id
        |  (Id '.')? 'this'
        |  (Id '.')? 'super' classQualifier? '.' Id
        ;

classQualifier
        :  '[' Id ']'
        ;

//---- TYPES -----

type
        :  funType
        |  hkTypeParamClause '=>>' type
        |  funParamClause '=>>' type
        |  matchType
        |  infixType
        ;

funType
        :  funTypeArgs ('=>' | '?=>') type
        |  hkTypeParamClause '=>' type
        ;

funTypeArgs
        :  infixType
        |  '(' funArgTypes? ')'
        |  funParamClause
        ;

funParamClause
        :  '(' typedFunParam (',' typedFunParam )* ')'
        ;

typedFunParam
        :  Id ':' type
        ;

matchType
        :  infixType 'match' ('{' typeCaseClauses '}' | Indent typeCaseClauses Outdent)
        ;

infixType
        :  refinedType (Id NL? refinedType)*
        ;

refinedType
        :  annotType (NL? refinement)*
        ;

annotType
        :  simpleType annotation*
        ;

simpleType
        :
        simpleLiteral                                            //SingletonTypeTree(l)
        |  '?' typeBounds
        |  simpleType1
        ;

simpleType1
       :  Id                                                     //  Ident(name)
        |  singleton '.' Id                                        // Select(t, name)
        |  singleton '.' 'type'                                    // SingletonTypeTree(p)
        |  '(' types ')'                                           // Tuple(ts)
        |  refinement                                             //  RefinedTypeTree(EmptyTree, refinement)
        |  typeSplice                                               //-- deprecated syntax
        |  simpleType1 typeArgs                               //      AppliedTypeTree(t, args)
        |  simpleType1 '#' Id
        ;

singleton
        :  simpleRef
        |  simpleLiteral
        |  singleton '.' Id
        ;

funArgType
            :  type
            |  '=>' type
            ;

funArgTypes
            :  funArgType ( ',' funArgType )*
            ;

paramType
            :  '=>'? paramValueType
            ;

paramValueType
            :  type '*'?
            ;

typeArgs
            :  '[' types ']'
            ;

refinement_
    : refineDcl? (Semi refineDcl?)*
    ;

refinement
            :  NL? '{' refinement_ '}'
            | ':' Indent refinement_ Outdent
            ;

typeBounds
            :  ('>:' type)? ('<:' type)?
            ;

typeParamBounds
            :  typeBounds (':' type)*
            ;

types
        :  type (',' type)*
        ;


// EXPRESSIONS

expr
        :  funParams ('=>' | '?=>') expr
        |  hkTypeParamClause '=>' expr
        |  expr1
        ;

blockResult
        :  funParams ('=>' | '?=>') block
        |  hkTypeParamClause '=>' block
        |  expr1
        ;

funParams
            :  bindings
            |   Id
            |  '_'
            ;

expr1
        :  'inline'? 'if' '(' expr ')' NL* expr (Semi? 'else' expr)?
        |  'inline'? 'if'  expr 'then' expr (Semi? 'else' expr)?
        |  'while' '(' expr ')' NL* expr
        |  'while' expr 'do' expr
        |  'try' expr catches ('finally' expr)?
        |  'try' expr ('finally' expr)?
        |  'throw' expr
        |  'return' expr?
        |  forExpr
        |  (simpleExpr '.')? Id '=' expr
        |  prefixOperator simpleExpr '=' expr
        |  simpleExpr argumentExprs '=' expr
        |  postfixExpr ascription?
        |  'inline' infixExpr matchClause
        ;

ascription
        :  ':' infixType
        |  ':' annotation annotation*
        ;

catches
        :  'catch' (expr | exprCaseClause)
        ;

postfixExpr
            :  infixExpr Id?                                         //-- only if language.postfixOperators is enabled
            ;

infixExpr
            :  prefixExpr
            |  infixExpr Id NL? infixExpr
            |  infixExpr Id colonArgument
            |  infixExpr matchClause
            ;

matchClause
            :  'match' ( '{' caseClauses '}' | Indent caseClauses Outdent )
            ;

prefixExpr
            :  prefixOperator? simpleExpr
            ;

prefixOperator
            : '-' | '+' | '~' | '!'                                    //-- unless backquoted
            ;

simpleExpr
            :  simpleRef
            |  literal
            |  '_'
            |  blockExpr
            |  exprSplice
            |  quoted
            |  QuoteId                                                 // -- only inside splices
            |  'new' constrApp ('with' constrApp)* templateBody?
            |  'new' templateBody
            |  '(' exprsInParens ')'
            |  simpleExpr '.' Id
            |  simpleExpr '.' matchClause
            |  simpleExpr typeArgs
            |  simpleExpr argumentExprs
            |  simpleExpr colonArgument
            ;

colonArgument
            :  ':' lambdaStart? Indent (caseClauses | block) Outdent
            ;

lambdaStart
            :  funParams ('=>' | '?=>')
             |  hkTypeParamClause '=>'
             ;


quoted
        :  '\'' '{' block '}'
        |  '\'' '[' typeBlock ']'
        ;


 exprSplice
        : Spliceid                                                  //-- if inside quoted block
         |  '$' '{' block '}'                                      //  -- unless inside quoted pattern
         |  '$' '{' pattern '}'                                     // -- when inside quoted pattern
         ;

typeSplice
        :Spliceid                                               //   -- if inside quoted type -- deprecated syntax
        |  '$' '{' block '}'                                        //-- unless inside quoted type pattern -- deprecated syntax
        |  '$' '{' pattern '}'
        ;

 exprsInParens
        :  exprInParens (',' exprInParens)*
        ;

 exprInParens
        :  postfixExpr ':' type
         |  expr
         ;

 parArgumentExprs
        :  '(' exprsInParens? ')'
         |  '(' 'using' exprsInParens ')'
         |  '(' (exprsInParens ',')? postfixExpr '*' ')'
         ;

 argumentExprs
        :  parArgumentExprs
         |  blockExpr
         ;


blockExpr_
            : (caseClauses | block)
            ;

 blockExpr
        :  '{' blockExpr_ '}'
        |  Indent blockExpr_ Outdent
        ;

block
        :  (blockStat Semi)* blockResult?
        ;

blockStat
        :  import_
         |  (annotation NL*)* localModifier? def
         |  extension
         |  expr1
         |  endMarker
         ;

 typeBlock
        :  (typeBlockStat Semi)* type
        ;

typeBlockStat
        :  'type' NL* typeDef
        ;

forExpr
        :  'for' '(' enumerators0 ')' NL* ('do' | 'yield')? expr
         |  'for' '{' enumerators0 '}' NL* ('do' | 'yield')? expr
         |  'for'     enumerators0          ('do' | 'yield') expr
         ;

 enumerators0
        :  NL* enumerators Semi?
        ;

 enumerators
        :  generator (Semi enumerator | guard)*
        ;

enumerator
        :  generator
         |  guard guard*
         |  pattern1 '=' expr
         ;

 generator
         :  'case'? pattern1 '<-' expr
         ;

 guard
        :  'if' postfixExpr
        ;

 caseClauses
        :  caseClause caseClause*
        ;

caseClause
        :  'case' pattern guard? '=>' block
        ;

exprCaseClause
        :  'case' pattern guard? '=>' expr
        ;

typeCaseClauses
        :  typeCaseClause typeCaseClause*
        ;

typeCaseClause
        :  'case' (infixType | '_') '=>' type Semi?
        ;

 pattern
        :  pattern1 ( '|' pattern1 )*
        ;

 pattern1
        :  patVar ':' refinedType
         |  '-'? IntegerLiteral ':' refinedType
         |  '-'? FloatingPointLiteral ':' refinedType
         |  pattern2
         ;

 pattern2
        :  (Id '@')? infixPattern
        ;

infixPattern
        :  simplePattern ( Id NL? simplePattern )*
        ;

 simplePattern
        :  patVar
         |  literal
         |  '(' patterns? ')'
         |  quoted
         |  simplePattern1 typeArgs? argumentPatterns?
         |  'given' refinedType
         ;

 simplePattern1
        :  simpleRef
         |  simplePattern1 '.' Id
         ;

 patVar
           :  Varid
         |  '_'
         ;

patterns
        :  pattern (',' pattern)*
         ;

argumentPatterns
            :  '(' patterns? ')'
            |  '(' (patterns ',')? patVar '*' ')'
            ;

//---Type and Value Parameters

clsTypeParamClause
                :  '[' clsTypeParam (',' clsTypeParam)* ']'
                ;

clsTypeParam
            :  annotation* ('+' | '-')? Id hkTypeParamClause? typeParamBounds
            ;

typTypeParamClause
            :  '[' typTypeParam (',' typTypeParam)* ']'
            ;

typTypeParam
            :  annotation* Id hkTypeParamClause? typeBounds
            ;

hkTypeParamClause
            :  '[' hkTypeParam (',' hkTypeParam)* ']'
            ;

hkTypeParam
            :  annotation* ('+' | '-')? (Id hkTypeParamClause? | '_') typeBounds
            ;


clsParamClauses
            :  clsParamClause* (NL? '(' 'implicit'? clsParams ')')?
            ;

clsParamClause
            :  NL? '(' clsParams ')'
            |  NL? '(' 'using' (clsParams | funArgTypes) ')'
            ;

clsParams
            :  clsParam (',' clsParam)*
            ;

clsParam
            :  annotation* (modifier* ('val' | 'var') | 'inline' )? param
            ;

defParamClauses
            :  defParamClause defParamClause* //-- and two defTypeParamClause cannot be adjacent
            ;

defParamClause
            :  defTypeParamClause
            |  defTermParamClause
            |  usingParamClause
            ;

typelessClauses
            :  typelessClause typelessClause*
            ;

typelessClause
            :  defTermParamClause
            |  usingParamClause
            ;

defTypeParamClause
            :  NL? '[' defTypeParam (',' defTypeParam)* ']'
            ;

defTypeParam
            :  annotation* Id hkTypeParamClause? typeParamBounds
            ;


defTermParamClause
            :  NL? '(' defTermParams? ')'
            ;


usingParamClause
            :  NL? '(' 'using' (defTermParams | funArgTypes) ')'
            ;


defImplicitClause
            :  NL? '(' 'implicit' defTermParams ')'
            ;

defTermParams
            : defTermParam (',' defTermParam)*
            ;

defTermParam
            : annotation* 'inline'? param
            ;

param
        :  Id ':' paramType ('=' expr)?
        ;

//---Bindings and Imports

bindings
        :  '(' (binding (',' binding)*)? ')'
        ;

binding
            :  (Id | '_') (':' type)?
            ;

modifier
            :  localModifier
            |  accessModifier
            |  'override'
            |  'opaque'
            ;

localModifier
            :  'abstract'
            |  'final'
            |  'sealed'
            |  'open'
            |  'implicit'
            |  'lazy'
            |  'inline'
            |  'transparent'
            |  'infix'
            ;

accessModifier
            :  ('private' | 'protected') accessQualifier?
            ;

accessQualifier
            :  '[' Id ']'
            ;

annotation
            :  '@' simpleType1 parArgumentExprs*
            ;

import_
            :  'import' importExpr (',' importExpr)*
            ;

export
            :  'export' importExpr (',' importExpr)*
            ;

importExpr
            :  simpleRef ('.' Id)* '.' importSpec
            |  simpleRef 'as' Id
            ;


importSpec
            :  namedSelector
            |  wildCardSelector
            | '{' importSelectors '}'
            ;


namedSelector
            :  Id ('as' (Id | '_'))?
            ;

wildCardSelector
            :  '*' | 'given' infixType?
            ;

importSelectors
            :  namedSelector (',' importSelectors)?
            |  wildCardSelector (',' wildCardSelector)*
            ;

endMarker
            :  'end' endMarkerTag    //-- when followed by EOL
            ;

endMarkerTag
                :  Id | 'if' | 'while' | 'for' | 'match' | 'try'
                    |  'new' | 'this' | 'given' | 'extension' | 'val'
             ;


//-- Declarations and Definitions

refineDcl
        :  'val' valDcl
        |  'def' defDcl
        |  'type' NL* typeDef
        ;

valDcl
    :  ids ':' type
    ;

defDcl
    :  defSig ':' type
    ;

def
    :  'val' patDef
    |  'var' patDef
    |  'def' defDef
    |  'type' NL* typeDef
    |  tmplDef
    ;

patDef
        :  ids (':' type)? '=' expr
        |  pattern2 (':' type)? '=' expr
        ;

defDef
            :  defSig (':' type)? '=' expr
            |  'this' typelessClauses defImplicitClause? '=' constrExpr
            ;

defSig
       :  Id defParamClauses? defImplicitClause?
       ;

typeDef
       :  Id hkTypeParamClause? (funParamClause)* typeBounds  ('=' type)?
       ;

tmplDef
            :  ('case'? 'class' | 'trait') classDef
            |  'case'? 'object' objectDef
            |  'enum' enumDef
            |  'given' givenDef
            ;

classDef
            :  Id classConstr template?
            ;

classConstr
            :  clsTypeParamClause? constrMods? clsParamClauses
            ;

constrMods
            :  annotation* accessModifier?
            ;

objectDef
            :  Id template?
            ;

enumDef
            :  Id classConstr inheritClauses enumBody
            ;

givenDef
            :  givenSig? (annotType ('=' expr)? | structuralInstance)
            ;

givenSig
            :  Id? defTypeParamClause? usingParamClause* ':'
            ;       // -- one of `Id`, `defTypeParamClause`, `usingParamClause` must be present

structuralInstance
            :  constrApp ('with' constrApp)* ('with' withTemplateBody)?
            ;

extension
            :  'extension' defTypeParamClause? usingParamClause*
                       '(' defTermParam ')' usingParamClause* extMethods_
            ;

extMethods_
        : extMethod (Semi extMethod)*
        ;

extMethods
            :  extMethod | NL?  ( '{' extMethods_ '}' | Indent extMethods_ Outdent )
            ;

extMethod
            :  (annotation NL?)* modifier* 'def' defDef
            |  export
             ;

template
            :  inheritClauses templateBody?
            ;

inheritClauses
            :  ('extends' constrApps)? ('derives' qualId (',' qualId)* )?
            ;

constrApps
            :  constrApp ( (',' constrApp)* | ('with' constrApp)* )
            ;

constrApp
            :  simpleType1 annotation* parArgumentExprs*
            ;

constrExpr_
            : selfInvocation (Semi blockStat)*
            ;

constrExpr
        :  selfInvocation
        |  ('{' constrExpr_ '}' | Indent constrExpr_ Outdent)
        ;


selfInvocation
        :  'this' argumentExprs argumentExprs*
        ;

templateBody_
             : selfType? templateStat (Semi templateStat)*
             ;

withTemplateBody
            : '{' templateBody_ '}'
            | Indent templateBody_ Outdent
            ;

templateBody:
            NL? '{' templateBody_ '}'
            | ':' Indent templateBody_ Outdent
            ;

templateStat
            :  import_
            |  export
            |  (annotation NL?)* (modifier)* def
            |  extension
            |  expr1
            |  endMarker
            ;

selfType
            :  Id (':' infixType)? '=>'
            |  'this' ':' infixType '=>'
            ;

enumBody_
    : selfType? enumStat (Semi enumStat)*
    ;

enumBody
    :  NL?  enumBody_
    | ':' Indent enumBody_ Outdent
    ;

enumStat
            :  templateStat
            |  (annotation NL?)* (modifier)* enumCase
            ;

enumCase
            :  'case' (Id classConstr ('extends' constrApps)? | ids);

topStats
            :  topStat (Semi topStat)*
            ;

topStat
            :  import_
            |  export
            |  (annotation NL?)* modifier* def
            |  extension
            |  packaging
            |  packageObject
            |  endMarker
            ;

packaging
            :  'package' qualId NL? ( NL? '{' topStats '}' | ':' Indent topStats Outdent)
            ;

packageObject
        :  'package' 'object' objectDef
        ;

compilationUnit
        :  ( 'package' qualId Semi )* topStats
        ;