package Java8Example.interviewPrograms.useOfEmployee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByTest {
	public static void main(String[] args) {
		List<Employee> empList = Employee.getEmpList();

		Map<String, List<Employee>> byGender = empList.stream().collect(Collectors.groupingBy(Employee::getGender));
		System.out.println();
		System.out.println("byGender  :");
		byGender.forEach((k, v) -> {
			System.out.println("Gender :" + k);
			v.forEach(System.out::println);
		});

		Map<String, List<Employee>> byDept = empList.stream().collect(Collectors.groupingBy(Employee::getDept));
		System.out.println();
		System.out.println("byDept  :");
		byDept.forEach((k, v) -> {
			System.out.println("Dept :" + k);
			v.forEach(System.out::println);
		});
	}
}
