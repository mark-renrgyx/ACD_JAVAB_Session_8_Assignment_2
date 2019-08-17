package week1.day8.assignment2;

public class RunnableCheckPrime implements Runnable {

	private int number;
	
	public RunnableCheckPrime (int number) {
		this.number = number;
	}
	
	@Override
	public void run() {
		if (PrimeChecker.isPrime(number))
			System.out.println(number + " is prime");
		else
			System.out.println(number + " is not prime");
	}
}
