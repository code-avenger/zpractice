package StringExamples;

public class StringObjectConversation {
	public static void main(String[] args) {
		String s = "sudeep";
		String n = "";

		String st = new String(s);
		String nt = new String(n);

		if (nt == null) {
			System.out.println("null");
		}
	}
}

