package StringExamples;

import java.util.ArrayList;
import java.util.List;

/*
 * List<object> wont allow List<string> as parameter
 */
public class StringObject {
	public static void main(String[] args) {
		Object obj = new Object();
		String st = new String("sudeep");

		List<StringObject> stList = new ArrayList<>();
		StringObject ob = new StringObject();
		stList.add(ob);

		//nameTest1(stList);
	}

	public static void nameTest() {
		System.out.println("nameTest");
	}

	public static void nameTest1(List<Object> ob) {
		System.out.println("nameTest1");
	}
}

class student{
	
}
