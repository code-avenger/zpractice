package Java8Example.interviewPrograms;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxMinLimit {
	public static void main(String[] args) {
		List<Employee> empList = Employee.getEmpList();

		List<Employee> limitThree = empList.stream().limit(3).collect(Collectors.<Employee> toList());
		System.out.println("Limit 3");
		limitThree.forEach(emp -> {

			System.out.println(emp);
		});

		Optional<Employee> maxSalary = empList.stream().max(Comparator.comparing(Employee::getSalary));
		Optional<Employee> minSalary = empList.stream().min(Comparator.comparing(Employee::getSalary));

		System.out.println("maxSalary : " + maxSalary);
		System.out.println("minSalary : " + minSalary);

	}
}
