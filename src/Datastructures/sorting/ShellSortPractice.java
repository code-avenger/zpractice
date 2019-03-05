package Datastructures.sorting;

import java.util.Arrays;

public class ShellSortPractice {
	static int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };

	public static void selectionSort(int[] arr) {
		int h = 4;
		while (h > 0) {
			for (int i = 0; i < arr.length - (h + 1);) {
				int j = i + h;
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
				i += h;
			}
			h--;
		}
	}

	public static void main(String a[]) {

		System.out.println("Before Selection Sort");
		System.out.println(Arrays.toString(arr1));

		selectionSort(arr1);// sorting array using selection sort

		System.out.println("After Selection Sort");
		System.out.println(Arrays.toString(arr1));
	}
}
