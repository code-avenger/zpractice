package Java8Example.methodReference;

import java.util.function.BiFunction;

class Arithmetic {
	public static int add(int a, int b) {
		return a+b;  
	}

	public static float add(int a, float b) {
		return a+b;  
	}

	public static float add(float a, float b) {
		return a+b;  
	}  
}

public class StaticMethodReference {  
	public static void main(String[] args) {  

		BiFunction<Integer, Integer, Integer> adder1 = Arithmetic::add;
		BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
		BiFunction<Float, Float, Float> adder3 = Arithmetic::add;

		int intresult1 = adder1.apply(10, 20);
		float floatresult2 = adder2.apply(20, 30.0f);
		float floatresult3 = adder3.apply(30.0f, 40.0f);

		System.out.println(intresult1);
		System.out.println(floatresult2);
		System.out.println(floatresult3);
	}  
}