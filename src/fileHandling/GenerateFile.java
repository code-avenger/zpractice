package fileHandling;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GenerateFile {

	public static void main(String[] args) {
		String text = "Hello world";
		BufferedWriter output = null;
		FileWriter fout = null;
		File file = null;
		PrintWriter oprint = null;

		try {
			file = new File("C:/sudeep/POC/zpractice/src/file/example2.txt");
			boolean b = file.createNewFile();
			if (b) {
				fout = new FileWriter(file);
				oprint = new PrintWriter(fout);
				oprint.println(text);
				System.out.println("done");
			} else {
				System.out.println("no");
			}
			// fout.write(text);
			// output = new BufferedWriter(new FileWriter(file));
			// output.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				fout.close();
				oprint.close();

			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
