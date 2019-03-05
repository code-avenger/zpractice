package Datastructures.arrays;

import java.util.Arrays;

public class Array_Shorting {

	static int[] array = { 3, 2, 0, 1, 0, 5, 4, 3 };
	static int []sorted_array = new int[array.length];
	static int size=0;

	public static void main(String[] args) {

		sorted_array[0]=array[0];
		size++;

		for(int i=0; i<array.length; i++){

			for(int j=0; j<size;j++ ){

				if (j == (size - 1)) {
					sorted_array[size] = array[i];
					size++;
					break;
				} else if (array[i] < sorted_array[j]) {
					shiftElements(i, j);					
					break;
				}
			}
		}
		System.out.println(Arrays.toString(sorted_array));
	}

	public static void shiftElements(int a,int b) {

		if(size<sorted_array.length){
			for(int k=size;k>b;){
				sorted_array[k]=sorted_array[--k];
			}
			sorted_array[b]=array[a];
			size++;
		}
	}
}
