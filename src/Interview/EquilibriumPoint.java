package Interview;
import java.util.Arrays;
import java.util.Scanner;


public class EquilibriumPoint {

	// Equilibrium position in an array is a position such that the sum of
	// elements before it is equal to the sum of elements after it.

	public static void main (String[] args) {
		Scanner br=new Scanner(System.in);

		int numberOfTests=br.nextInt();

		while (numberOfTests > 0) {
			int n = br.nextInt();

			if (n == 0) {
				System.out.println("-1");
				return;
			}

			int[] elements = new int[n];

			for (int i = 0; i < n; i++) {
				elements[i] = br.nextInt();
			}


			if (n == 1) {
				System.out.println(elements[0]);
				return;
			}

			int start=0;
			int end = elements.length;
			boolean flag = false;

			for (int i = 0; i < elements.length; i++) {

				int[] subArr1 = Arrays.copyOfRange(elements, start, i);
				int[] subArr2 = Arrays.copyOfRange(elements, i + 1, end);

				int total1 = getTotal(subArr1);
				int total2 = getTotal(subArr2);

				if (total1 == total2) {
					System.out.println(i + 1);
					flag=true;
				}

			}

			if (!flag) {
				System.out.println("-1");
			}


			numberOfTests--;
		}
	}

	public static int getTotal(int[] elements) {
		int total = 0;
		for (int i = 0; i < elements.length; i++) {
			total += elements[i];
		}
		return total;
	}

}
