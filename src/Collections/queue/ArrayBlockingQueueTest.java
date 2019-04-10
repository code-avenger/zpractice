package Collections.queue;

import java.util.concurrent.ArrayBlockingQueue;

// arrayBlockingQueue, . Once instantiated, cannot be resized.
public class ArrayBlockingQueueTest {

    public static void main(String[] args) {
	ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);

	queue.add("one");
	queue.add("two");
	queue.add("five");

	System.out.println("queue: " + queue);

	// this will throw illegalStateException with message "queue full"
	queue.add("nine");
    }
}
