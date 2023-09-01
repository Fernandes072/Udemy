package s17.a214;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio {

	public static void main(String[] args) {

		File in = new File("C:\\Users\\joaoz\\Downloads\\in.csv");
		File pasta = new File(in.getParent() + File.separator + "out");
		pasta.mkdirs();
		try (BufferedReader br = new BufferedReader(new FileReader(in));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(pasta.getAbsolutePath() + File.separator + "out.csv"));) {
			String linha = br.readLine();
			while (linha != null) {
				bw.newLine();
				String[] conteudo = linha.split(",");
				bw.write(conteudo[0] + "," + Float.parseFloat(conteudo[1]) * Integer.parseInt(conteudo[2]));
				bw.newLine();
				linha = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
