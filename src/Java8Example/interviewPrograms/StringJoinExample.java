package Java8Example.interviewPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinExample {
	public static void main(String[] args) {

		// String.join
		String output1 = String.join(", ", "java", "c++", "python");
		System.out.println(output1);

		List<String> list = Arrays.asList("ram", "rahim", "robert");
		String output2 = String.join(" | ", list);
		System.out.println(output2);

		String[] arrList = { "one", "two", "three" };
		String output3 = String.join(" ** ", arrList);
		System.out.println(output3);
		
		// StringJoiner
		StringJoiner stj = new StringJoiner(",");
		stj.add("sunday");
		stj.add("monday");
		stj.add("tuesday");
		System.out.println(stj);
	}
}
