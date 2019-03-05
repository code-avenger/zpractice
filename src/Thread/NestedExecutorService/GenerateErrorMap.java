package Thread.NestedExecutorService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenerateErrorMap {

	Map<String, List<String>> errorMap = new HashMap<String, List<String>>();

	public static GenerateErrorMap obj;

	public Map<String, List<String>> getErrorMap() {
		return errorMap;
	}

	public void setErrorMap(Map<String, List<String>> errorMap) {
		this.errorMap = errorMap;
	}

	private GenerateErrorMap() {

	}

	synchronized public static GenerateErrorMap getInstance() {

		if (obj == null) {

			System.out.println("created new");
			obj = new GenerateErrorMap();

		}

		return obj;
	}

	public void putMap(String company, List<String> errorlist) {
		errorMap.put(company, errorlist);
	}

}
