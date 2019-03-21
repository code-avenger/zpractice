package Datastructures.sorting;

import java.util.Arrays;

/**
 * MergeSort
 * 
 * @Complexity: O(n log n)
 * 
 * @author sudeep.gangula
 * 
 *         https://www.tutorialspoint.com/data_structures_algorithms/merge_sort_algorithm.htm
 *
 */
public class MergeSortExample {

	private int[] array;
	private int[] tempMergArr;
	private int length;

	public static void main(String a[]){

		//int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
		int[] inputArr = {23,4,45,11};

		System.out.println("Before Sort");  
		System.out.println(Arrays.toString(inputArr));
		System.out.println();

		MergeSortExample mms = new MergeSortExample();
		mms.sort(inputArr);

		System.out.println();
		System.out.println("After Sort");  
		System.out.println(Arrays.toString(inputArr));
	}

	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			System.out.println("Left side Started");
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			System.out.println("Right side Started");
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {
		System.out.println("lowerIndex: "+lowerIndex+" , middle: "+middle+" , higherIndex: "+higherIndex);
		
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		System.out.println("i: "+i+" ,tempMergArr[i]: "+tempMergArr[i]+" , j: "+j+" ,tempMergArr[j]: "+ tempMergArr[j]);
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}

		System.out.println(Arrays.toString(array));
		System.out.println();

	}
}

