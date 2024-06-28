// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Scala3ParserParser}.
 */
public interface Scala3ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#simpleLiteral}.
	 * @param ctx the parse tree
	 */
	void enterSimpleLiteral(Scala3ParserParser.SimpleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#simpleLiteral}.
	 * @param ctx the parse tree
	 */
	void exitSimpleLiteral(Scala3ParserParser.SimpleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Scala3ParserParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Scala3ParserParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#qualId}.
	 * @param ctx the parse tree
	 */
	void enterQualId(Scala3ParserParser.QualIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#qualId}.
	 * @param ctx the parse tree
	 */
	void exitQualId(Scala3ParserParser.QualIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(Scala3ParserParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(Scala3ParserParser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#simpleRef}.
	 * @param ctx the parse tree
	 */
	void enterSimpleRef(Scala3ParserParser.SimpleRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#simpleRef}.
	 * @param ctx the parse tree
	 */
	void exitSimpleRef(Scala3ParserParser.SimpleRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#classQualifier}.
	 * @param ctx the parse tree
	 */
	void enterClassQualifier(Scala3ParserParser.ClassQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#classQualifier}.
	 * @param ctx the parse tree
	 */
	void exitClassQualifier(Scala3ParserParser.ClassQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Scala3ParserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Scala3ParserParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#funType}.
	 * @param ctx the parse tree
	 */
	void enterFunType(Scala3ParserParser.FunTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#funType}.
	 * @param ctx the parse tree
	 */
	void exitFunType(Scala3ParserParser.FunTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#funTypeArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunTypeArgs(Scala3ParserParser.FunTypeArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#funTypeArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunTypeArgs(Scala3ParserParser.FunTypeArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#funParamClause}.
	 * @param ctx the parse tree
	 */
	void enterFunParamClause(Scala3ParserParser.FunParamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#funParamClause}.
	 * @param ctx the parse tree
	 */
	void exitFunParamClause(Scala3ParserParser.FunParamClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#typedFunParam}.
	 * @param ctx the parse tree
	 */
	void enterTypedFunParam(Scala3ParserParser.TypedFunParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#typedFunParam}.
	 * @param ctx the parse tree
	 */
	void exitTypedFunParam(Scala3ParserParser.TypedFunParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#matchType}.
	 * @param ctx the parse tree
	 */
	void enterMatchType(Scala3ParserParser.MatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#matchType}.
	 * @param ctx the parse tree
	 */
	void exitMatchType(Scala3ParserParser.MatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#infixType}.
	 * @param ctx the parse tree
	 */
	void enterInfixType(Scala3ParserParser.InfixTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#infixType}.
	 * @param ctx the parse tree
	 */
	void exitInfixType(Scala3ParserParser.InfixTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#refinedType}.
	 * @param ctx the parse tree
	 */
	void enterRefinedType(Scala3ParserParser.RefinedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#refinedType}.
	 * @param ctx the parse tree
	 */
	void exitRefinedType(Scala3ParserParser.RefinedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#annotType}.
	 * @param ctx the parse tree
	 */
	void enterAnnotType(Scala3ParserParser.AnnotTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#annotType}.
	 * @param ctx the parse tree
	 */
	void exitAnnotType(Scala3ParserParser.AnnotTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(Scala3ParserParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(Scala3ParserParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#simpleType1}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType1(Scala3ParserParser.SimpleType1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#simpleType1}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType1(Scala3ParserParser.SimpleType1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#singleton}.
	 * @param ctx the parse tree
	 */
	void enterSingleton(Scala3ParserParser.SingletonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#singleton}.
	 * @param ctx the parse tree
	 */
	void exitSingleton(Scala3ParserParser.SingletonContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#funArgType}.
	 * @param ctx the parse tree
	 */
	void enterFunArgType(Scala3ParserParser.FunArgTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#funArgType}.
	 * @param ctx the parse tree
	 */
	void exitFunArgType(Scala3ParserParser.FunArgTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#funArgTypes}.
	 * @param ctx the parse tree
	 */
	void enterFunArgTypes(Scala3ParserParser.FunArgTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#funArgTypes}.
	 * @param ctx the parse tree
	 */
	void exitFunArgTypes(Scala3ParserParser.FunArgTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#paramType}.
	 * @param ctx the parse tree
	 */
	void enterParamType(Scala3ParserParser.ParamTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#paramType}.
	 * @param ctx the parse tree
	 */
	void exitParamType(Scala3ParserParser.ParamTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#paramValueType}.
	 * @param ctx the parse tree
	 */
	void enterParamValueType(Scala3ParserParser.ParamValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#paramValueType}.
	 * @param ctx the parse tree
	 */
	void exitParamValueType(Scala3ParserParser.ParamValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#typeArgs}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgs(Scala3ParserParser.TypeArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#typeArgs}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgs(Scala3ParserParser.TypeArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#refinement_}.
	 * @param ctx the parse tree
	 */
	void enterRefinement_(Scala3ParserParser.Refinement_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#refinement_}.
	 * @param ctx the parse tree
	 */
	void exitRefinement_(Scala3ParserParser.Refinement_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#refinement}.
	 * @param ctx the parse tree
	 */
	void enterRefinement(Scala3ParserParser.RefinementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#refinement}.
	 * @param ctx the parse tree
	 */
	void exitRefinement(Scala3ParserParser.RefinementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#typeBounds}.
	 * @param ctx the parse tree
	 */
	void enterTypeBounds(Scala3ParserParser.TypeBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#typeBounds}.
	 * @param ctx the parse tree
	 */
	void exitTypeBounds(Scala3ParserParser.TypeBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#typeParamBounds}.
	 * @param ctx the parse tree
	 */
	void enterTypeParamBounds(Scala3ParserParser.TypeParamBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#typeParamBounds}.
	 * @param ctx the parse tree
	 */
	void exitTypeParamBounds(Scala3ParserParser.TypeParamBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(Scala3ParserParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(Scala3ParserParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Scala3ParserParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Scala3ParserParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#blockResult}.
	 * @param ctx the parse tree
	 */
	void enterBlockResult(Scala3ParserParser.BlockResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#blockResult}.
	 * @param ctx the parse tree
	 */
	void exitBlockResult(Scala3ParserParser.BlockResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#funParams}.
	 * @param ctx the parse tree
	 */
	void enterFunParams(Scala3ParserParser.FunParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#funParams}.
	 * @param ctx the parse tree
	 */
	void exitFunParams(Scala3ParserParser.FunParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(Scala3ParserParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(Scala3ParserParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#ascription}.
	 * @param ctx the parse tree
	 */
	void enterAscription(Scala3ParserParser.AscriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#ascription}.
	 * @param ctx the parse tree
	 */
	void exitAscription(Scala3ParserParser.AscriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(Scala3ParserParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(Scala3ParserParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(Scala3ParserParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(Scala3ParserParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#infixExpr}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpr(Scala3ParserParser.InfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#infixExpr}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpr(Scala3ParserParser.InfixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#matchClause}.
	 * @param ctx the parse tree
	 */
	void enterMatchClause(Scala3ParserParser.MatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#matchClause}.
	 * @param ctx the parse tree
	 */
	void exitMatchClause(Scala3ParserParser.MatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#prefixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpr(Scala3ParserParser.PrefixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#prefixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpr(Scala3ParserParser.PrefixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperator(Scala3ParserParser.PrefixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperator(Scala3ParserParser.PrefixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(Scala3ParserParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(Scala3ParserParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#colonArgument}.
	 * @param ctx the parse tree
	 */
	void enterColonArgument(Scala3ParserParser.ColonArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#colonArgument}.
	 * @param ctx the parse tree
	 */
	void exitColonArgument(Scala3ParserParser.ColonArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#lambdaStart}.
	 * @param ctx the parse tree
	 */
	void enterLambdaStart(Scala3ParserParser.LambdaStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#lambdaStart}.
	 * @param ctx the parse tree
	 */
	void exitLambdaStart(Scala3ParserParser.LambdaStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#quoted}.
	 * @param ctx the parse tree
	 */
	void enterQuoted(Scala3ParserParser.QuotedContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#quoted}.
	 * @param ctx the parse tree
	 */
	void exitQuoted(Scala3ParserParser.QuotedContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#exprSplice}.
	 * @param ctx the parse tree
	 */
	void enterExprSplice(Scala3ParserParser.ExprSpliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#exprSplice}.
	 * @param ctx the parse tree
	 */
	void exitExprSplice(Scala3ParserParser.ExprSpliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#typeSplice}.
	 * @param ctx the parse tree
	 */
	void enterTypeSplice(Scala3ParserParser.TypeSpliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#typeSplice}.
	 * @param ctx the parse tree
	 */
	void exitTypeSplice(Scala3ParserParser.TypeSpliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#exprsInParens}.
	 * @param ctx the parse tree
	 */
	void enterExprsInParens(Scala3ParserParser.ExprsInParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#exprsInParens}.
	 * @param ctx the parse tree
	 */
	void exitExprsInParens(Scala3ParserParser.ExprsInParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#exprInParens}.
	 * @param ctx the parse tree
	 */
	void enterExprInParens(Scala3ParserParser.ExprInParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#exprInParens}.
	 * @param ctx the parse tree
	 */
	void exitExprInParens(Scala3ParserParser.ExprInParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#parArgumentExprs}.
	 * @param ctx the parse tree
	 */
	void enterParArgumentExprs(Scala3ParserParser.ParArgumentExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#parArgumentExprs}.
	 * @param ctx the parse tree
	 */
	void exitParArgumentExprs(Scala3ParserParser.ParArgumentExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#argumentExprs}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExprs(Scala3ParserParser.ArgumentExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#argumentExprs}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExprs(Scala3ParserParser.ArgumentExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#blockExpr_}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpr_(Scala3ParserParser.BlockExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#blockExpr_}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpr_(Scala3ParserParser.BlockExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#blockExpr}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpr(Scala3ParserParser.BlockExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#blockExpr}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpr(Scala3ParserParser.BlockExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Scala3ParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Scala3ParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#blockStat}.
	 * @param ctx the parse tree
	 */
	void enterBlockStat(Scala3ParserParser.BlockStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#blockStat}.
	 * @param ctx the parse tree
	 */
	void exitBlockStat(Scala3ParserParser.BlockStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#typeBlock}.
	 * @param ctx the parse tree
	 */
	void enterTypeBlock(Scala3ParserParser.TypeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#typeBlock}.
	 * @param ctx the parse tree
	 */
	void exitTypeBlock(Scala3ParserParser.TypeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#typeBlockStat}.
	 * @param ctx the parse tree
	 */
	void enterTypeBlockStat(Scala3ParserParser.TypeBlockStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#typeBlockStat}.
	 * @param ctx the parse tree
	 */
	void exitTypeBlockStat(Scala3ParserParser.TypeBlockStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#forExpr}.
	 * @param ctx the parse tree
	 */
	void enterForExpr(Scala3ParserParser.ForExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#forExpr}.
	 * @param ctx the parse tree
	 */
	void exitForExpr(Scala3ParserParser.ForExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#enumerators0}.
	 * @param ctx the parse tree
	 */
	void enterEnumerators0(Scala3ParserParser.Enumerators0Context ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#enumerators0}.
	 * @param ctx the parse tree
	 */
	void exitEnumerators0(Scala3ParserParser.Enumerators0Context ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#enumerators}.
	 * @param ctx the parse tree
	 */
	void enterEnumerators(Scala3ParserParser.EnumeratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#enumerators}.
	 * @param ctx the parse tree
	 */
	void exitEnumerators(Scala3ParserParser.EnumeratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(Scala3ParserParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(Scala3ParserParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#generator}.
	 * @param ctx the parse tree
	 */
	void enterGenerator(Scala3ParserParser.GeneratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#generator}.
	 * @param ctx the parse tree
	 */
	void exitGenerator(Scala3ParserParser.GeneratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(Scala3ParserParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(Scala3ParserParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void enterCaseClauses(Scala3ParserParser.CaseClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void exitCaseClauses(Scala3ParserParser.CaseClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(Scala3ParserParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(Scala3ParserParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#exprCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseClause(Scala3ParserParser.ExprCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#exprCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseClause(Scala3ParserParser.ExprCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#typeCaseClauses}.
	 * @param ctx the parse tree
	 */
	void enterTypeCaseClauses(Scala3ParserParser.TypeCaseClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#typeCaseClauses}.
	 * @param ctx the parse tree
	 */
	void exitTypeCaseClauses(Scala3ParserParser.TypeCaseClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#typeCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterTypeCaseClause(Scala3ParserParser.TypeCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#typeCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitTypeCaseClause(Scala3ParserParser.TypeCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(Scala3ParserParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(Scala3ParserParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#pattern1}.
	 * @param ctx the parse tree
	 */
	void enterPattern1(Scala3ParserParser.Pattern1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#pattern1}.
	 * @param ctx the parse tree
	 */
	void exitPattern1(Scala3ParserParser.Pattern1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#pattern2}.
	 * @param ctx the parse tree
	 */
	void enterPattern2(Scala3ParserParser.Pattern2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#pattern2}.
	 * @param ctx the parse tree
	 */
	void exitPattern2(Scala3ParserParser.Pattern2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#infixPattern}.
	 * @param ctx the parse tree
	 */
	void enterInfixPattern(Scala3ParserParser.InfixPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#infixPattern}.
	 * @param ctx the parse tree
	 */
	void exitInfixPattern(Scala3ParserParser.InfixPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#simplePattern}.
	 * @param ctx the parse tree
	 */
	void enterSimplePattern(Scala3ParserParser.SimplePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#simplePattern}.
	 * @param ctx the parse tree
	 */
	void exitSimplePattern(Scala3ParserParser.SimplePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#simplePattern1}.
	 * @param ctx the parse tree
	 */
	void enterSimplePattern1(Scala3ParserParser.SimplePattern1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#simplePattern1}.
	 * @param ctx the parse tree
	 */
	void exitSimplePattern1(Scala3ParserParser.SimplePattern1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#patVar}.
	 * @param ctx the parse tree
	 */
	void enterPatVar(Scala3ParserParser.PatVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#patVar}.
	 * @param ctx the parse tree
	 */
	void exitPatVar(Scala3ParserParser.PatVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#patterns}.
	 * @param ctx the parse tree
	 */
	void enterPatterns(Scala3ParserParser.PatternsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#patterns}.
	 * @param ctx the parse tree
	 */
	void exitPatterns(Scala3ParserParser.PatternsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#argumentPatterns}.
	 * @param ctx the parse tree
	 */
	void enterArgumentPatterns(Scala3ParserParser.ArgumentPatternsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#argumentPatterns}.
	 * @param ctx the parse tree
	 */
	void exitArgumentPatterns(Scala3ParserParser.ArgumentPatternsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#clsTypeParamClause}.
	 * @param ctx the parse tree
	 */
	void enterClsTypeParamClause(Scala3ParserParser.ClsTypeParamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#clsTypeParamClause}.
	 * @param ctx the parse tree
	 */
	void exitClsTypeParamClause(Scala3ParserParser.ClsTypeParamClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#clsTypeParam}.
	 * @param ctx the parse tree
	 */
	void enterClsTypeParam(Scala3ParserParser.ClsTypeParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#clsTypeParam}.
	 * @param ctx the parse tree
	 */
	void exitClsTypeParam(Scala3ParserParser.ClsTypeParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#typTypeParamClause}.
	 * @param ctx the parse tree
	 */
	void enterTypTypeParamClause(Scala3ParserParser.TypTypeParamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#typTypeParamClause}.
	 * @param ctx the parse tree
	 */
	void exitTypTypeParamClause(Scala3ParserParser.TypTypeParamClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#typTypeParam}.
	 * @param ctx the parse tree
	 */
	void enterTypTypeParam(Scala3ParserParser.TypTypeParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#typTypeParam}.
	 * @param ctx the parse tree
	 */
	void exitTypTypeParam(Scala3ParserParser.TypTypeParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#hkTypeParamClause}.
	 * @param ctx the parse tree
	 */
	void enterHkTypeParamClause(Scala3ParserParser.HkTypeParamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#hkTypeParamClause}.
	 * @param ctx the parse tree
	 */
	void exitHkTypeParamClause(Scala3ParserParser.HkTypeParamClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#hkTypeParam}.
	 * @param ctx the parse tree
	 */
	void enterHkTypeParam(Scala3ParserParser.HkTypeParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#hkTypeParam}.
	 * @param ctx the parse tree
	 */
	void exitHkTypeParam(Scala3ParserParser.HkTypeParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#clsParamClauses}.
	 * @param ctx the parse tree
	 */
	void enterClsParamClauses(Scala3ParserParser.ClsParamClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#clsParamClauses}.
	 * @param ctx the parse tree
	 */
	void exitClsParamClauses(Scala3ParserParser.ClsParamClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#clsParamClause}.
	 * @param ctx the parse tree
	 */
	void enterClsParamClause(Scala3ParserParser.ClsParamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#clsParamClause}.
	 * @param ctx the parse tree
	 */
	void exitClsParamClause(Scala3ParserParser.ClsParamClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#clsParams}.
	 * @param ctx the parse tree
	 */
	void enterClsParams(Scala3ParserParser.ClsParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#clsParams}.
	 * @param ctx the parse tree
	 */
	void exitClsParams(Scala3ParserParser.ClsParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#clsParam}.
	 * @param ctx the parse tree
	 */
	void enterClsParam(Scala3ParserParser.ClsParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#clsParam}.
	 * @param ctx the parse tree
	 */
	void exitClsParam(Scala3ParserParser.ClsParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#defParamClauses}.
	 * @param ctx the parse tree
	 */
	void enterDefParamClauses(Scala3ParserParser.DefParamClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#defParamClauses}.
	 * @param ctx the parse tree
	 */
	void exitDefParamClauses(Scala3ParserParser.DefParamClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#defParamClause}.
	 * @param ctx the parse tree
	 */
	void enterDefParamClause(Scala3ParserParser.DefParamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#defParamClause}.
	 * @param ctx the parse tree
	 */
	void exitDefParamClause(Scala3ParserParser.DefParamClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#typelessClauses}.
	 * @param ctx the parse tree
	 */
	void enterTypelessClauses(Scala3ParserParser.TypelessClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#typelessClauses}.
	 * @param ctx the parse tree
	 */
	void exitTypelessClauses(Scala3ParserParser.TypelessClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#typelessClause}.
	 * @param ctx the parse tree
	 */
	void enterTypelessClause(Scala3ParserParser.TypelessClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#typelessClause}.
	 * @param ctx the parse tree
	 */
	void exitTypelessClause(Scala3ParserParser.TypelessClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#defTypeParamClause}.
	 * @param ctx the parse tree
	 */
	void enterDefTypeParamClause(Scala3ParserParser.DefTypeParamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#defTypeParamClause}.
	 * @param ctx the parse tree
	 */
	void exitDefTypeParamClause(Scala3ParserParser.DefTypeParamClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#defTypeParam}.
	 * @param ctx the parse tree
	 */
	void enterDefTypeParam(Scala3ParserParser.DefTypeParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#defTypeParam}.
	 * @param ctx the parse tree
	 */
	void exitDefTypeParam(Scala3ParserParser.DefTypeParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#defTermParamClause}.
	 * @param ctx the parse tree
	 */
	void enterDefTermParamClause(Scala3ParserParser.DefTermParamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#defTermParamClause}.
	 * @param ctx the parse tree
	 */
	void exitDefTermParamClause(Scala3ParserParser.DefTermParamClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#usingParamClause}.
	 * @param ctx the parse tree
	 */
	void enterUsingParamClause(Scala3ParserParser.UsingParamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#usingParamClause}.
	 * @param ctx the parse tree
	 */
	void exitUsingParamClause(Scala3ParserParser.UsingParamClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#defImplicitClause}.
	 * @param ctx the parse tree
	 */
	void enterDefImplicitClause(Scala3ParserParser.DefImplicitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#defImplicitClause}.
	 * @param ctx the parse tree
	 */
	void exitDefImplicitClause(Scala3ParserParser.DefImplicitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#defTermParams}.
	 * @param ctx the parse tree
	 */
	void enterDefTermParams(Scala3ParserParser.DefTermParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#defTermParams}.
	 * @param ctx the parse tree
	 */
	void exitDefTermParams(Scala3ParserParser.DefTermParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#defTermParam}.
	 * @param ctx the parse tree
	 */
	void enterDefTermParam(Scala3ParserParser.DefTermParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#defTermParam}.
	 * @param ctx the parse tree
	 */
	void exitDefTermParam(Scala3ParserParser.DefTermParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(Scala3ParserParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(Scala3ParserParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#bindings}.
	 * @param ctx the parse tree
	 */
	void enterBindings(Scala3ParserParser.BindingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#bindings}.
	 * @param ctx the parse tree
	 */
	void exitBindings(Scala3ParserParser.BindingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(Scala3ParserParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(Scala3ParserParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(Scala3ParserParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(Scala3ParserParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#localModifier}.
	 * @param ctx the parse tree
	 */
	void enterLocalModifier(Scala3ParserParser.LocalModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#localModifier}.
	 * @param ctx the parse tree
	 */
	void exitLocalModifier(Scala3ParserParser.LocalModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(Scala3ParserParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(Scala3ParserParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#accessQualifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessQualifier(Scala3ParserParser.AccessQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#accessQualifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessQualifier(Scala3ParserParser.AccessQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(Scala3ParserParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(Scala3ParserParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#import_}.
	 * @param ctx the parse tree
	 */
	void enterImport_(Scala3ParserParser.Import_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#import_}.
	 * @param ctx the parse tree
	 */
	void exitImport_(Scala3ParserParser.Import_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(Scala3ParserParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(Scala3ParserParser.ExportContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#importExpr}.
	 * @param ctx the parse tree
	 */
	void enterImportExpr(Scala3ParserParser.ImportExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#importExpr}.
	 * @param ctx the parse tree
	 */
	void exitImportExpr(Scala3ParserParser.ImportExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#importSpec}.
	 * @param ctx the parse tree
	 */
	void enterImportSpec(Scala3ParserParser.ImportSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#importSpec}.
	 * @param ctx the parse tree
	 */
	void exitImportSpec(Scala3ParserParser.ImportSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#namedSelector}.
	 * @param ctx the parse tree
	 */
	void enterNamedSelector(Scala3ParserParser.NamedSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#namedSelector}.
	 * @param ctx the parse tree
	 */
	void exitNamedSelector(Scala3ParserParser.NamedSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#wildCardSelector}.
	 * @param ctx the parse tree
	 */
	void enterWildCardSelector(Scala3ParserParser.WildCardSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#wildCardSelector}.
	 * @param ctx the parse tree
	 */
	void exitWildCardSelector(Scala3ParserParser.WildCardSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#importSelectors}.
	 * @param ctx the parse tree
	 */
	void enterImportSelectors(Scala3ParserParser.ImportSelectorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#importSelectors}.
	 * @param ctx the parse tree
	 */
	void exitImportSelectors(Scala3ParserParser.ImportSelectorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#endMarker}.
	 * @param ctx the parse tree
	 */
	void enterEndMarker(Scala3ParserParser.EndMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#endMarker}.
	 * @param ctx the parse tree
	 */
	void exitEndMarker(Scala3ParserParser.EndMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#endMarkerTag}.
	 * @param ctx the parse tree
	 */
	void enterEndMarkerTag(Scala3ParserParser.EndMarkerTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#endMarkerTag}.
	 * @param ctx the parse tree
	 */
	void exitEndMarkerTag(Scala3ParserParser.EndMarkerTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#refineDcl}.
	 * @param ctx the parse tree
	 */
	void enterRefineDcl(Scala3ParserParser.RefineDclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#refineDcl}.
	 * @param ctx the parse tree
	 */
	void exitRefineDcl(Scala3ParserParser.RefineDclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#valDcl}.
	 * @param ctx the parse tree
	 */
	void enterValDcl(Scala3ParserParser.ValDclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#valDcl}.
	 * @param ctx the parse tree
	 */
	void exitValDcl(Scala3ParserParser.ValDclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#defDcl}.
	 * @param ctx the parse tree
	 */
	void enterDefDcl(Scala3ParserParser.DefDclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#defDcl}.
	 * @param ctx the parse tree
	 */
	void exitDefDcl(Scala3ParserParser.DefDclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(Scala3ParserParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(Scala3ParserParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#patDef}.
	 * @param ctx the parse tree
	 */
	void enterPatDef(Scala3ParserParser.PatDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#patDef}.
	 * @param ctx the parse tree
	 */
	void exitPatDef(Scala3ParserParser.PatDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#defDef}.
	 * @param ctx the parse tree
	 */
	void enterDefDef(Scala3ParserParser.DefDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#defDef}.
	 * @param ctx the parse tree
	 */
	void exitDefDef(Scala3ParserParser.DefDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#defSig}.
	 * @param ctx the parse tree
	 */
	void enterDefSig(Scala3ParserParser.DefSigContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#defSig}.
	 * @param ctx the parse tree
	 */
	void exitDefSig(Scala3ParserParser.DefSigContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeDef(Scala3ParserParser.TypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeDef(Scala3ParserParser.TypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#tmplDef}.
	 * @param ctx the parse tree
	 */
	void enterTmplDef(Scala3ParserParser.TmplDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#tmplDef}.
	 * @param ctx the parse tree
	 */
	void exitTmplDef(Scala3ParserParser.TmplDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(Scala3ParserParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(Scala3ParserParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#classConstr}.
	 * @param ctx the parse tree
	 */
	void enterClassConstr(Scala3ParserParser.ClassConstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#classConstr}.
	 * @param ctx the parse tree
	 */
	void exitClassConstr(Scala3ParserParser.ClassConstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#constrMods}.
	 * @param ctx the parse tree
	 */
	void enterConstrMods(Scala3ParserParser.ConstrModsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#constrMods}.
	 * @param ctx the parse tree
	 */
	void exitConstrMods(Scala3ParserParser.ConstrModsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#objectDef}.
	 * @param ctx the parse tree
	 */
	void enterObjectDef(Scala3ParserParser.ObjectDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#objectDef}.
	 * @param ctx the parse tree
	 */
	void exitObjectDef(Scala3ParserParser.ObjectDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#enumDef}.
	 * @param ctx the parse tree
	 */
	void enterEnumDef(Scala3ParserParser.EnumDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#enumDef}.
	 * @param ctx the parse tree
	 */
	void exitEnumDef(Scala3ParserParser.EnumDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#givenDef}.
	 * @param ctx the parse tree
	 */
	void enterGivenDef(Scala3ParserParser.GivenDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#givenDef}.
	 * @param ctx the parse tree
	 */
	void exitGivenDef(Scala3ParserParser.GivenDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#givenSig}.
	 * @param ctx the parse tree
	 */
	void enterGivenSig(Scala3ParserParser.GivenSigContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#givenSig}.
	 * @param ctx the parse tree
	 */
	void exitGivenSig(Scala3ParserParser.GivenSigContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#structuralInstance}.
	 * @param ctx the parse tree
	 */
	void enterStructuralInstance(Scala3ParserParser.StructuralInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#structuralInstance}.
	 * @param ctx the parse tree
	 */
	void exitStructuralInstance(Scala3ParserParser.StructuralInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#extension}.
	 * @param ctx the parse tree
	 */
	void enterExtension(Scala3ParserParser.ExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#extension}.
	 * @param ctx the parse tree
	 */
	void exitExtension(Scala3ParserParser.ExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#extMethods_}.
	 * @param ctx the parse tree
	 */
	void enterExtMethods_(Scala3ParserParser.ExtMethods_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#extMethods_}.
	 * @param ctx the parse tree
	 */
	void exitExtMethods_(Scala3ParserParser.ExtMethods_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#extMethods}.
	 * @param ctx the parse tree
	 */
	void enterExtMethods(Scala3ParserParser.ExtMethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#extMethods}.
	 * @param ctx the parse tree
	 */
	void exitExtMethods(Scala3ParserParser.ExtMethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#extMethod}.
	 * @param ctx the parse tree
	 */
	void enterExtMethod(Scala3ParserParser.ExtMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#extMethod}.
	 * @param ctx the parse tree
	 */
	void exitExtMethod(Scala3ParserParser.ExtMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(Scala3ParserParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(Scala3ParserParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#inheritClauses}.
	 * @param ctx the parse tree
	 */
	void enterInheritClauses(Scala3ParserParser.InheritClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#inheritClauses}.
	 * @param ctx the parse tree
	 */
	void exitInheritClauses(Scala3ParserParser.InheritClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#constrApps}.
	 * @param ctx the parse tree
	 */
	void enterConstrApps(Scala3ParserParser.ConstrAppsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#constrApps}.
	 * @param ctx the parse tree
	 */
	void exitConstrApps(Scala3ParserParser.ConstrAppsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#constrApp}.
	 * @param ctx the parse tree
	 */
	void enterConstrApp(Scala3ParserParser.ConstrAppContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#constrApp}.
	 * @param ctx the parse tree
	 */
	void exitConstrApp(Scala3ParserParser.ConstrAppContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#constrExpr_}.
	 * @param ctx the parse tree
	 */
	void enterConstrExpr_(Scala3ParserParser.ConstrExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#constrExpr_}.
	 * @param ctx the parse tree
	 */
	void exitConstrExpr_(Scala3ParserParser.ConstrExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#constrExpr}.
	 * @param ctx the parse tree
	 */
	void enterConstrExpr(Scala3ParserParser.ConstrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#constrExpr}.
	 * @param ctx the parse tree
	 */
	void exitConstrExpr(Scala3ParserParser.ConstrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#selfInvocation}.
	 * @param ctx the parse tree
	 */
	void enterSelfInvocation(Scala3ParserParser.SelfInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#selfInvocation}.
	 * @param ctx the parse tree
	 */
	void exitSelfInvocation(Scala3ParserParser.SelfInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#templateBody_}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBody_(Scala3ParserParser.TemplateBody_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#templateBody_}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBody_(Scala3ParserParser.TemplateBody_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#withTemplateBody}.
	 * @param ctx the parse tree
	 */
	void enterWithTemplateBody(Scala3ParserParser.WithTemplateBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#withTemplateBody}.
	 * @param ctx the parse tree
	 */
	void exitWithTemplateBody(Scala3ParserParser.WithTemplateBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#templateBody}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBody(Scala3ParserParser.TemplateBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#templateBody}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBody(Scala3ParserParser.TemplateBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#templateStat}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStat(Scala3ParserParser.TemplateStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#templateStat}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStat(Scala3ParserParser.TemplateStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#selfType}.
	 * @param ctx the parse tree
	 */
	void enterSelfType(Scala3ParserParser.SelfTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#selfType}.
	 * @param ctx the parse tree
	 */
	void exitSelfType(Scala3ParserParser.SelfTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#enumBody_}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody_(Scala3ParserParser.EnumBody_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#enumBody_}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody_(Scala3ParserParser.EnumBody_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(Scala3ParserParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(Scala3ParserParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#enumStat}.
	 * @param ctx the parse tree
	 */
	void enterEnumStat(Scala3ParserParser.EnumStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#enumStat}.
	 * @param ctx the parse tree
	 */
	void exitEnumStat(Scala3ParserParser.EnumStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#enumCase}.
	 * @param ctx the parse tree
	 */
	void enterEnumCase(Scala3ParserParser.EnumCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#enumCase}.
	 * @param ctx the parse tree
	 */
	void exitEnumCase(Scala3ParserParser.EnumCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#topStats}.
	 * @param ctx the parse tree
	 */
	void enterTopStats(Scala3ParserParser.TopStatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#topStats}.
	 * @param ctx the parse tree
	 */
	void exitTopStats(Scala3ParserParser.TopStatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#topStat}.
	 * @param ctx the parse tree
	 */
	void enterTopStat(Scala3ParserParser.TopStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#topStat}.
	 * @param ctx the parse tree
	 */
	void exitTopStat(Scala3ParserParser.TopStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#packaging}.
	 * @param ctx the parse tree
	 */
	void enterPackaging(Scala3ParserParser.PackagingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#packaging}.
	 * @param ctx the parse tree
	 */
	void exitPackaging(Scala3ParserParser.PackagingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#packageObject}.
	 * @param ctx the parse tree
	 */
	void enterPackageObject(Scala3ParserParser.PackageObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#packageObject}.
	 * @param ctx the parse tree
	 */
	void exitPackageObject(Scala3ParserParser.PackageObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link Scala3ParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(Scala3ParserParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Scala3ParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(Scala3ParserParser.CompilationUnitContext ctx);
}