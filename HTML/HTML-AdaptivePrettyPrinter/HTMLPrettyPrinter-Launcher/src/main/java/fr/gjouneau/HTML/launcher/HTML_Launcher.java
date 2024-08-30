package fr.gjouneau.HTML.launcher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.PolyglotException;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import fr.gjouneau.HTML.nodes.HTMLNodeRoot;
import fr.gjouneau.HTML.parser.HTMLParser;

public final class HTML_Launcher {

    private static String resultPath = "";
    private static HTMLNodeRoot theProgram;

    /**
     * The main entry point.
     */
    public static void main(String[] args) throws IOException {
		String filePath = args[0];

		boolean isBench = filePath.startsWith("-");
		char typeBench = filePath.charAt(1);
		
		if (isBench) {
			resultPath = args[1];
			filePath = args[2];
		}
		
		String content = new String(Files.readAllBytes(Paths.get(filePath)));
		HTMLParser parser = new HTMLParser(content);
		theProgram = parser.parse();
		
		
		if (isBench) {
			benchmark();
		} else {
			run();
		}
    }

    public static Object benchmark() {
		long start = System.currentTimeMillis();
		Object out = theProgram.execute();
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
		String out = theProgram.execute();
		return out;
	}
}
