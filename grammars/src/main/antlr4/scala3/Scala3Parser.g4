
grammar Scala3Parser;

options {
    tokenVocab = Scala3Lexer;
}

//https://docs.scala-lang.org/scala3/reference/syntax.html
//https://scala-lang.org/files/archive/spec/3.4/13-syntax-summary.html


//-- LITERALS AND PATHS ---------


simpleLiteral
                :  '-'? IntegerLiteral
                |  '-'? FloatingPointLiteral
                |  BooleanLiteral
                |  CharacterLiteral
                |  StringLiteral
                ;

literal
        :  simpleLiteral
        |  InterpolatedStringLiteral
        |  SymbolLiteral
        |  'null'
        ;

qualId
        :  ID ('.' ID)*
        ;

ids
        :  ID (',' ID)*
        ;

simpleRef
        :  ID
        |  (ID '.')? 'this'
        |  (ID '.')? 'super' classQualifier? '.' ID
        ;

classQualifier
        :  '[' ID ']'
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
        :  ID ':' type
        ;

matchType
        :  infixType 'match' ('{' typeCaseClauses '}' | INDENT typeCaseClauses OUTDENT)
        ;

infixType
        :  refinedType (ID NL? refinedType)*
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
       :  ID                                                     //  Ident(name)
        |  singleton '.' ID                                        // Select(t, name)
        |  singleton '.' 'type'                                    // SingletonTypeTree(p)
        |  '(' types ')'                                           // Tuple(ts)
        |  refinement                                             //  RefinedTypeTree(EmptyTree, refinement)
        |  typeSplice                                               //-- deprecated syntax
        |  simpleType1 typeArgs                               //      AppliedTypeTree(t, args)
        |  simpleType1 '#' ID
        ;

singleton
        :  simpleRef
        |  simpleLiteral
        |  singleton '.' ID
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
            | COLON INDENT refinement_ OUTDENT
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
            |   ID
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
        |  (simpleExpr '.')? ID '=' expr
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
            :  infixExpr ID?                                         //-- only if language.postfixOperators is enabled
            ;

infixExpr
            :  prefixExpr
            |  infixExpr ID NL? infixExpr
            |  infixExpr ID colonArgument
            |  infixExpr matchClause
            ;

matchClause
            :  'match' ( '{' caseClauses '}' | INDENT caseClauses OUTDENT )
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
            |  QUOTEID                                                 // -- only inside splices
            |  'new' constrApp ('with' constrApp)* templateBody?
            |  'new' templateBody
            |  '(' exprsInParens ')'
            |  simpleExpr '.' ID
            |  simpleExpr '.' matchClause
            |  simpleExpr typeArgs
            |  simpleExpr argumentExprs
            |  simpleExpr colonArgument
            ;

colonArgument
            :  COLON LambdaStart? INDENT (caseClauses | block) OUTDENT
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
        : SPLICEID                                                  //-- if inside quoted block
         |  '$' '{' block '}'                                      //  -- unless inside quoted pattern
         |  '$' '{' pattern '}'                                     // -- when inside quoted pattern
         ;

typeSplice
        :SPLICEID                                               //   -- if inside quoted type -- deprecated syntax
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
        |  INDENT blockExpr_ OUTDENT
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
        :  (ID '@')? infixPattern
        ;

infixPattern
        :  simplePattern ( ID NL? simplePattern )*
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
         |  simplePattern1 '.' ID
         ;

 patVar
           :  VARID
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
            :  annotation* ('+' | '-')? ID hkTypeParamClause? typeParamBounds
            ;

typTypeParamClause
            :  '[' typTypeParam (',' typTypeParam)* ']'
            ;

typTypeParam
            :  annotation* ID hkTypeParamClause? typeBounds
            ;

hkTypeParamClause
            :  '[' hkTypeParam (',' hkTypeParam)* ']'
            ;

hkTypeParam
            :  annotation* ('+' | '-')? (ID hkTypeParamClause? | '_') typeBounds
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
            :  annotation* (modifier* ('val' | 'var'))? param
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
            :  annotation* ID hkTypeParamClause? typeParamBounds
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
        :  ID ':' paramType ('=' expr)?
        ;

//---Bindings and Imports

bindings
        :  '(' (binding (',' binding)*)? ')'
        ;

binding
            :  (ID | '_') (':' type)?
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
            :  '[' ID ']'
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
            :  simpleRef ('.' ID)* '.' importSpec
            |  simpleRef 'as' ID
            ;


importSpec
            :  namedSelector
            |  wildCardSelector
            | '{' importSelectors '}'
            ;


namedSelector
            :  ID ('as' (ID | '_'))?
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
                :  ID | 'if' | 'while' | 'for' | 'match' | 'try'
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
       :  ID defParamClauses? defImplicitClause?
       ;

typeDef
       :  ID hkTypeParamClause? (funParamClause)* typeBounds  ('=' type)?
       ;

tmplDef
            :  ('case'? 'class' | 'trait') classDef
            |  'case'? 'object' objectDef
            |  'enum' enumDef
            |  'given' givenDef
            ;

classDef
            :  ID classConstr template?
            ;

classConstr
            :  clsTypeParamClause? constrMods? clsParamClauses
            ;

constrMods
            :  annotation* accessModifier?
            ;

objectDef
            :  ID template?
            ;

enumDef
            :  ID classConstr inheritClauses enumBody
            ;

givenDef
            :  givenSig? (annotType ('=' expr)? | structuralInstance)
            ;

givenSig
            :  ID? defTypeParamClause? usingParamClause* ':'
            ;       // -- one of `ID`, `defTypeParamClause`, `usingParamClause` must be present

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
            :  extMethod | NL?  ( '{' extMethods_ '}' | INDENT extMethods_ OUTDENT )
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
        |  ('{' constrExpr_ '}' | INDENT constrExpr_ OUTDENT)
        ;


selfInvocation
        :  'this' argumentExprs argumentExprs*
        ;

templateBody_
             : selfType? templateStat (Semi templateStat)
             ;

withTemplateBody
            : '{' templateBody_ '}'
            | INDENT templateBody_ OUTDENT
            ;

templateBody:
            NL? '{' templateBody_ '}'
            | COLON INDENT templateBody_ OUTDENT
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
            :  ID (':' infixType)? '=>'
            |  'this' ':' infixType '=>'
            ;

enumBody_
    : selfType? enumStat (Semi enumStat)*
    ;

enumBody
    :  NL?  enumBody_
    | COLON INDENT enumBody_ OUTDENT
    ;

enumStat
            :  templateStat
            |  (annotation NL?)* (modifier)* enumCase
            ;

enumCase
            :  'case' (ID classConstr ('extends' constrApps)? | ids);

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
            :  'package' qualId NL? ( NL? '{' topStats '}' | COLON INDENT topStats OUTDENT)
            ;

packageObject
        :  'package' 'object' objectDef
        ;

compilationUnit
        :  ( 'package' qualId Semi )* topStats
        ;