package dag_11.garage.people;

public class Person {
	private final String name;
	private final int age;
	private final String culture;

	public Person(String name, int age, String culture) {
		this.name = name;
		this.age = age;
		this.culture = culture;
	}

	public String getName() { return this.name; }
	public int getAge() { return this.age; }
	public String getCulture() { return this.culture; }

	@Override
	public String toString() {
		return String.format(
			"%s, %d, %s",
			this.name,
			this.age,
			this.culture
		);
	}
}
