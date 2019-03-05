package Collections.queue.blockingQueue.arrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
	public static void main(String[] args) throws Exception {

		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(1024);

		BlockingQueueProducer queueProducer = new BlockingQueueProducer(blockingQueue);
		BlockingQueueConsumer queueConsumer = new BlockingQueueConsumer(blockingQueue);

		new Thread(queueProducer).start();
		new Thread(queueConsumer).start();
	}
}