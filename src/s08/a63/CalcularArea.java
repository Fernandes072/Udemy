package s08.a63;

import java.util.Scanner;

public class CalcularArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Medidas triângulo X");
		double ladoA = sc.nextDouble();
		double ladoB = sc.nextDouble();
		double ladoC = sc.nextDouble();
		double p = (ladoA+ladoB+ladoC)/2;
		double areaX = Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
		System.out.println("Medidas triângulo Y");
		ladoA = sc.nextDouble();
		ladoB = sc.nextDouble();
		ladoC = sc.nextDouble();
		p = (ladoA+ladoB+ladoC)/2;
		double areaY = Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
		System.out.printf("Área triângulo X: %.2f %n", areaX);
		System.out.printf("Área triângulo Y: %.4f %n", areaY);
		if(areaX > areaY) {
			System.out.println("X maior");
		} else if(areaY > areaX) {
			System.out.println("Y maior");
		} else {
			System.out.println("Iguais");
		}
		sc.close();
	}

}
