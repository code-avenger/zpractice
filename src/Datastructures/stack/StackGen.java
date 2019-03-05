package Datastructures.stack;

import java.io.IOException;

public class StackGen {
	static int num;
	static int ans;
	static Stack theStack;

	public static void main(String[] args) throws IOException {

		theStack = new Stack(3);

		theStack.push(11);
		theStack.push(21);
		theStack.push(31);
		theStack.push(41);

		theStack.pop();
		theStack.pop();
		theStack.pop();
		theStack.pop();

	}

}

class Stack {
	private int counter;
	private int[] data;
	private int top;

	public Stack(int maxSize) {
		counter = maxSize - 1;
		data = new int[maxSize];
		top = -1;
	}

	public void push(int p) {
		System.out.println("Push operation started for : " + p);

		if (!isFull()) {
			data[++top] = p;
		} else {
			System.out.println("Stack is full");
		}
		printStack();
		System.out.println();
	}

	public int pop() {

		int temp = 0;
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			temp = data[top--];
			System.out.println("Pop operation done for top i.e. " + temp);
		}

		printStack();
		System.out.println();

		return temp;
	}

	public int peek() {
		return data[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top >= counter);
	}

	public void printStack() {
		if (!isEmpty()) {
			System.out.println("Top : " + top);
			System.out.println("Elements in stack : ");
			for (int i = 0; i <= top; i++) {
				System.out.print(data[i]);
				System.out.print("\t");
			}
			System.out.println("");
		} else {
			System.out.println("Empty stack.");
		}
	}

}
