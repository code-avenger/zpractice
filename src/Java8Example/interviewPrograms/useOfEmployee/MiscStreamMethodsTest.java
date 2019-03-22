package Java8Example.interviewPrograms.useOfEmployee;

import java.util.Arrays;
import java.util.List;

public class MiscStreamMethodsTest {
	public static void main(String[] args) {
		List<Employee> empList = Employee.getEmpList();

		System.out.println(empList.stream().count());

		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);
		double dList = intList.stream().mapToDouble(d -> d).sum();

		System.out.println(dList);

		List<String> stList = Arrays.asList("1", "2", "3", "4", "5", "6");
		int d1List = stList.stream().mapToInt(st -> Integer.valueOf(st)).sum();
		System.out.println(d1List);

		// String st = "LIKE%7, IS NOT NULL";
		// String newSt = st.replaceAll("IS NOT NULL", "NOT NULL");
		// System.out.println(newSt);

	}
}
