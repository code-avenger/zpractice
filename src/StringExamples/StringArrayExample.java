package StringExamples;

import java.util.Arrays;

public class StringArrayExample {
	public static void main(String[] args) {

		String st = "sudeep gangula";

		char[] arr = st.toCharArray();
		
		System.out.println(arr.length);

		System.out.println(arr[2]);

		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
	}
}
