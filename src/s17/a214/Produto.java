package s17.a214;

public class Produto {
	
	private String nome;
	private float valor;
	private int quantidade;
	
	public Produto() {
		
	}

	public Produto(String nome, float valor, int quantidade) {
		setNome(nome);
		setValor(valor);
		setQuantidade(quantidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}