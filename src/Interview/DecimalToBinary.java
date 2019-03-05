package Interview;

import java.util.Stack;

public class DecimalToBinary {

	public void printBinaryFormat(int number) {
		
		Stack<Integer> temp = new Stack<Integer>();
		
		while (number > 0) {
			temp.push(number % 2);
			number = number / 2;
		}
		while (!temp.isEmpty()) {
			System.out.print(temp.pop());
		}
	}

	public static void main(String a[]) {
		DecimalToBinary dtb = new DecimalToBinary();
		dtb.printBinaryFormat(25);
	}
}
