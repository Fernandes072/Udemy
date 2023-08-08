package s13.a151;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Publicacao publi1 = new Publicacao(sdf.parse("21/06/2018 13:05:44"), 
				"Viajando para a Nova Zelândia", 
				"Eu vou visitar esse país maravilhoso!", 
				12);
		publi1.adicionarComentario(new Comentario("Tenha uma boa viagem."));
		publi1.adicionarComentario(new Comentario("Isso é incrível!"));

		Publicacao publi2 = new Publicacao(sdf.parse("28/07/2018 23:14:19"), 
				"Boa noite galera", 
				"Até amanhã.", 
				5);
		publi2.adicionarComentario(new Comentario("Boa noite."));
		publi2.adicionarComentario(new Comentario("Que a força esteja com você."));
		
		System.out.println(publi1);
		System.out.println();
		System.out.println(publi1);

		ler.close();
	}

}
