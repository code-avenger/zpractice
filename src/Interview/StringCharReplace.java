package Interview;

/**
 * Write a Java program to replace certain characters from String like
 * 
 * Read more: http://www.java67.com/2012/08/10-java-coding-interview-questions-and.html#ixzz4hz7GFLty
 * 
 * @author sudeep.gangula
 *
 */
public class StringCharReplace {

	public static void main(String[] args) {
		String str = "This is bangalore. It's a cool place to hang around.";
		char ch = 'a';

		System.out.println("Before:  " + str);
		str = replace(str, ch);
		System.out.println("After replace iterative method:  " + str);

		str = replaceByInBuiltMethod(str, 't');
		System.out.println("After replace using in built method:  " + str);

	}

	public static String replace(String str, char ch) {

		char[] charArray = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				charArray[i] = '#';
			}
		}
		return new String(charArray);

	}

	public static String replaceByInBuiltMethod(String str, char ch) {

		str.replace(ch, '#');
		return str;

	}
}
