package s17.a214;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWriter {

	public static void main(String[] args) {

		String[] linhas = new String[] { "A", "B", "C" };
		String path = "C:\\Users\\joaoz\\Downloads\\teste1.txt";
		
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
