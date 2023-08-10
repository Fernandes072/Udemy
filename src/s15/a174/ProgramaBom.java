package s15.a174;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramaBom {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Número do quarto: ");
			int numero = ler.nextInt();
			System.out.print("Data checkin (dd/mm/yyyy): ");
			Date checkin = sdf.parse(ler.next());
			System.out.print("Data checkout (dd/mm/yyyy): ");
			Date checkout = sdf.parse(ler.next());

			Reserva res1 = new Reserva(numero, checkin, checkout);
			System.out.println(res1);
			System.out.println();

			System.out.print("Data checkin (dd/mm/yyyy): ");
			checkin = sdf.parse(ler.next());
			System.out.print("Data checkout (dd/mm/yyyy): ");
			checkout = sdf.parse(ler.next());

			res1.atualizarDatas(checkin, checkout);
			System.out.println(res1);
		} catch (ParseException e) {
			System.out.println("Data inválida");
		} catch (Excecao e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro");
		}

		ler.close();
	}
}