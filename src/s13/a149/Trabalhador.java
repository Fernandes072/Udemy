package s13.a149;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Trabalhador {
	
	private String nome;
	private NivelTrabalhador nivel;
	private Double salarioBase;
	private Departamento departamento;
	private List<ContratoHora> contratos = new ArrayList<>();
	
	public Trabalhador() {
		
	}

	public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
		setNome(nome);
		setNivel(nivel);
		setSalarioBase(salarioBase);
		setDepartamento(departamento);
	}
	
	public void AdicionarContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}
	
	public void RemoverContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}
	
	public Double renda(Integer ano, Integer mes) {
		Double total = salarioBase;
		Calendar calendar = Calendar.getInstance();
		for (ContratoHora contrato : contratos) {
			calendar.setTime(contrato.getData());
			if (calendar.get(Calendar.MONTH) + 1 == mes &&
					calendar.get(Calendar.YEAR) == ano) {
				total += contrato.valorTotal();
			}
		}
		return total;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}
}