package Thread.AllTypesOfMultiThread;

public class RunnableExample {

	public static void main(String[] args) {

		System.out.println("Before task creation");
		Runnable task = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Hello " + threadName);
		};
		System.out.println("After task creation");

		System.out.println("Before task run");
		task.run();
		System.out.println("After task run");

		System.out.println("Before thread start");
		Thread thread = new Thread(task);
		thread.start();
		System.out.println("After thread start");

		System.out.println("Done!");
	}
}
