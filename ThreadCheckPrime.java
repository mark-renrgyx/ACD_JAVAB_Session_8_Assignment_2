package week1.day8.assignment2;

public class ThreadCheckPrime extends Thread {
	boolean isPrime;
	int givenNumber;
	
	public void run() {
		if (PrimeChecker.isPrime(givenNumber))
			System.out.println(givenNumber + " is prime");
		else
			System.out.println(givenNumber + " is not prime");
	}
	
	public void setNumber(int number) {
		this.givenNumber = number;
	}
	
//	private boolean isPrime (int number) {
//		for (int i = 2; i < number / 2 + 1; i++) {
//			if (number % i == 0)
//				return true;
//		}
//		return false;
//	}
}
