package Java8Example.FunctionInterface;

import java.util.function.BiFunction;

//it takes two arguments and returns a result
public class FIbifunction {
	public static void main(String args[]) 
	{ 
		// BiFunction to add 2 numbers 
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b; 

		// Implement add using apply() 
		System.out.println("Sum = " + add.apply(2, 3)); 

		// BiFunction to multiply 2 numbers 
		BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b; 

		// Implement add using apply() 
		System.out.println("Product = " + multiply.apply(2, 3)); 
	} 
}
