package s15.a174;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer numeroQuarto;
	private Date checkin;
	private Date checkout;
	
	public Reserva(Integer numeroQuarto, Date checkin, Date checkout) {
		this.numeroQuarto = numeroQuarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public long duracao() {
		long diferenca = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diferenca,TimeUnit.MILLISECONDS);
	}
	
	public void atualizarDatas(Date checkin, Date checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder("Reserva: ");
		sb.append("Quarto: " + numeroQuarto);
		sb.append(", checkin: " + sdf.format(checkin));
		sb.append(", checkout: " + sdf.format(checkout));
		sb.append(", " + duracao() + " noites");
		return sb.toString();
	}
}