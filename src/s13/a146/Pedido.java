package s13.a146;

import java.util.Date;

public class Pedido {
	
	private Integer codigo;
	private Date horario;
	private StatusPedido status;
	
	public Pedido() {
		
	}

	public Pedido(Integer codigo, Date horario, StatusPedido status) {
		this.codigo = codigo;
		this.horario = horario;
		this.status = status;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [codigo=" + codigo + ", horario=" + horario + ", status=" + status + "]";
	}
	
	
}
