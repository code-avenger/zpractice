package StringExamples;

import java.util.Stack;

public class StringReverse {

    static int counter = 0;
    
	public static void main(String[] args) {

        String input = "abcdefghijk";

        // System.out.println(input.length());
        // System.out.println(input.substring(1, input.length() - 1));

		// System.out.println("usingStringBuffer: " +
		// reverseUsingStringBuffer(input));
		// System.out.println("withoutUsingStringBuffer: " +
		// reverseWithoutUsingStringBuffer(input));

        System.out.println("reverseUsingRecursive: " + reverseUsingRecursive(input));

		//reverseUsingStack(input);

		int inputNo = 12345;
		// System.out.println("reverseInt: " + reverseInt(inputNo));

	}

	public static String reverseUsingStringBuffer(String input) {

		return new StringBuffer(input).reverse().toString();

	}

	public static String reverseWithoutUsingStringBuffer(String input) {
		char[] ar = input.toCharArray();
		char temp;
		int length = ar.length;

		for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;

		}

		return new String(ar);

	}

	public static int reverseInt(int input) {

		int output = 0;

		int reminder = 0;

		while (input > 0) {
			reminder = input % 10;
			output = (output * 10) + reminder;
			input = input / 10;
		}
		return output;

	}

	public static String reverseUsingRecursive(String input) {
        System.out.println(++counter);
		String result = "";
		if(input.length()==1){
			return input;
		}else
			result = input.charAt(input.length() - 1)
					+ reverseUsingRecursive(input.substring(1,
							input.length() - 1)) + input.charAt(0);

		return result;
	}

	public static void reverseUsingStack(String input) {

		Stack<String> stackStr = new Stack<String>();

		for (int i = 0; i < input.length(); i++) {
			stackStr.push(String.valueOf(input.charAt(i)));
		}

		while (!stackStr.isEmpty()) {
			System.out.print(stackStr.pop());
		}


	}

}


