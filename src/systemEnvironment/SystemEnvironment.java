package systemEnvironment;
import java.util.Map;


public class SystemEnvironment {
	public static void main(String[] args) {
		Map<String, String> env = System.getenv();
		System.out.println(env.toString().replace(",", "\n"));
		for (String envName : env.keySet()) {
			//System.out.format("%s=%s%n", envName, env.get(envName));
		}

	}

}
