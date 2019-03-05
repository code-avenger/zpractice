package Collections.queue.blockingQueue.linkedBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class LinkedBlockingQueueConsumer implements Runnable {

	protected BlockingQueue<String> blockingQueue;

	public LinkedBlockingQueueConsumer(BlockingQueue<String> queue) {
		this.blockingQueue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String data = blockingQueue.take();
				System.out.println(Thread.currentThread().getName() + " take(): " + data);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}