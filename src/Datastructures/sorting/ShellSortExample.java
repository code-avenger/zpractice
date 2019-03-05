package Datastructures.sorting;

import java.util.Arrays;

/**
 * ShellSort
 * 
 * @Complexity: Ο(n)
 * 
 * @author sudeep.gangula
 * 
 *         https://www.tutorialspoint.com/data_structures_algorithms/shell_sort_algorithm.htm
 *
 */
public class ShellSortExample {

	public static void main(String[] args) {

		long[] data={9,8,7,6,5,4,3,2,1};
		int len=data.length;
		int inner, outer;
		long temp;

		System.out.println(Arrays.toString(data));

		//find initial value of h
		int h = 1;
		while (h <= len / 3)
			h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)


		while (h > 0) // decreasing h, until h=1
		{
			// h-sort the file
			for (outer = h; outer < len; outer++) {
				temp = data[outer];
				inner = outer;

				System.out.println("h: "+h);
				System.out.println("inner: "+inner);
				System.out.println("outer: "+outer);
				// one subpass (eg 0, 4, 8)
				while (inner > h - 1 && data[inner - h] >= temp) {
					data[inner] = data[inner - h];
					inner -= h;
					
				}
				data[inner] = temp;
				System.out.println(Arrays.toString(data));
			}
			h = (h - 1) / 3; // decrease h
		}

		//System.out.println(Arrays.toString(data));
	}
}
