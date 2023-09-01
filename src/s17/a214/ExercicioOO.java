package s17.a214;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class ExercicioOO {

	public static void main(String[] args) {

		Collection<Produto> produtos = new ArrayList<Produto>();

		File in = new File("C:\\Users\\joaoz\\Downloads\\in.csv");
		File pasta = new File(in.getParent() + File.separator + "out");
		pasta.mkdirs();

		try (BufferedReader br = new BufferedReader(new FileReader(in));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(pasta.getAbsolutePath() + File.separator + "out.csv"))) {

			String linha = br.readLine();
			while (linha != null) {
				String[] info = linha.split(",");
				produtos.add(new Produto(info[0], Float.parseFloat(info[1]), Integer.parseInt(info[2])));
				linha = br.readLine();
			}

			for (Produto produto : produtos) {
				bw.write(produto.getNome() + "," + produto.getQuantidade() * produto.getValor());
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
