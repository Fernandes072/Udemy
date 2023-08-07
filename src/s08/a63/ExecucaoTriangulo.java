package s08.a63;

import java.util.Scanner;

public class ExecucaoTriangulo {

	private static Scanner sc;

	public static Triangulo criarTriangulo() {
		sc = new Scanner(System.in);
		double ladoA = sc.nextDouble();
		double ladoB = sc.nextDouble();
		double ladoC = sc.nextDouble();
		Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);
		return triangulo;
	}
	
	
	public static void main(String[] args) {
	
		System.out.println("Medidas triângulo X");
		Triangulo X = criarTriangulo();
		System.out.println("Medidas triângulo Y");
		Triangulo Y = criarTriangulo();
		System.out.printf("Área triângulo X: %.2f %n", X.getArea());
		System.out.printf("Área triângulo Y: %.4f %n", Y.getArea());
		System.out.println(X.areaMaior(Y));
	}

}