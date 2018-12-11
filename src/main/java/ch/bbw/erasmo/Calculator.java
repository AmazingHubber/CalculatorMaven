package ch.bbw.erasmo;

public class Calculator {

	public int summe(int summand1, int summand2) {
		long result = (long) summand1 + (long) summand2;
		if (result > Integer.MAX_VALUE) {
			throw new ArithmeticException("Number is too big");
		} else if (result < Integer.MIN_VALUE) {
			throw new ArithmeticException("Number too small");
		}
		return (int) result;
	}

	public int differenz(int value1, int value2) {
		long result = (long) value1 - (long) value2;
		if (result > Integer.MAX_VALUE) {
			throw new ArithmeticException("Number is too big");
		} else if (result < Integer.MIN_VALUE) {
			throw new ArithmeticException("Number too small");
		}
		return (int) result;
	}

	public int division(int value1, int value2) {
		return value1 / value2;
	}

	protected int summeProtected(int summand1, int summand2) {
		return summand1 + summand2;
	}

	private int summePrivate(int summand1, int summand2) {
		return summand1 + summand2;
	}

}
