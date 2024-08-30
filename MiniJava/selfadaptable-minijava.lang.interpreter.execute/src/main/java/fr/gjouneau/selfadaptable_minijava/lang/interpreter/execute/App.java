package fr.gjouneau.selfadaptable_minijava.lang.interpreter.execute;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import miniJava.interpreter.miniJava.MiniJavaPackage;
import miniJava.interpreter.miniJava.Program;

public class App 
{
	
	static public String program;
	static private Program minijavaProgram;
	
    public static void main( String[] args )
    {
    	program = args[0];
    	
    	String resultPath = "";

		boolean isBench = program.startsWith("-");
		char typeBench = program.charAt(1);
		
		if (isBench) {
			resultPath = args[1];
			program = args[2];
		}
    	
    	
    	if(program.endsWith(".xmi")) {
    		loadXMI();
    	} else {
//    		loadMiniJava();
    	}
    	
    	long start = System.currentTimeMillis();
		Object out = minijavaProgram.execute();;
		long end = System.currentTimeMillis();
		
		System.out.println(out);
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
    }
    
    public static void loadXMI() {
		EPackage.Registry.INSTANCE.put("http://www.example.org/minijava/MiniJava", MiniJavaPackage.eINSTANCE);
		final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		final Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

//		LogService.MUTE = false;

		final ResourceSetImpl resSet = new ResourceSetImpl();
		final URI createFileURI = URI.createFileURI(program);
		final Resource resource = resSet.getResource(createFileURI, true);
		

		minijavaProgram = (Program) resource.getContents().get(0);
		minijavaProgram.initialize(new BasicEList());
	}
    
//    public static void loadMiniJava() {
//    	Injector injector = new MiniJavaStandaloneSetup().createInjectorAndDoEMFRegistration();
//    	XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
//    	resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
//    	
//    	final URI createFileURI = URI.createFileURI(program);
//		final Resource resource = resourceSet.getResource(createFileURI, true);
//		
//    	minijavaProgram = (Program) resource.getContents().get(0);
//    	minijavaProgram.initialize(new BasicEList());
//    }
}
