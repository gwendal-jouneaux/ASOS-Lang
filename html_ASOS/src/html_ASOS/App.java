package html_ASOS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import html_ASOS.adaptations.modules.ConditionalLoadingModule;
import html_ASOS.interpreter.SelfAdaptiveHtml_ASOS;
import html_ASOS.sd.SdFactory;
import html_ASOS.sd.State;

public class App {
	private static String resultPath;
	private static SelfAdaptiveHtml_ASOS lang;
	private static HTMLNodeRoot theProgram;

	public static void main(String[] args) {

		resultPath = "";
		String filePath = args[0];

		boolean isBench = filePath.startsWith("-");
		char typeBench = filePath.charAt(1);
		
		if (isBench) {
			resultPath = args[1];
			filePath = args[2];
		}
		
		String content = "";
		try {
			content = new String(Files.readAllBytes(Paths.get(filePath)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HTMLParser parser = new HTMLParser(content);
		theProgram = parser.parse();
		lang = new SelfAdaptiveHtml_ASOS();
		lang.registerModule(new ConditionalLoadingModule());
		
		if (typeBench == 'e') {
			lang.getAdaptationContext().invertTO();
		} else if (typeBench == 's') {
			lang.getAdaptationContext().sw = true;
		} 
		
		if (isBench) {
			benchmark();
		} else {
			run();
		}
	}

	public static Object benchmark() {
		State st = SdFactory.eINSTANCE.createState();
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
		Object out = theProgram.accept(lang.getVisitor(), st);
		return out;
	}
}
