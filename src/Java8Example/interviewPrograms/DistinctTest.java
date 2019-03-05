package Java8Example.interviewPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctTest {
	public static void main(String[] args) {
		List<String> newList = Arrays.asList("a", "b", "c", "a", "d", "b");

		System.out.println(newList.stream().distinct().collect(Collectors.toList()));

		// Need to find how to get distinct employee using one particular field. ex. gender
		List<Employee> empList = Employee.getEmpList();
		List<Employee> list = empList.stream().distinct().collect(Collectors.toList());
		list.forEach(emp -> {
			System.out.println(emp.toString());
		});


	}
}
