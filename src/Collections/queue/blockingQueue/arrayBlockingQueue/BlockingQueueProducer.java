package Collections.queue.blockingQueue.arrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class BlockingQueueProducer implements Runnable {

	protected BlockingQueue<String> blockingQueue;

	public BlockingQueueProducer(BlockingQueue<String> queue) {
		this.blockingQueue = queue;
	}

	public void run() {
		try {
			// Thread.sleep(500);
			blockingQueue.put("Lion");
			// Thread.sleep(1000);
			blockingQueue.put("Crocodile");
			// Thread.sleep(2000);
			blockingQueue.put("Jaguar");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}