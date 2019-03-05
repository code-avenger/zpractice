package Thread.NestedExecutorService;

import java.util.concurrent.Callable;

public class WorkerThread implements Callable<Object> {

	private String command;
	private String company;

	public WorkerThread(String s, String company) {
		this.command = s;
		this.company = company;
	}

	private void processCommand() throws Exception {
		if (company.equalsIgnoreCase("P2") || company.equalsIgnoreCase("P4")) {
			throw new Exception();
		}
		// try {
		// Random rand = new Random();
		// int min = 3000;
		// int max = 10000;
		//
		// // sleeping thread for a random time
		// int randomNum = rand.nextInt((max - min) + 1) + min;
		// System.out.println(randomNum);
		// Thread.sleep(randomNum);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
	}

	@Override
	public String toString() {
		return this.command;
	}

	@Override
	public Object call() throws Exception {
		System.out.println("Parent thread " + company + " " + Thread.currentThread().getName() + " Command = " + command);
		processCommand();

		return null;
	}
}