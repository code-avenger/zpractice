package Thread.NestedExecutorService;


public class WorkerWithorCallable {

	public void processCommand(String command, String company) throws Exception {
		System.out.println("file " + company + " " + Thread.currentThread().getName() + " WON = " + command);
		if (company.equalsIgnoreCase("P2") || company.equalsIgnoreCase("P4")) {
			throw new Exception();
		}

	}
}
