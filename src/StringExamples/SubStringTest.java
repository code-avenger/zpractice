package StringExamples;

public class SubStringTest {
	public static void main(String[] args) {
		String st = "1000011100";
		String st1 = st.substring(st.length() - 4);
		Integer it = Integer.valueOf(st1);
		System.out.println(it);
	}
}
