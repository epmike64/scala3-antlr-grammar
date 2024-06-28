// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Scala3ParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Scala3ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#simpleLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleLiteral(Scala3ParserParser.SimpleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Scala3ParserParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#qualId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualId(Scala3ParserParser.QualIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(Scala3ParserParser.IdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#simpleRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleRef(Scala3ParserParser.SimpleRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#classQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassQualifier(Scala3ParserParser.ClassQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Scala3ParserParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#funType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunType(Scala3ParserParser.FunTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#funTypeArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunTypeArgs(Scala3ParserParser.FunTypeArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#funParamClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunParamClause(Scala3ParserParser.FunParamClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#typedFunParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedFunParam(Scala3ParserParser.TypedFunParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#matchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchType(Scala3ParserParser.MatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#infixType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixType(Scala3ParserParser.InfixTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#refinedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefinedType(Scala3ParserParser.RefinedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#annotType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotType(Scala3ParserParser.AnnotTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(Scala3ParserParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#simpleType1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType1(Scala3ParserParser.SimpleType1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#singleton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleton(Scala3ParserParser.SingletonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#funArgType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunArgType(Scala3ParserParser.FunArgTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#funArgTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunArgTypes(Scala3ParserParser.FunArgTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#paramType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamType(Scala3ParserParser.ParamTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#paramValueType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamValueType(Scala3ParserParser.ParamValueTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#typeArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgs(Scala3ParserParser.TypeArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#refinement_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefinement_(Scala3ParserParser.Refinement_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#refinement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefinement(Scala3ParserParser.RefinementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#typeBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBounds(Scala3ParserParser.TypeBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#typeParamBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParamBounds(Scala3ParserParser.TypeParamBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(Scala3ParserParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Scala3ParserParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#blockResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockResult(Scala3ParserParser.BlockResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#funParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunParams(Scala3ParserParser.FunParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(Scala3ParserParser.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#ascription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscription(Scala3ParserParser.AscriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(Scala3ParserParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpr(Scala3ParserParser.PostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#infixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpr(Scala3ParserParser.InfixExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#matchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchClause(Scala3ParserParser.MatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#prefixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpr(Scala3ParserParser.PrefixExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#prefixOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixOperator(Scala3ParserParser.PrefixOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(Scala3ParserParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#colonArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonArgument(Scala3ParserParser.ColonArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#lambdaStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaStart(Scala3ParserParser.LambdaStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#quoted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted(Scala3ParserParser.QuotedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#exprSplice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSplice(Scala3ParserParser.ExprSpliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#typeSplice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSplice(Scala3ParserParser.TypeSpliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#exprsInParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprsInParens(Scala3ParserParser.ExprsInParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#exprInParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInParens(Scala3ParserParser.ExprInParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#parArgumentExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParArgumentExprs(Scala3ParserParser.ParArgumentExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#argumentExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExprs(Scala3ParserParser.ArgumentExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#blockExpr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpr_(Scala3ParserParser.BlockExpr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#blockExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpr(Scala3ParserParser.BlockExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Scala3ParserParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#blockStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStat(Scala3ParserParser.BlockStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#typeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBlock(Scala3ParserParser.TypeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#typeBlockStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBlockStat(Scala3ParserParser.TypeBlockStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#forExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpr(Scala3ParserParser.ForExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#enumerators0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerators0(Scala3ParserParser.Enumerators0Context ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#enumerators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerators(Scala3ParserParser.EnumeratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(Scala3ParserParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#generator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerator(Scala3ParserParser.GeneratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(Scala3ParserParser.GuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#caseClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClauses(Scala3ParserParser.CaseClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(Scala3ParserParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#exprCaseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseClause(Scala3ParserParser.ExprCaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#typeCaseClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCaseClauses(Scala3ParserParser.TypeCaseClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#typeCaseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCaseClause(Scala3ParserParser.TypeCaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(Scala3ParserParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#pattern1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern1(Scala3ParserParser.Pattern1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#pattern2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern2(Scala3ParserParser.Pattern2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#infixPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixPattern(Scala3ParserParser.InfixPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#simplePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplePattern(Scala3ParserParser.SimplePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#simplePattern1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplePattern1(Scala3ParserParser.SimplePattern1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#patVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatVar(Scala3ParserParser.PatVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#patterns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatterns(Scala3ParserParser.PatternsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#argumentPatterns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentPatterns(Scala3ParserParser.ArgumentPatternsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#clsTypeParamClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClsTypeParamClause(Scala3ParserParser.ClsTypeParamClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#clsTypeParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClsTypeParam(Scala3ParserParser.ClsTypeParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#typTypeParamClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypTypeParamClause(Scala3ParserParser.TypTypeParamClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#typTypeParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypTypeParam(Scala3ParserParser.TypTypeParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#hkTypeParamClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHkTypeParamClause(Scala3ParserParser.HkTypeParamClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#hkTypeParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHkTypeParam(Scala3ParserParser.HkTypeParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#clsParamClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClsParamClauses(Scala3ParserParser.ClsParamClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#clsParamClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClsParamClause(Scala3ParserParser.ClsParamClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#clsParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClsParams(Scala3ParserParser.ClsParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#clsParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClsParam(Scala3ParserParser.ClsParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#defParamClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefParamClauses(Scala3ParserParser.DefParamClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#defParamClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefParamClause(Scala3ParserParser.DefParamClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#typelessClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypelessClauses(Scala3ParserParser.TypelessClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#typelessClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypelessClause(Scala3ParserParser.TypelessClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#defTypeParamClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefTypeParamClause(Scala3ParserParser.DefTypeParamClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#defTypeParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefTypeParam(Scala3ParserParser.DefTypeParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#defTermParamClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefTermParamClause(Scala3ParserParser.DefTermParamClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#usingParamClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingParamClause(Scala3ParserParser.UsingParamClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#defImplicitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefImplicitClause(Scala3ParserParser.DefImplicitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#defTermParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefTermParams(Scala3ParserParser.DefTermParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#defTermParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefTermParam(Scala3ParserParser.DefTermParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(Scala3ParserParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#bindings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindings(Scala3ParserParser.BindingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(Scala3ParserParser.BindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(Scala3ParserParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#localModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalModifier(Scala3ParserParser.LocalModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(Scala3ParserParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#accessQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessQualifier(Scala3ParserParser.AccessQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(Scala3ParserParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#import_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_(Scala3ParserParser.Import_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(Scala3ParserParser.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#importExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportExpr(Scala3ParserParser.ImportExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#importSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpec(Scala3ParserParser.ImportSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#namedSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedSelector(Scala3ParserParser.NamedSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#wildCardSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildCardSelector(Scala3ParserParser.WildCardSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#importSelectors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSelectors(Scala3ParserParser.ImportSelectorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#endMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndMarker(Scala3ParserParser.EndMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#endMarkerTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndMarkerTag(Scala3ParserParser.EndMarkerTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#refineDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefineDcl(Scala3ParserParser.RefineDclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#valDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValDcl(Scala3ParserParser.ValDclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#defDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefDcl(Scala3ParserParser.DefDclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(Scala3ParserParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#patDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatDef(Scala3ParserParser.PatDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#defDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefDef(Scala3ParserParser.DefDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#defSig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefSig(Scala3ParserParser.DefSigContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#typeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDef(Scala3ParserParser.TypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#tmplDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplDef(Scala3ParserParser.TmplDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(Scala3ParserParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#classConstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassConstr(Scala3ParserParser.ClassConstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#constrMods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrMods(Scala3ParserParser.ConstrModsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#objectDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDef(Scala3ParserParser.ObjectDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#enumDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDef(Scala3ParserParser.EnumDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#givenDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGivenDef(Scala3ParserParser.GivenDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#givenSig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGivenSig(Scala3ParserParser.GivenSigContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#structuralInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuralInstance(Scala3ParserParser.StructuralInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#extension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension(Scala3ParserParser.ExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#extMethods_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtMethods_(Scala3ParserParser.ExtMethods_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#extMethods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtMethods(Scala3ParserParser.ExtMethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#extMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtMethod(Scala3ParserParser.ExtMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(Scala3ParserParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#inheritClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritClauses(Scala3ParserParser.InheritClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#constrApps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrApps(Scala3ParserParser.ConstrAppsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#constrApp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrApp(Scala3ParserParser.ConstrAppContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#constrExpr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrExpr_(Scala3ParserParser.ConstrExpr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#constrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrExpr(Scala3ParserParser.ConstrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#selfInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfInvocation(Scala3ParserParser.SelfInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#templateBody_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBody_(Scala3ParserParser.TemplateBody_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#withTemplateBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithTemplateBody(Scala3ParserParser.WithTemplateBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#templateBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBody(Scala3ParserParser.TemplateBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#templateStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStat(Scala3ParserParser.TemplateStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#selfType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfType(Scala3ParserParser.SelfTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#enumBody_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody_(Scala3ParserParser.EnumBody_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(Scala3ParserParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#enumStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumStat(Scala3ParserParser.EnumStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#enumCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumCase(Scala3ParserParser.EnumCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#topStats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopStats(Scala3ParserParser.TopStatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#topStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopStat(Scala3ParserParser.TopStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#packaging}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackaging(Scala3ParserParser.PackagingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#packageObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageObject(Scala3ParserParser.PackageObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link Scala3ParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(Scala3ParserParser.CompilationUnitContext ctx);
}