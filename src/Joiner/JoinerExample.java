package Joiner;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Joiner;

public class JoinerExample {
	public static void main(String[] args) {
		List<String> errors = new ArrayList<>();
		errors.add("ram");
		errors.add("rahim");
		errors.add("robert");
		String delimiter = "\t";
		String errorDescription = Joiner.on(delimiter).join(errors);
		System.out.println(errorDescription);
	}
}
