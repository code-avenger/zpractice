package Datastructures.arrays;

public class NthSmallestOrLargest {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 3, 8, 1 };

		int n = 3;
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			c = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					c++;
				}
			}
			if (c == (n - 1)) {
				System.out.println("3rd smallest is :" + arr[i]);
				break;
			}
		}
	}

}
