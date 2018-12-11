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

	/////// ADDITION 8 Tests
	@Test
	public void testSummeTwoPositiveIsOk() {
		assertTrue(tester.summe(10, 25) == 35);
	}

	@Test
	public void testSummeOneNegativOnePositive() {
		assertTrue(tester.summe((-10), 25) == 15);
	}

	@Test
	public void testSummeTwoNegative() {
		assertTrue(tester.summe((-10), (-25)) == -35);
	}

	@Test
	public void testSummeZeroPlusZero() {
		assertTrue(tester.summe(0, 0) == 0);
	}

	@Test
	public void testSummeZeroWithPositive() {
		assertTrue(tester.summe(0, 25) == 25);
	}

	@Test
	public void testSummeMAX() {
		assertTrue(tester.summe(Integer.MAX_VALUE, 25) == Integer.MAX_VALUE + 25);
	}

	@Test
	public void testSummeMIN() {
		assertTrue(tester.summe(Integer.MIN_VALUE, 25) == Integer.MIN_VALUE + 25);
	}

	@Test
	public void testSummeMinAndMax() {
		assertTrue(tester.summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == Integer.MAX_VALUE + Integer.MIN_VALUE);
	}

	////// SUBTRAKTION 8 Tests
	@Test
	public void testSubtraktionTwoPositiveIsOk() {
		assertTrue(tester.differenz(25, 10) == 15);
	}

	@Test
	public void testSubtraktionOneNegativOnePositive() {
		assertTrue(tester.differenz((-10), 25) == -35);
	}

	@Test
	public void testSubtraktionTwoNegative() {
		assertTrue(tester.differenz((-10), (-25)) == 15);
	}

	@Test
	public void testSubtraktionZeroMinusZero() {
		assertTrue(tester.differenz(0, 0) == 0);
	}

	@Test
	public void testSubtraktionZeroWithPositive() {
		assertTrue(tester.differenz(0, 25) == -25);
	}

	@Test
	public void testSubtraktionMAX() {
		assertTrue(tester.differenz(Integer.MAX_VALUE, 25) == Integer.MAX_VALUE - 25);
	}

	@Test
	public void testSubtraktionMIN() {
		assertTrue(tester.differenz(Integer.MIN_VALUE, 25) == Integer.MIN_VALUE - 25);
	}

	@Test
	public void testSubtraktionMinAndMax() {
		assertTrue(tester.differenz(Integer.MAX_VALUE, Integer.MIN_VALUE) == Integer.MAX_VALUE - Integer.MIN_VALUE);
	}

	/////// DIVISION 8 Tests
	@Test
	public void testDivisionTwoPositiveIsOk() {
		assertTrue(tester.division(10, 2) == 5);
	}

	@Test
	public void testDivisionOneNegativOnePositive() {
		assertTrue(tester.division((-10), 2) == -5);
	}

	@Test
	public void testDivisionTwoNegative() {
		assertTrue(tester.division((-10), (-2)) == 5);
	}

	@Test
	public void testDivisionZeroDividedZero() {
		assertTrue(tester.division(0, 0) == 0);
	}

	@Test
	public void testDivisionZeroWithPositive() {
		assertTrue(tester.division(0, 25) == 0);
	}

	@Test
	public void testDivisionMAX() {
		assertTrue(tester.division(Integer.MAX_VALUE, 25) == Integer.MAX_VALUE / 25);
	}

	@Test
	public void testDivisionMIN() {
		assertTrue(tester.division(Integer.MIN_VALUE, 25) == Integer.MIN_VALUE / 25);
	}

	@Test
	public void testDivisionMinAndMax() {
		assertTrue(tester.division(Integer.MAX_VALUE, Integer.MIN_VALUE) == Integer.MAX_VALUE / Integer.MIN_VALUE);
	}

	/////// REST
	@Test(expected = ArithmeticException.class)
	public void testDivisionNull() {
		assertTrue(tester.division(0, 0) == 0);
	}

	@Test
	public void testDivisionIsOk() {
		assertTrue(tester.division(4, 2) == 2);
	}

//	@Test
//	public void testDivision() throws Error {
//		assertTrue(tester.division(10, gugus) == 1);
//	}

	@Test
	public void testSummeProtected() {
		assertTrue(tester.summeProtected(10, 10) == 20);
	}

	@Test
	public void testSummePrivate() {

	}
}
