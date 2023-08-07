package s13.a146;

import java.util.Date;

public class Programa {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(125, new Date(), StatusPedido.PAGAMENTO_PENDENTE);
		
		System.out.println(pedido);
		
		StatusPedido sp1 = StatusPedido.ENTREGUE;
		
		StatusPedido sp2 = StatusPedido.valueOf("ENTREGUE");
		
		System.out.println(sp1);
		System.out.println(sp2);
	}

}
