/**
 * Clase para trabajar con rectángulos
 * @author Germán Asencio
 * @version 1.2
 */
public class Rectangulo_GAA extends FiguraGeometrica_GAA {
	private double l1;
	private double l2;
	
	/** Constructor de la clase
	 * @param tipoFigura Tipo de figura.
	 * @param lG Ancho del rectángulo.
	 * @param lP Alto del rectángulo.
	 */
	public Rectangulo_GAA(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Se sobreescribe el cálculo del área del rectángulo
	 * @return double Valor del área.
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Se sobreescribe el cálculo del perímetro del rectángulo
	 * @return double Valor del perímetro.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
