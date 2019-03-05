package StringExamples;
public class StringAppend {
	private static final String TAB = "\t";

	public static void main(String[] args) {
		StringBuilder fileData = new StringBuilder();
		fileData.append("sudeep");
		fileData.append(TAB + "");
		fileData.append(TAB + "");
		fileData.append(TAB + "gangula");

		System.out.println(fileData);
		
		String str="wer1231234567890";
		System.out.println(str.length());
		String last3 = str.substring(str.length() - 10);
		System.out.println(last3);

	}
}
