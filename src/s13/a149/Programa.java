package s13.a149;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Digite o nome no departamento: ");
		Departamento departamento = new Departamento(ler.next());
		System.out.println();
		System.out.println("Digite os dados do trabalhador");
		System.out.print("Digite o nome: ");
		String nome = ler.next();
		System.out.print("Digite o nível: ");
		NivelTrabalhador nivel = NivelTrabalhador.valueOf(ler.next());
		System.out.print("Digite o salário base: ");
		double salario = ler.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nome, nivel, salario, departamento);
		System.out.println();
		
		System.out.print("Quantos contratos: ");
		int qtd = ler.nextInt();
		for (int i = 1; i <= qtd; i++) {
			System.out.println("Digite os dados do contrato " + i);
			System.out.print("Digite a data do contrato: ");
			Date data = sdf.parse(ler.next());
			System.out.print("Digite o valor por hora: ");
			double valorHora = ler.nextDouble();
			System.out.print("Digite a duração em horas: ");
			int duracao = ler.nextInt();
			ContratoHora contrato = new ContratoHora(data, valorHora, duracao);
			trabalhador.AdicionarContrato(contrato);
			System.out.println();
		}

		System.out.print("Digite o mês e o ano: ");
		String novaData = ler.next();
		int mes = Integer.parseInt(novaData.substring(0, 2));
		int ano = Integer.parseInt(novaData.substring(3));
		System.out.println(trabalhador.getNome());
		System.out.println(trabalhador.getDepartamento().getNome());
		System.out.println(trabalhador.renda(ano, mes));

		ler.close();
	}

}
