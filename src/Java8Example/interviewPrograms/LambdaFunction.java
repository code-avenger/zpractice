package Java8Example.interviewPrograms;

import java.util.function.Function;

public class LambdaFunction {
	public static void main(String[] args) {
	
		Function<Integer, Integer> add = a -> a + 5;

		System.out.println(add.apply(7));
}
}
