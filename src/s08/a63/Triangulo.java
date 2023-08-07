package s08.a63;

public class Triangulo {
	
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo(double ladoA, double ladoB, double ladoC) {
		setLadoA(ladoA);
		setLadoB(ladoB);
		setLadoC(ladoC);
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	
	public double getArea() {
		double p = (ladoA+ladoB+ladoC)/2;
		double area = Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
		return area;
	}
	
	public boolean areaMaior(Triangulo triangulo) {
		if (getArea() > triangulo.getArea()) {
			return true;
		} else {
			return false;
		}
	}
}
