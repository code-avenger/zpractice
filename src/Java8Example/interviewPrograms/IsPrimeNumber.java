package Java8Example.interviewPrograms;

import java.util.stream.IntStream;

public class IsPrimeNumber {
	public static void main(String[] args) {

		IsPrimeNumber ob = new IsPrimeNumber();

		if (ob.isPrime(11)) {
			System.out.println("yes it's prime number.");
		} else {
			System.out.println("no it's not prime number.");
		}
	}

	private boolean isPrime(int n) {
		return !IntStream.rangeClosed(2, (int) Math.sqrt(n)).anyMatch(i -> n % i == 0);
	}
}

