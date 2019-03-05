package systemEnvironment;
public class SystemExitExample {
	public static void main(String[] args) {
		try {
			System.out.println("in try block");
			int i = 1 / 0;

			System.out.println("after");
		} catch (Exception e) {
			System.out.println("in catch block");
		} finally {
			System.out.println("in finally 1");
			System.exit(0);
			System.out.println("in finally");
		}
	}

}
