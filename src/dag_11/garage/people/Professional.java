package dag_11.garage.people;

public class Professional extends Person {
	private final String expertise;
	private final int yearsOfExperience;
	private double salary;

	public Professional(String name, int age, String culture, String expertise, int yearsOfExperience) {
		super(name, age, culture);
		this.expertise = expertise;
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getExpertise() { return expertise; }
	public int getYearsOfExperience() { return yearsOfExperience; }
	public double getSalary() { return salary; }
}
