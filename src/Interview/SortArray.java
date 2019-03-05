package Interview;
import java.util.Arrays;
import java.util.Scanner;


public class SortArray {


	public static void main (String[] args) {
		Scanner br=new Scanner(System.in);

		int numberOfTests=br.nextInt();

		while (numberOfTests > 0) {
			int n = br.nextInt();

			int[] elements = new int[n];

			for (int i = 0; i < n; i++) {
				elements[i] = br.nextInt();
			}

			Arrays.sort(elements);

			for (int i = 0; i < n; i++) {
				System.out.print(elements[i]);
				System.out.print(" ");

			}
			System.out.println();

			numberOfTests--;
		}
	}


}
