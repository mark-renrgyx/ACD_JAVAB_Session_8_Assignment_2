package week1.day8.assignment2;

public class PrimeChecker {
	public static boolean isPrime (int number) {
		for (int i = 2; i < number/2 + 1; i++) {
			if (number % i == 0)
				return true;
		}
		return false;
	}
}
