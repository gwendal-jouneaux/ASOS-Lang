package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.PrintStatementData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = PrintStatement.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class PrintStatementOp extends AdaptiveOperation<PrintStatement, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, PrintStatement node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		PrintStatementData data = new PrintStatementData(node);
		
		while(true){
			Object termination = null;
			PrintStatementData local_data = new PrintStatementData(node);
		
			boolean validPatternInput47 = true;
			if(validPatternInput47)
			{
				if(data.getcomputed_expression() == null){
					local_data.setcomputed_expression(((Node) node.getExpression()).accept(vis, execCtx));
					if(!(local_data.getcomputed_expression() instanceof Termination)){
						if(config.before_print_expr() != null){
							config.before_print_expr().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_print_expr() != null){
							config.specialize_print_expr().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_expression(local_data.getcomputed_expression());
						}
						
						if(config.after_print_expr() != null){
							if(result == null){
								config.after_print_expr().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_print_expr().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
							}
						}
						
						if(result != null){
							if (result instanceof Termination){
								return result;
							} else if(! ((EObject) result).eClass().getEPackage().equals(SdPackage.eINSTANCE)){
								return ((Node) result).accept(vis, execCtx);
							} else {
								return result;
							}
						} else {
							continue;
						}
					}
					else {
						termination = local_data.getcomputed_expression();
					}
				}
			}
			boolean validPatternInput48 = true && (data.getcomputed_expression() instanceof Value);
			if(validPatternInput48)
			{
				if(config.before_print_send() != null){
					config.before_print_send().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_print_send() != null){
					config.specialize_print_send().adapt(vis, node, execCtx, data, config);
				} else {
					NullValue nullValue3 = SdFactory.eINSTANCE.createNullValue();
					NullValue out = nullValue3;
					result = out;
					 // prelude
					((State) execCtx).println((Value) ((Value) data.getcomputed_expression()));
				}
				
				if(config.after_print_send() != null){
					if(result == null){
						config.after_print_send().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_print_send().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
					}
				}
				
				if(result != null){
					if (result instanceof Termination){
						return result;
					} else if(! ((EObject) result).eClass().getEPackage().equals(SdPackage.eINSTANCE)){
						return ((Node) result).accept(vis, execCtx);
					} else {
						return result;
					}
				} else {
					continue;
				}
			}
		
			return termination;
		}
	}
}
