package Java8Example.interviewPrograms.useOfEmployee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
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

		System.out.println("--------------------- list of employees with respect to dept");	
		empList.stream()
		.collect(Collectors.groupingBy(p->p.getFirstName()))
		.entrySet()
		.forEach(t->System.out.println(t));
		
		System.out.println("--------------------- distinct employess with respect to first name");
		empList.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Employee:: getFirstName))),
                        ArrayList::new)).forEach(t->System.out.println(t));
		

	}
}
