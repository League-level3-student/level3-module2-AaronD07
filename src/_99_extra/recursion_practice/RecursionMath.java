package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionMath {

	public static int recursiveMultiplication(int number, int times) {
		// 2. if times is 1
		// 3. return number
		if (times == 1) {
			return number;
		} else {

			// 4. else return number + recursionMultiplication(number, times-1)

			return number + recursiveMultiplication(number, times - 1);
		}
	}

	// 6. Try this one on your own!
	// Hint: if numberToDevideBy is bigger than number, you can't divide anymore
	public static int recursiveDivision(int number, int numberToDevideBy) {
		if (numberToDevideBy >= number) {
			return number;
		} else {
			return number / recursiveDivision(number, numberToDevideBy +1) ;
		}
	}

	// 8. Try this one on your own!
	public static int recursivePower(int number, int power) {
		if (power <= 1) {
			return number;
		} else {
			return number * recursivePower(number, power-1);
		}

	}

	@Test
	public void testMultiplication() {
		assertEquals(12, recursiveMultiplication(3, 4));
		assertEquals(140, recursiveMultiplication(70, 2));

		// 1 Add more JUnit tests like the one above to test your method

	}

	@Test
	public void testDivision() {
		// 5 Add JUnit tests to test your method
		assertEquals(35, recursiveDivision(70, 2));

	}

	@Test
	public void testPower() {
		// 7 Add JUnit tests to test your method
		assertEquals(4900, recursivePower(70, 2));
		assertEquals(256, recursivePower(4, 4));

	}

}
