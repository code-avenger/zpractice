package Datastructures.search;

import java.util.Scanner;

/**
 * @Complexity: O(n)
 * @author sudeep.gangula
 *
 */
public class LinearSearch {

	public static void main(String args[]) {
		int counter, noOfEntries, search, array[];

		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements");
		noOfEntries = in.nextInt();
		array = new int[noOfEntries];

		System.out.println("Enter " + noOfEntries + " integers");

		for (counter = 0; counter < noOfEntries; counter++)
			array[counter] = in.nextInt();

		System.out.println("Enter value to find");
		search = in.nextInt();

		for (counter = 0; counter < noOfEntries; counter++) {
			if (array[counter] == search) /* Searching element is present */
			{
				System.out.println(search + " is present at location " + (counter + 1) + ".");
				break;
			}
		}

		if (counter == noOfEntries) /* Searching element is absent */
			System.out.println(search + " is not present in array.");
	}
}
