package Java8Example.interviewPrograms.useOfEmployee;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class MainFilterTest {

	public static void main(String[] args) {


		List<Employee> empList = Employee.getEmpList();

		List<Employee> salaryMoreThan800 = EmployeePredicates.filterEmployees(empList, EmployeePredicates.isSalaryGT800());

		System.out.println("List of emp having salry more than 800: ");
		salaryMoreThan800.forEach(emp -> {
			System.out.println(emp.toString());
		});

		List<Employee> maleEmp = EmployeePredicates.filterEmployees(empList, EmployeePredicates.isMale());

		System.out.println();
		System.out.println("List of male emp :");
		maleEmp.forEach(emp -> {
			System.out.println(emp.toString());
		});

		Set<Employee> underManager4 = empList.stream().filter(emp -> emp.getManagerId().equals(new Integer(4))).collect(Collectors.<Employee> toSet());

		System.out.println();
		System.out.println("List of emp under manager harinder singh of emp id = 4:");
		underManager4.forEach(emp -> {
			System.out.println(emp.toString());
		});

		Optional<Employee> findAny = empList.stream().filter(emp -> emp.getManagerId().equals(new Integer(4))).findAny();
		Optional<Employee> findFirst = empList.stream().filter(emp -> emp.getManagerId().equals(new Integer(4))).findFirst();
		System.out.println();
		System.out.println("findAny : " + findAny);
		System.out.println("findFirst : " + findFirst);

		Float totalPrice = empList.stream().map(employee -> employee.getPrice()).reduce(100.0f, (sum, p) -> sum + p);
		System.out.println(totalPrice);
	}
}
