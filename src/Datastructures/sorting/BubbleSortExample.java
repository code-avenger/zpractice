package Datastructures.sorting;

import java.util.Arrays;

/**
 * Bubblesort
 * 
 * @Complexity: Ο(n2)
 * @author sudeep.gangula
 * 
 *         https://www.tutorialspoint.com/data_structures_algorithms/bubble_sort_algorithm.htm
 *
 */
public class BubbleSortExample {
	
	public static void main(String[] args) {
		
		int[] arrayNew = {2,3,0,1,0,5,4,3};
		System.out.println("Before Sort");  
		System.out.println(Arrays.toString(arrayNew));
		
		bubbleSort(arrayNew);
		
		System.out.println();
		System.out.println("After Sort");  
		System.out.println(Arrays.toString(arrayNew));
		
	}
	public static void bubbleSort(int[] numArray) {

	    int n = numArray.length;
	    int temp = 0;

	    for (int i = 0; i < n; i++) {
	        for (int j = 1; j < (n - i); j++) {

	            if (numArray[j - 1] > numArray[j]) {
	                temp = numArray[j - 1];
	                numArray[j - 1] = numArray[j];
	                numArray[j] = temp;
	            }

	        }
	    }
	}
}
