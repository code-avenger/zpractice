package Collections.queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
	Deque<String> deque = new LinkedList<>();

	deque.add("one");
	deque.add("two");// same as deque.addFirst()
	System.out.println(deque);

	deque.addFirst("three");
	System.out.println(deque);

	deque.poll(); //same as deque.pollFirst()
	System.out.println(deque);
	
	deque.pollLast();
	System.out.println(deque);
    }
}
