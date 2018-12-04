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
	
	@Test
	public void testDivision() {
		assertTrue(tester.division(0, 0) == 0);
	}
	
	@Test
	public void testDivisionUnexpected() {
		assertTrue(tester.division(10, 10) == 10);
	}
}
