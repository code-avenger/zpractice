package Java8Example.ComparatorUsingLambdas;

public class Employee {

	private String name;
	private Long id;

	public Employee(String name, Long i) {
		super();
		this.name = name;
		this.id = i;
	}
	
	public Employee() {
		super();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
}
