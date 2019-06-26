package StringExamples;
import java.util.StringTokenizer;


public class StringSwap {
	public static void main(String[] args) {
		String a = "sudeep";
		String b = "gangula";

		a=a+b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		String c = "sudeep; gangula";

		StringTokenizer st = new StringTokenizer(c, ";");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
