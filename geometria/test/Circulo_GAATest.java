import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Circulo_GAATest {

	@Test
	public void compruebaAreaCirculo1() {
		Circulo_GAA circulo1 = new Circulo_GAA(7, "circulo");
		double area = circulo1.area();
		assertEquals(153.9384, area, 0.1);
	}
	
	@Test
	public void compruebaAreaCirculo2() {	
		Circulo_GAA circulo2 = new Circulo_GAA(0, "circulo");
		double area = circulo2.area();	
		assertEquals(0.00, area, 0.1);	
	}
	
	@Test
	public void compruebaAreaCirculo3() {	
		Circulo_GAA circulo3 = new Circulo_GAA(-3, "circulo");
		double area = circulo3.area();		
		assertEquals(28.2744, area, 0.1);
	}

	@Test
	public void compruebaPerimetroCirculo1() {
		Circulo_GAA circulo1 = new Circulo_GAA(7, "circulo");
		double perimetro = circulo1.perimetro();		
		assertEquals(43.9824, perimetro, 0.1);		
	}
	
	@Test
	public void compruebaPerimetroCirculo2() {		
		Circulo_GAA circulo2 = new Circulo_GAA(0, "circulo");
		double perimetro = circulo2.perimetro();		
		assertEquals(0.00, perimetro, 0.1);	
	}
	
	@Test
	public void compruebaPerimetroCirculo3() {		
		Circulo_GAA circulo3 = new Circulo_GAA(-3, "circulo");
		double perimetro = circulo3.perimetro();		
		assertEquals(18.8496, perimetro, 0.1);
	}

}
