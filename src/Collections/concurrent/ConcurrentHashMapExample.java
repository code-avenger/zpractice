package Collections.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
		concurrentHashMap.put("A", "Apple");
		concurrentHashMap.put("B", "Blackberry");

		concurrentHashMap.keySet().forEach(e -> {
			System.out.println(concurrentHashMap.get(e));
		});

	}
}