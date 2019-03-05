package Interview;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;


/**
 * triplet (a, b, c) that satisfies a2 + b2 = c2.
 * 
 * @author sudeep.gangula
 *
 */
public class PythagoreanTriplet {
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);

		int numberOfTests = br.nextInt();

		while (numberOfTests >= 1 && numberOfTests <= 50) {

			int n = br.nextInt();

			if (n >= 1 && n <= 100) {

				int[] elements = new int[n];

				for (int i = 0; i < n; i++) {
					int k = br.nextInt();
					elements[i] = (k * k);
				}


				isTriplet(elements);

				numberOfTests--;
			} else {
				System.out.println("Please enter number smaller than 100.");
			}
		}
	}

	public static void isTriplet(int[] elements) {
		boolean flag = false;
		for (int i = 0; i < elements.length; i++) {
			for (int j = i + 1; j < elements.length; j++) {

				int temp = elements[i] + elements[j];

				if (IntStream.of(elements).anyMatch(x -> x == temp)) {
					System.out.println("Yes");
					flag = true;
				}
			}
		}

		if (!flag) {
			System.out.println("No");
		}
	}

}