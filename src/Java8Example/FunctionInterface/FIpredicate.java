package Java8Example.FunctionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//it takes one argument and returns a boolean
public class FIpredicate {
	public static void main(String args[]) 
	{ 

		// create a list of strings 
		List<String> names = 
				Arrays.asList("Geek","GeeksQuiz","g1","QA","qeek2"); 

		// declare the predicate type as string and use 
		// lambda expression to create object 
		Predicate<String> p = (s)->s.startsWith("G"); 

		// Iterate through the list 
		for (String st:names) 
		{ 
			// call the test method 
			if (p.test(st)) 
				System.out.println(st); 
		} 
	} 

}
