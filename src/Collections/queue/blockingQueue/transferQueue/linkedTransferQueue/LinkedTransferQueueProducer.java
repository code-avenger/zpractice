package Collections.queue.blockingQueue.transferQueue.linkedTransferQueue;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueProducer implements Runnable {

	protected TransferQueue<String> transferQueue;
	final Random random = new Random();

	public LinkedTransferQueueProducer(TransferQueue<String> queue) {
		this.transferQueue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String data = UUID.randomUUID().toString();
				System.out.println("Put: " + data);
				transferQueue.transfer(data);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}