package Java8Example.interviewPrograms.useOfEmployee;

import java.util.List;
import java.util.function.Predicate;

public class AllMatchTest {
	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList();
		
		Predicate<Employee> isMale=E -> E.getGender().equalsIgnoreCase("male");

		boolean b1 = list.stream().allMatch(isMale);
		System.out.println(b1);

		List<Employee> maleEmp = EmployeePredicates.filterEmployees(list, EmployeePredicates.isMale());

		boolean b11 = maleEmp.stream().allMatch(isMale);
		System.out.println(b11);

		boolean b2 = list.stream().anyMatch(isMale);
		System.out.println(b2);

		boolean b3 = list.stream().noneMatch(isMale);
		System.out.println(b3);
	}
}
