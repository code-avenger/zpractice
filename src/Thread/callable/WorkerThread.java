package Thread.callable;

import java.util.concurrent.Callable;

public class WorkerThread implements Callable<Object> {

	private String command;

	public WorkerThread(String s) {
		this.command = s;
	}

	private void processCommand() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return this.command;
	}

	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
		processCommand();
		System.out.println(Thread.currentThread().getName() + " End.");
		return null;
	}
}