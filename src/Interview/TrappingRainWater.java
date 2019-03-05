package Interview;
import java.util.Arrays;
import java.util.Scanner;


public class TrappingRainWater {


	public static void main (String[] args) {
		Scanner br=new Scanner(System.in);

		int numberOfTests=br.nextInt();

		while (numberOfTests >= 1 && numberOfTests <= 100) {

			int n = br.nextInt();

			if (n >= 3 && n <= 100) {

				int[] elements = new int[n];

				for (int i = 0; i < n;) {
					int k = br.nextInt();
					if(k>=0 && k<10){
						elements[i] =k;
						i++;
					} else {
						System.out
								.println("Please enter number smaller than 10.");
					}
				}


				int trapped = 0;

				for (int i = 0; i < elements.length;) {

					int[] subArr = null;

					for (int j = i + 1; j < elements.length; j++) {

						if (j == elements.length - 1
								|| elements[j] > elements[j - 1]
								&& elements[j] >= elements[i]) {
							subArr = Arrays.copyOfRange(elements, i, j + 1);
							i = i + j;
							break;
						}

					}
					if (null != subArr) {
						trapped += getTotal(subArr);
					}
				}

				System.out.println(trapped);
				numberOfTests--;
			} else {
				System.out.println("Please enter number smaller than 100.");
			}
		}
	}

	public static int getTotal(int[] elements) {

		int total = 0;
		int blocksOf = 0;

		if (elements[0] > elements[elements.length - 1]) {
			blocksOf = elements[elements.length - 1];
		} else {
			blocksOf = elements[0];
		}

		for (int i = 1; i < elements.length - 1; i++) {
			if (elements[i] < blocksOf) {
				total += blocksOf - elements[i];
			}
		}

		return total;
	}

}
