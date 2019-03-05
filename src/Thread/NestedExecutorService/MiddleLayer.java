package Thread.NestedExecutorService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MiddleLayer implements Callable<Object> {

	private String company;

	Map<String, List<String>> errorMap = new HashMap<String, List<String>>();

	GenerateErrorMap obj;

	public MiddleLayer(String company) {
		this.company = company;
		obj = GenerateErrorMap.getInstance();
	}

	public void processThis(String company) {

		List<String> errorList = new ArrayList<String>();
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 1000; i++) {

			WorkerThread worker = new WorkerThread("C" + i, company);
			Future<Object> future = executor.submit(worker);
			try {
				future.get();
			} catch (Exception e) {
				System.out.println("exception");
				errorList.add("C" + i);
			}

		}
		if (!errorList.isEmpty()) {
			System.out.println(company + " errorlist : " + errorList);
			GenerateErrorMap obj = GenerateErrorMap.getInstance();
			obj.putMap(company, errorList);
			System.out.println("child obj " + obj.hashCode());
			System.out.println("map size " + obj.getErrorMap().size());
		}

		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all child threads For parent " + company);

	}

	public void processThisWithoutCallable(String company) {

		List<String> errorList = new ArrayList<String>();

		for (int i = 0; i < 1000; i++) {

			try {
				WorkerWithorCallable worker = new WorkerWithorCallable();
				worker.processCommand("C" + i, company);
			} catch (Exception e) {
				System.out.println("exception");
				errorList.add("C" + i);
			}

		}
		if (!errorList.isEmpty()) {
			System.out.println(company + " errorlist : " + errorList);

			obj.putMap(company, errorList);
			System.out.println("child obj " + obj.hashCode());
			System.out.println("map size " + obj.getErrorMap().size());
		}

		System.out.println("Finished all child threads For parent " + company);

	}

	@Override
	public Object call() throws Exception {
		processThis(company);// with 2nd lever executor service

		// processThisWithoutCallable(company);// without 2nd level executor
		return null;
	}
}
