package ch.bbw.erasmo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	
	Calculator tester;
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		tester = new Calculator();
		assertTrue(tester.summe(10, 25) == 35);
	}
	
}
