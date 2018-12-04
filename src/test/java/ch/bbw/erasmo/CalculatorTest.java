package ch.bbw.erasmo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator tester;
	@Before
    public void setUp() {
		tester = new Calculator();
    }
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(tester.summe(10, 25) == 35);
	}
	
	@Test
	public void testSubtractionZweiPositiveIsOk() {
		assertTrue(tester.differenz(25, 10) == 15);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivisionNull() {
		assertTrue(tester.division(0, 0) == 0);
	}
	
	@Test
	public void testSummeUnexpectedException() {
		assertTrue(tester.summe(10, 25) == 35);
	}

	
	@Test
	public void testDivisionIsOk() {
		assertTrue(tester.division(4, 2) == 2);
	}

	
	@Test
	public void testDivision() throws Error{
		assertTrue(tester.division(10, gugus) == 1);
	}
	
	@Test
	public void testSummeProtected() {
		assertTrue(tester.summeProtected(10, 10) == 20);
	}
	
	@Test
	public void testSummePrivate() {
		
	}
}
