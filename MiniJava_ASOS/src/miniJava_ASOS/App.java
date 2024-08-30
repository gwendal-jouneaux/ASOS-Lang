package miniJava_ASOS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import miniJava_ASOS.adaptations.modules.ApproximateLoopUnrollModule;
import miniJava_ASOS.interpreter.SelfAdaptiveMiniJava_ASOS;
import miniJava_ASOS.sd.SdFactory;
import miniJava_ASOS.sd.State;

public class App {

	private static String resultPath;
	private static SelfAdaptiveMiniJava_ASOS lang;
	private static Program theProgram;

	public static void main(String[] args) {

		resultPath = "";
		String filePath = args[0];

		boolean isBench = filePath.startsWith("-");
		char typeBench = filePath.charAt(1);
		
		if (isBench) {
			resultPath = args[1];
			filePath = args[2];
		}

		theProgram = loadXMI(filePath);
		lang = new SelfAdaptiveMiniJava_ASOS();
		lang.registerModule(new ApproximateLoopUnrollModule());
		
		if (typeBench == 'e') {
			lang.getAdaptationContext().invertTO();
		} else if (typeBench == 's') {
			//lang.getAdaptationContext().invertTO();
			lang.getAdaptationContext().sw = true;
		} 
		
		if (isBench) {
			benchmark();
		} else {
			run();
		}
	}
	
	public static Program loadXMI(String program) {
		EPackage.Registry.INSTANCE.put("http://www.example.org/miniJava_ASOS", MiniJava_ASOSPackage.eINSTANCE);
		final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		final Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		final ResourceSetImpl resSet = new ResourceSetImpl();
		final URI createFileURI = URI.createFileURI(program);
		final Resource resource = resSet.getResource(createFileURI, true);
		return (Program) resource.getContents().get(0);
	}

	public static Object benchmark() {
		State st = SdFactory.eINSTANCE.createState();
		st.pushFrame(null);
		long start = System.currentTimeMillis();
		Object out = theProgram.accept(lang.getVisitor(), st);
		long end = System.currentTimeMillis();
		
		long duration = end - start;
		String resultFilname = resultPath.substring(resultPath.lastIndexOf("/")+1);
		String filenamesplit = resultFilname.substring(0,resultFilname.lastIndexOf("."));
		String[] benchInfo = filenamesplit.split("_");
		
		try {
			File resultFile = new File(resultPath);
			resultFile.createNewFile();
			FileWriter fw = new FileWriter(resultFile, true);
		    BufferedWriter bw = new BufferedWriter(fw);
		    bw.write(benchInfo[1]+","+benchInfo[0]+","+benchInfo[2]+","+duration);
		    bw.newLine();
		    bw.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		return out;
	}

	public static Object run() {
		State st = SdFactory.eINSTANCE.createState();
		st.pushFrame(null);
		Object out = theProgram.accept(lang.getVisitor(), st);
		return out;
	}
}
