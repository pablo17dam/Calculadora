package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import calculadora.Calculadora;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		int resulatado = Calculadora.suma(3, 2);
		int esperado = 5;
		assertEquals(esperado, resulatado);
	}
	
	@Test
	public void testResta() {
		int resulatado = Calculadora.resta(3, 2);
		int esperado = 8;
		assertEquals(esperado, resulatado);
	}

}
