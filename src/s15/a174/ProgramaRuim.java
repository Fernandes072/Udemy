package s15.a174;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramaRuim {

	public static void main(String[] args) throws ParseException {

		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Número do quarto: ");
		int numero = ler.nextInt();
		System.out.print("Data checkin (dd/mm/yyyy): ");
		Date checkin = sdf.parse(ler.next());
		System.out.print("Data checkout (dd/mm/yyyy): ");
		Date checkout = sdf.parse(ler.next());

		if (checkin.before(checkout)) {
			Reserva res1 = new Reserva(numero, checkin, checkout);
			System.out.println(res1);
			System.out.println();

			System.out.print("Data checkin (dd/mm/yyyy): ");
			checkin = sdf.parse(ler.next());
			System.out.print("Data checkout (dd/mm/yyyy): ");
			checkout = sdf.parse(ler.next());

			//String erro = res1.atualizarDatas(checkin, checkout);
			String erro = "abc";
			if (erro != null) {
				System.out.println(erro);
			}
			System.out.println(res1);
		} else {
			System.out.println("Erro: Data de checkout deve ser depois da checkin");
		}

		ler.close();
	}
}