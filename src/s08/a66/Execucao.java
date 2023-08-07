package s08.a66;

import java.util.Scanner;

public class Execucao {
	
	private static Scanner sc;

	public static Produto novoProduto() {
		sc = new Scanner(System.in);
		
		System.out.println("Novo produto");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		Produto produto = new Produto(nome, preco, quantidade);
		return produto;
	}
	
	public static void adicionarQuantidade(Produto produto) {
		System.out.print("Adicionar quantidade: ");
		int qtd = sc.nextInt();
		produto.adicionar(qtd);
		System.out.println(produto);
	}
	
	public static void removerQuantidade(Produto produto) {
		System.out.print("Adicionar quantidade: ");
		int qtd = sc.nextInt();
		produto.remover(qtd);
		System.out.println(produto);
	}

	public static void main(String[] args) {
		
		Produto produto1 = novoProduto();
		System.out.println(produto1);

		adicionarQuantidade(produto1);
		
		removerQuantidade(produto1);
	}

}
