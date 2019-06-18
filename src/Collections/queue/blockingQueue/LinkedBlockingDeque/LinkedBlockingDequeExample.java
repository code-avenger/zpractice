package Collections.queue.blockingQueue.LinkedBlockingDeque;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequeExample {
	public static void main(String[] args) {
	final BlockingDeque<String> linkedBlockingQueue = new LinkedBlockingDeque<String>(10);

	System.out.println("*********** size: " + linkedBlockingQueue.remainingCapacity());

	LinkedBlockingDequeProducer queueProducer = new LinkedBlockingDequeProducer(linkedBlockingQueue);
		new Thread(queueProducer).start();

	LinkedBlockingDequeConsumer queueConsumer1 = new LinkedBlockingDequeConsumer(linkedBlockingQueue);
	new Thread(queueConsumer1).start();

	LinkedBlockingDequeConsumer queueConsumer2 = new LinkedBlockingDequeConsumer(linkedBlockingQueue);
	// new Thread(queueConsumer2).start();
	}
}
