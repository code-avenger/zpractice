package Collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {

		Stack<Integer> myStack = new Stack<Integer>();

		for (int i = 1; i < 5; i++) {
			myStack.push(i);
		}

		System.out.println("Full stack: " + myStack);

		System.out.println("Peek :  " + myStack.peek());

		System.out.println("Pop: " + myStack.pop());

		System.out.println("Full stack: " + myStack);

		System.out.println("Stack seach 2: " + myStack.search(2));
		System.out.println("Stack seach 4: " + myStack.search(4));
	}
}
