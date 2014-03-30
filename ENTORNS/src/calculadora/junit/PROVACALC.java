package calculadora.junit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import calculadora.CalculadoraEnters;

public class PROVACALC {

	private static CalculadoraEnters calculadora;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calculadora = new CalculadoraEnters();
	}

	@Test(expected = java.lang.ArithmeticException.class)
	public void testDivisio() {
		int a = 4;
		int b = 0;
		int resultat = calculadora.divisio(a, b);
		assertEquals((a / b), resultat);
	}
	
	@Test
	public void testDivisio2() {
		int a = 4;
		int b = 2;
		int resultat = calculadora.divisio(a, b);
		assertEquals((a / b), resultat);
	}

	@Test
	public void testResta() {
		int a = 4;
		int b = 2;
		int resultat = calculadora.resta(a, b);
		assertEquals((a - b), resultat);
	}

	@Test
	public void testMultiplicacio() {
		int a = 4;
		int resultat = calculadora.multiplicacio(a, a, a);
		assertEquals((a * a * a), resultat);
	}

	@Test
	public void testSuma() {
		int a = 4;
		int b = 2;
		int resultat = calculadora.suma(a, b, a);
		assertEquals((a + b + a), resultat);
	}
}
