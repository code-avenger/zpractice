package Collections.hashMap;
import java.util.HashMap;


public class HashMapClassTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();

		System.out.println(map.put("s", "sudeep"));
		System.out.println(map.put("n", "naveen"));
		System.out.println(map.put("m", "manas"));
		System.out.println(map.put("s", "sagar"));
	
		// System.out.println(map.get("m"));
		System.out.println(map);
	
	}
}
