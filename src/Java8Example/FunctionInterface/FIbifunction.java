package Java8Example.FunctionInterface;

import java.util.function.BiFunction;

//it takes two arguments and returns a result
public class FIbifunction {
    public static void main(String args[]) {
	// BiFunction to add 2 numbers
	// BiFunction<Integer, Integer, Integer> add = (a, b) -> {
	// int c = a + b;
	// int d = c * 2;
	// return d;
	// };

	Testing obj = new Testing();
	// Implement add using apply()
	System.out.println("Sum = " + obj.add.apply(2, 3));

	// BiFunction to multiply 2 numbers
	BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

	// Implement add using apply()
	System.out.println("Product = " + multiply.apply(2, 3));
    }
}

class Testing {
    BiFunction<Integer, Integer, Integer> add = (a, b) -> {
	int c = a + b;
	int d = c * 2;
	return d;
    };
}
