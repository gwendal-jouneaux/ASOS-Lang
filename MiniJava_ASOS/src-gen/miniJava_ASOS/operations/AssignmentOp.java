package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.AssignmentData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = Assignment.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class AssignmentOp extends AdaptiveOperation<Assignment, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Assignment node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		AssignmentData data = new AssignmentData(node);
		
		while(true){
			Object termination = null;
			AssignmentData local_data = new AssignmentData(node);
		
			boolean validPatternInput79 = true;
			if(validPatternInput79)
			{
				if(data.getcomputed_value() == null){
					local_data.setcomputed_value(((Node) node.getValue()).accept(vis, execCtx));
					if(!(local_data.getcomputed_value() instanceof Termination)){
						if(config.before_assign_expr() != null){
							config.before_assign_expr().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_assign_expr() != null){
							config.specialize_assign_expr().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_value(local_data.getcomputed_value());
						}
						
						if(config.after_assign_expr() != null){
							if(result == null){
								config.after_assign_expr().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_assign_expr().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_value();
					}
				}
			}
			boolean validPatternInput80 = true && (data.getcomputed_value() instanceof Value);
			if(validPatternInput80)
			{
				if(config.before_assign_set_symbol() != null){
					config.before_assign_set_symbol().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_assign_set_symbol() != null){
					config.specialize_assign_set_symbol().adapt(vis, node, execCtx, data, config);
				} else {
					Object value = ((State) execCtx).setSymbolValue((Assignee) (data.getcomputed_assignee() == null ? node.getAssignee() : data.getcomputed_assignee()), (Value) ((Value) data.getcomputed_value()));
					NullValue nullValue8 = SdFactory.eINSTANCE.createNullValue();
					NullValue out = nullValue8;
					result = out;
				}
				
				if(config.after_assign_set_symbol() != null){
					if(result == null){
						config.after_assign_set_symbol().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_assign_set_symbol().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
