package Java8Example.methodReference;

import java.util.function.BiFunction;

interface FirstInterface {
	public void printResult();
}

class AddingClass {

	public static Integer add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}

}

public class PracticeClass {
	public void printName() {
		System.out.println("My name is SudeepG");
	}

	public static void main(String[] args) {

		FirstInterface obj = new PracticeClass()::printName;
		obj.printResult();
		
		BiFunction<Integer, Integer, Integer> ob1 = AddingClass::add;
		BiFunction<Integer, Float, Float> ob2 = AddingClass::add;
		BiFunction<Float, Float, Float> ob3 = AddingClass::add;

		System.out.println(ob1.apply(10, 20));
		System.out.println(ob2.apply(20, 30f));
		System.out.println(ob3.apply(30f, 40f));
	}
}
