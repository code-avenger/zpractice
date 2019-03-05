package Datastructures.queue;

import java.util.ArrayList;
import java.util.List;

public class QueueDemo {

	private static final int capacity = 3;
	List<Integer> arr = new ArrayList<Integer>();
	int front = 0;
	int rear = front;

	public void push(int pushedElement) {
		System.out.println("Push started for " + pushedElement);
		if (isFull()) {
			System.out.println("Overflow ");

		} else {
			arr.add(rear, pushedElement);
			rear++;
			System.out.println("Element " + pushedElement + " is pushed to Queue ");
			display();
		}
		System.out.println();
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Underflow ");

		} else {

			System.out.println("Pop operation done : " + arr.get(front));
			front++;
			display();

		}
		System.out.println();
	}

	public void display() {
		if (rear > front) {
			System.out.println("FRONT : " + front + ", REar: " + rear);
			System.out.println("Elements in Queue : ");
			for (int i = front; i < rear; i++) {
				System.out.print(arr.get(i));
				System.out.print("\t");
			}
			System.out.println("");
		} else {
			System.out.println("No more elements in queue.");
		}
	}

	public int peek() {

		return (rear - 1);

	}

	public Boolean isFull() {
		Boolean flag = false;
		if ((rear - front) >= capacity) {
			flag=true;
		}
		return flag;
	}

	public Boolean isEmpty() {

		Boolean flag = false;
		if (front == rear) {
			flag=true;
		}
		return flag;
	}

	public static void main(String[] args) {
		QueueDemo queueDemo = new QueueDemo();
		queueDemo.pop();
		queueDemo.push(3);
		queueDemo.push(13);
		queueDemo.push(23);
		queueDemo.push(33);
		queueDemo.pop();

		queueDemo.push(43);
		queueDemo.push(53);
		queueDemo.pop();
		queueDemo.pop();
		queueDemo.pop();
		queueDemo.pop();
	}
}
