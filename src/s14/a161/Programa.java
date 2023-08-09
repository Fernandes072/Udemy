package s14.a161;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.print("Digite a quantidade de funcionários: ");
		int qtd = ler.nextInt();
		System.out.println();
		for (int i = 1; i <= qtd; i++) {
			System.out.println("Dados funcionário " + i);
			System.out.print("Terceirizado (s/n): ");
			char tipo = ler.next().charAt(0);
			System.out.print("Nome: ");
			String nome = ler.next();
			System.out.print("Horas: ");
			int horas = ler.nextInt();
			System.out.print("Valor por hora: ");
			double valorHoras = ler.nextDouble();
			if (tipo == 's') {
				System.out.print("Despesa adicional: ");
				double despesa = ler.nextDouble();
				funcionarios.add(new FuncionarioTerceirizado(nome, horas, valorHoras, despesa));
			} else {
				funcionarios.add(new Funcionario(nome, horas, valorHoras));
			}
			System.out.println();
		}
		
		System.out.println("Pagamentos: ");
		for (Funcionario funcionario : funcionarios) {
			System.out.print(funcionario.getNome() + " - $ ");
			if (funcionario instanceof FuncionarioTerceirizado) {
				//FuncionarioTerceirizado funcio = (FuncionarioTerceirizado) funcionario;
				System.out.println(((FuncionarioTerceirizado) funcionario).pagamento());
			} else {
				System.out.println(funcionario.pagamento());
			}
		}
		
		ler.close();
	}

}
