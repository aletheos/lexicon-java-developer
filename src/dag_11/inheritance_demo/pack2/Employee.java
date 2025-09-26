package dag_11.inheritance_demo.pack2;

public class Employee {
	private static long _id;

	private String name;
	private long id;
	private double salary;

	public Employee() {
		this.id = _id++;
	}

	public String getName() { return name; }
	public long getId() { return _id; }
	public void setName(String name) { this.name = name; }

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format(
			"""
			#%d: %s
			salary: $%.02f
			""",
			this.id,
			this.name,
			this.salary
		);
	}
}
