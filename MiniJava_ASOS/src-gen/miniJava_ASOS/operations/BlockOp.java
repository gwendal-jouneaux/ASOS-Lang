package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.BlockData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = Block.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class BlockOp extends AdaptiveOperation<Block, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Block node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		BlockData data = new BlockData(node);
		
		while(true){
			Object termination = null;
			BlockData local_data = new BlockData(node);
		
			boolean validPatternInput44 = true && (node.getStatements() instanceof List && node.getStatements().size() > data.getindex_statements());
			if(validPatternInput44)
			{
				if(data.getcomputed_statements().get(data.getindex_statements()) == null){
					local_data.getcomputed_statements().set(data.getindex_statements(), (((Node) node.getStatements().get(data.getindex_statements())).accept(vis, execCtx)));
					if(!(local_data.getcomputed_statements().get(data.getindex_statements()) instanceof Termination)){
						if(config.before_block_eval() != null){
							config.before_block_eval().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_block_eval() != null){
							config.specialize_block_eval().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_statements(data.getindex_statements(),local_data.getcomputed_statements().get(data.getindex_statements()));
						}
						
						if(config.after_block_eval() != null){
							if(result == null){
								config.after_block_eval().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_block_eval().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_statements().get(data.getindex_statements());
					}
				}
			}
			boolean validPatternInput45 = true && (node.getStatements() instanceof List && node.getStatements().size() > data.getindex_statements()) && (data.getcomputed_statements().get(data.getindex_statements()) instanceof Value);
			if(validPatternInput45)
			{
				if(config.before_block_iter() != null){
					config.before_block_iter().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_block_iter() != null){
					config.specialize_block_iter().adapt(vis, node, execCtx, data, config);
				} else {
					data.incindex_statements();
				}
				
				if(config.after_block_iter() != null){
					if(result == null){
						config.after_block_iter().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_block_iter().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput46 = true && (node.getStatements() instanceof List && node.getStatements().size() <= data.getindex_statements());
			if(validPatternInput46)
			{
				if(config.before_block_end() != null){
					config.before_block_end().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_block_end() != null){
					config.specialize_block_end().adapt(vis, node, execCtx, data, config);
				} else {
					NullValue nullValue2 = SdFactory.eINSTANCE.createNullValue();
					NullValue out = nullValue2;
					result = out;
				}
				
				if(config.after_block_end() != null){
					if(result == null){
						config.after_block_end().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_block_end().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
