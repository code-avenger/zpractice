package Datastructures.arrays;

import java.util.Arrays;

public class NthSmallestOrLargest {

	public static void main(String[] args) {
	    
        int[] arr = new int[10000];

        int n = 0;
        for (int m = 10000; m > 0; m--) {
            arr[n++] = m;
        }

        System.out.println(System.currentTimeMillis());
        // without using any predefined methods
        int nth = 2;
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			c = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					c++;
				}
			}
            if (c == (nth - 1)) {
                System.out.println("2nd smallest is :" + arr[i]);
				break;
			}
		}
        System.out.println(System.currentTimeMillis());

        // using predefined methods
        Arrays.sort(arr);

        System.out.println("nth smallest is :" + arr[nth - 1]);
        System.out.println(System.currentTimeMillis());
	}

}
