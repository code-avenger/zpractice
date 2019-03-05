package Interview;

import java.util.Scanner;

public class MinMaxFind {
	public static void main(String[] args) {
		int max = 0, ndMax = 0, min = 0;

		testMethod(max, ndMax, min);
	}

	public static void testMethod(int max, int ndMax, int min) {

		int n = getInt();

		if (min == 0) {
			min = n;
		}

		if (ndMax == 0) {
			ndMax = n;
		}

		if (max == 0) {
			max = n;
		} else if (n >= max) {
			if (n != max) {
				ndMax = max;
				max = n;
			}
		} else if (n > ndMax) {
			ndMax = n;
		} else if (n < min) {
			min = n;
		}

		System.out.println("Max: " + max);
		System.out.println("@nd Max: " + ndMax);
		System.out.println("Min: " + min);
		testMethod(max, ndMax, min);
	}

	public static int getInt() {
		int n;
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("Enter new Integer: ");
		int myint = keyBoard.nextInt();
		return myint;
	}

}
