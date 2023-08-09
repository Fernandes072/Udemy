package s14.a161;

public class FuncionarioTerceirizado extends Funcionario{
	
	private Double despesaAdicional;
	
	public FuncionarioTerceirizado() {
		
	}

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorHora, Double despesaAdicional) {
		super(nome, horas, valorHora);
		setDespesaAdicional(despesaAdicional);
	}
	
	@Override
	public Double pagamento() {
		return super.pagamento() + (despesaAdicional * 1.1);
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
}
