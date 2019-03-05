package Java8Example.ComparatorUsingLambdas;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("AAAA", Long.valueOf(4)));
		empList.add(new Employee("aAAA", Long.valueOf(2)));
		empList.add(new Employee("bAAA", Long.valueOf(1)));
		empList.add(new Employee("BAAA", Long.valueOf(3)));

		System.out.println("Before: " + empList + "\n");

		// This is using collator. Result will be like aA, AA,bB, BB
		empList.sort((l1, l2) -> Collator.getInstance().compare(l1.getName(), l2.getName()));
		System.out.println("After using collator: " + empList + "\n");

		// This is without using collator. Result will be like AA, BB, aA, bB
		Collections.sort(empList,
				(p1, p2) -> p1.getName().compareTo(p2.getName()));
		System.out.println("After without using collator: " + empList + "\n");


		Collections.sort(empList, (p1, p2) -> p1.getId().compareTo(p2.getId()));
		System.out.println("After id: " + empList + "\n");

	}
}
