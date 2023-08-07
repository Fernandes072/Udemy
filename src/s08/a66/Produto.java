package s08.a66;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		setNome(nome);
		setPreco(preco);
		setQuantidade(quantidade);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void adicionar(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void remover(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return "Produto: " + nome + " / " + String.format("%.2f", preco) + " / " + quantidade + " / " + String.format("%.2f", preco*quantidade);
	}
}