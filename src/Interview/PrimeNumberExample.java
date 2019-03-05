package Interview;

public class PrimeNumberExample {

	public static void main(String[] args) {

		int n = 11;
		System.out.println(isPrimeNumberUsingMath(n) ? n + " is prime number." : n + " is not prime number.");
		System.out.println(isPrimeNumberUsingN(n) ? n + " is prime number." : n + " is not prime number.");

		n = 4;
		System.out.println(isPrimeNumberUsingMath(n) ? n + " is prime number." : n + " is not prime number.");
		System.out.println(isPrimeNumberUsingN(n) ? n + " is prime number." : n + " is not prime number.");

	}

	/**
	 * returns true if number is prime using Math.sqrt.
	 */
	public static boolean isPrimeNumberUsingMath(int n) {
		System.out.println();
		System.out.println("Using Math.sqrt : ");

		for (int i = 2; i <= Math.sqrt(n); i++) {
			System.out.println(i);
			if (n % i == 0) {
				return false;
			}
		}

		return true; // means number wasn't divisible by any of the number, it's a prime number.
	}

	/**
	 * returns true if number is prime using n/2
	 */
	public static boolean isPrimeNumberUsingN(int n) {
		System.out.println();
		System.out.println("Using n/2 :");

		for (int i = 2; i <= (n / 2); i++) {
			System.out.println(i);
			if (n % i == 0) {
				return false;
			}
		}

		return true; // means number wasn't divisible by any of the number, it's a prime number.
	}

}
