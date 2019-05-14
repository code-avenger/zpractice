package Java8Example.interviewPrograms.useOfEmployee;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {

	public static Predicate<Employee> isMale() {
		return E -> E.getGender().equalsIgnoreCase("male");
	}

	public static Predicate<Employee> isFemale() {
		return E -> E.getGender().equalsIgnoreCase("female");
	}

	public static Predicate<Employee> isSalaryGT800() {
		return E -> E.getSalary().compareTo(new BigDecimal(800)) > 0;
	}

	public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
		return employees.stream().filter(predicate).collect(Collectors.<Employee> toList());
	}

}
