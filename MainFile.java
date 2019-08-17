package week1.day8.assignment2;

public class MainFile {

	public static void main(String[] args) {
		// Demonstration first with setter
		ThreadCheckPrime primeCheck = new ThreadCheckPrime();
		primeCheck.setNumber(13);
		primeCheck.run();
		
		primeCheck.setNumber(15);
		primeCheck.run();
		
		primeCheck.setNumber(17);
		primeCheck.run();
		
		System.out.println();
		
		// Now demonstrate with constructor
		RunnableCheckPrime primeCheck2;
		primeCheck2 = new RunnableCheckPrime(14);
		primeCheck2.run();
		
		primeCheck2 = new RunnableCheckPrime(22);
		primeCheck2.run();
		
		primeCheck2 = new RunnableCheckPrime(23);
		primeCheck2.run();
	}
}
