package Datastructures.sorting;

import java.util.Arrays;

/**
 * QuickSort Complexity: O(nlogn)
 * 
 * @author sudeep.gangula
 *
 *         https://www.tutorialspoint.com/data_structures_algorithms/quick_sort_algorithm.htm
 */
public class QuickSortExample {


	private int array[];
	private int length;
	int changeCount=0;

	public void sort(int[] inputArr) {

		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		this.array = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
	}

	private void quickSort(int lowerIndex, int higherIndex) {

		System.out.println("*********New Array sorting started. ***********");
		System.out.println("lowerIndex: "+lowerIndex);
		System.out.println("higherIndex: "+higherIndex);

		printArray(lowerIndex, higherIndex);

		int i = lowerIndex;
		int j = higherIndex;
		// calculate pivot number, I am taking pivot as middle index number
		int pivotIndex=(lowerIndex+(higherIndex-lowerIndex)/2);
		int pivot = array[pivotIndex];
		// Divide into two arrays

		System.out.println("Pivot index: "+pivotIndex);
		System.out.println("Pivot value: "+pivot+"\n");
		while (i <= j) {
			/**
			 * In each iteration, we will identify a number from left side which 
			 * is greater then the pivot value, and also we will identify a number 
			 * from right side which is less then the pivot value. Once the search 
			 * is done, then we exchange both numbers.
			 */
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				//move index to next position on both sides
				i++;
				j--;
			}
		}

		System.out.println("i: "+i);
		System.out.println("j: "+j+"\n");

		// call quickSort() method recursively
		if (lowerIndex < j)
			quickSort(lowerIndex, j);
		if (i < higherIndex)
			quickSort(i, higherIndex);
	}

	private void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		System.out.println("changeCount: "+ (++	changeCount));
		System.out.println(Arrays.toString(array)+"\n");

	}

	private void printArray(int i, int j) {
		for(int k=i;k<=j;k++){
			System.out.print(array[k]+" ");
		}
		System.out.println();
	}

	public static void main(String a[]){

		QuickSortExample sorter = new QuickSortExample();
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};

		System.out.println(Arrays.toString(input)+"\n");
		sorter.sort(input);
		System.out.println(Arrays.toString(input));
	}


}

