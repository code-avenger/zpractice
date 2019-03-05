package Collections.queue.blockingQueue.transferQueue.linkedTransferQueue;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueExample {
	public static void main(String[] args) {
		final TransferQueue<String> transferQueue = new LinkedTransferQueue<String>();

		LinkedTransferQueueProducer queueProducer = new LinkedTransferQueueProducer(transferQueue);
		new Thread(queueProducer).start();

		LinkedTransferQueueConsumer queueConsumer1 = new LinkedTransferQueueConsumer(transferQueue);
		new Thread(queueConsumer1).start();

		LinkedTransferQueueConsumer queueConsumer2 = new LinkedTransferQueueConsumer(transferQueue);
		new Thread(queueConsumer2).start();

	}
}