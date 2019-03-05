package Thread.NestedExecutorService;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThreadPool {
	public static void main(String[] args) {
		long start = Calendar.getInstance().getTimeInMillis();
		List<String> companyList = new ArrayList<String>();
		companyList.add("P1");
		companyList.add("P2");
		companyList.add("P3");
		companyList.add("P4");
		companyList.add("P5");
		companyList.add("P6");
		companyList.add("P7");
		companyList.add("P8");

		ExecutorService executor = Executors.newFixedThreadPool(5);

		for (String company : companyList) {
			MiddleLayer layer = new MiddleLayer(company);
			executor.submit(layer);

		}

		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		GenerateErrorMap obj = GenerateErrorMap.getInstance();
		System.out.println("main obj " + obj.hashCode());
		Map<String, List<String>> map = obj.getErrorMap();
		if (!map.isEmpty()) {
			Set<String> keyset = map.keySet();

			for (String key : keyset) {
				System.out.println("for parent " + key + " error list " + map.get(key));
			}

		}
		System.out.println("Finished all main threads");
		long end = Calendar.getInstance().getTimeInMillis();

		System.out.println("time consumed: " + (end - start));
	}
}
