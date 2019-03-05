package Interview;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;


/**
 * Input : A[] = {3, 4, 1, 9, 56, 7, 9, 12} m = 5 Output: Minimum Difference is
 * 6 We may pick 3,4,7,9,9 and the output is 9-3 = 6
 * 
 * @author sudeep.gangula
 *
 */
public class ChocolateDistributionProblem {
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);

		int numberOfTests = br.nextInt();

		while (numberOfTests >= 1 && numberOfTests <= 100) {

			int n = br.nextInt();

			int[] elements = new int[n];

			for (int i = 0; i < n; i++) {

				elements[i] = br.nextInt();
			}

			int noOfStudents = br.nextInt();

			getTheDifference(elements,noOfStudents);

			numberOfTests--;

		}
	}

	public static void getTheDifference(int[] elements, int noOfStudents) {

		Integer result = null;
		Arrays.sort(elements);

		for (int i = 0; i <= elements.length - noOfStudents; i++) {

			Integer temp = elements[i + (noOfStudents - 1)] - elements[i];
			if (null == result) {
				result = temp;
			}
			if(temp<result){
				result = temp;
			}


		}

		System.out.println(result);
	}
}