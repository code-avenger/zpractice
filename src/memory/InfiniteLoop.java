package memory;

public class InfiniteLoop {

	public InfiniteLoop() {
		System.out.println("Constructor");
		try {
		InfiniteLoop obj = new InfiniteLoop();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
			
		}
	}

	public static void main(String[] args) {
		System.out.println("main method");
		InfiniteLoop obj = new InfiniteLoop();
	}
	// will get StackOverflowError
}
