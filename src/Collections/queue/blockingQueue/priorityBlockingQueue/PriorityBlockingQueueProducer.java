package Collections.queue.blockingQueue.priorityBlockingQueue;

import java.util.UUID;
import java.util.concurrent.BlockingQueue;

public class PriorityBlockingQueueProducer implements Runnable {

	protected BlockingQueue<String> blockingQueue;

	public PriorityBlockingQueueProducer(BlockingQueue<String> queue) {
		this.blockingQueue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String data = UUID.randomUUID().toString();
				System.out.println("Put: " + data);
				blockingQueue.put(data);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}