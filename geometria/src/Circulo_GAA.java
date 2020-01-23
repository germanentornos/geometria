public class Circulo_GAA extends FiguraGeometrica_GAA {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_GAA(double r, String tipoFigura) {
		super(tipoFigura);
		radio = Math.abs(r);
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
