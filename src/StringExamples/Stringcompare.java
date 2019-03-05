package StringExamples;
/**
 * @author Sudeep Gangula
 *
 */

public class Stringcompare {

	public static String str3 = "abcdefgh";
	
	public static void main(String[] args) {
		
		String str1 = new String("abcxyz");
		String str2 = "abcxyz";
		String str3 = "abcxyz";
		
		
		System.out.println(str2.equals(str3));
		System.out.println(str2==str3);
		
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3);
	}
}
