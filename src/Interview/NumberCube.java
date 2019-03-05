package Interview;

import java.util.Scanner;

/**
 * @author Sudeep Gangula
 *
 */

public class NumberCube {

	private static Scanner keyboard;

	public static void main(String[] args) {
		int n = getNumber();
		int centre = getCentreNo(n);

		drawCube(n, centre);
	}

	public static int getNumber() {
		keyboard = new Scanner(System.in);
		System.out.println("Enter odd number: ");
		int myint = keyboard.nextInt();
		return myint;
	}

	public static void drawCube(int elements, int centre) {
		System.out.println("Expected output is :" + "\n");

		for (int rowNo = 1; rowNo <= elements; rowNo++) {

			int centreTemp = centre;
			int steps = centre - Math.abs(centre - rowNo) - 1;

			for (int colNo = 1; colNo <= elements; colNo++) {

				if (colNo <= steps) {
					// descending values
					System.out.print(centreTemp-- + " ");

				} else if (colNo > (elements - steps)) {

					// ascending values
					System.out.print(++centreTemp + " ");

				} else {
					// Same value continue
					System.out.printf(centreTemp + " ");

				}
			}
			System.out.println();
		}

	}

	public static int getCentreNo(int n) {
		int i = n / 2;
		int j = n % 2;

		n = i + j;
		return n;

	}
}
