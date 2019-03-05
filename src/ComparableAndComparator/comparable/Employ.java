package ComparableAndComparator.comparable;

public class Employ implements Comparable<Employ> {
	private String id;
	private String name;

	public Employ(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employ o) {
		// TODO Auto-generated method stub

		if (o.id.equals(this.id)) {
			return 1;
		} else {
			return 0;
		}
	}
}
