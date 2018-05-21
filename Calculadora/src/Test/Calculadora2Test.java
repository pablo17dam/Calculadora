package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import calculadora.Calculadora2;

public class Calculadora2Test {

	Calculadora2 calc;
	
	@Before
	public void before(){
		System.out.println("before()");
		calc = new Calculadora2();
	}
	@After
	public void after(){
		System.out.println("after()");
		calc.clear();
	}
	@Test
	public void testSum() {
		System.out.println("Sum()");
		int resul = calc.add(3, 2);
		int esper = 5;
		assertEquals(esper, resul);
	}
	
	@Test
	public void testAnsSum(){
		System.out.println("AnsSum()");
		calc.add(3, 2);
		int resul = calc.ans();
		int esper = 5;
		assertEquals(esper, resul);
	}
		
	
}
