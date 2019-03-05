package Interview;
import java.util.Arrays;
import java.util.Scanner;


public class SubArraySum {


	public static void main (String[] args) {
		Scanner br=new Scanner(System.in);

		int numberOfTests=br.nextInt();

		while (numberOfTests > 0) {
			int n = br.nextInt();
			int sum = br.nextInt();
			int[] elements = new int[n];
			for (int i = 0; i < n; i++) {
				elements[i] = br.nextInt();
			}

			int total = 0;

			boolean flag = false;

			outer:
 for (int i = 0; i <= elements.length; i++) {

				for (int j = i + 1; j <= elements.length; j++) {

					int[] subArr = Arrays.copyOfRange(elements, i, j);

					total = getTotal(subArr);
					int temp = 0;
					if (total == sum) {
						System.out.println("i: " + i + " , j: " + j);
						System.out.println(Arrays.toString(subArr));

						System.out.println(i + 1 + " " + j);
						flag = true;
						break outer;
						}

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
