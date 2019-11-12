package Java8Example.interviewPrograms.useOfEmployee;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	private Integer id;
	private String firstName;
	private String lastName;
	private BigDecimal salary;
	private String dept;
	private String gender;
	private Integer managerId;
	private Float price;

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Employee() {}
	
	public Employee(int id2, String firstName2, String lastName2, String gender2, BigDecimal salary2, String dept2, int managerId2, Float price) {
		super();
		this.id = id2;
		this.firstName = firstName2;
		this.lastName = lastName2;
		this.salary = salary2;
		this.dept = dept2;
		this.gender = gender2;
		this.managerId = managerId2;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigDecimal getSalary() {
		return salary.setScale(2, RoundingMode.CEILING);
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary.setScale(2, RoundingMode.FLOOR) + ", dept="
				+ dept + ", gender=" + gender
				+ ", managerId=" + managerId + "]";
	}

	public static List<Employee> getEmpList() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "ram", "nath", "male", new BigDecimal(1000.11), "mgmt", 1, 11.11f));
		empList.add(new Employee(2, "rahim", "basha", "male", new BigDecimal(800.11), "marketing", 1, 22.22f));
		empList.add(new Employee(3, "ram", "perry", "female", new BigDecimal(850.11), "sales", 1, 33.33f));
		empList.add(new Employee(4, "harinder", "singh", "male", new BigDecimal(830.11), "prod", 1, 44.44f));
		empList.add(new Employee(5, "ram", "lui", "male", new BigDecimal(400.11), "sales", 3, 55.55f));
		empList.add(new Employee(6, "zeno", "bakuku", "male", new BigDecimal(500.11), "prod", 4, 66.66f));
		empList.add(new Employee(7, "ema", "ponting", "female", new BigDecimal(600.11), "prod", 4, 77.77f));
		empList.add(new Employee(8, "swaleha", "parvin", "female", new BigDecimal(700.11), "prod", 7, 88.88f));
		return empList;
	}
}
