package dag_11.garage.people;

import dag_11.garage.devices.Car;

import java.util.ArrayList;

public class Driver extends Professional {
	private final ArrayList<String> licences;
	private Car car;

	public Driver(String name, int age, String culture, String expertise, int yearsOfExperience) {
		super(name, age, culture, expertise, yearsOfExperience);
		this.licences = new ArrayList<>();
	}

	public Car getCar() { return this.car; }
	public void setCar(Car car) {
		this.car = car;
	}

	public boolean addLicence(String licence) {
		if (licences.contains(licence)) { return false; }
		return licences.add(licence);
	}
	public boolean removeLicence(String licence) {
		if (!licences.contains(licence)) { return false; }
		return licences.remove(licence);
	}

	@Override
	public String toString() {
		return String.format(
			"%s%n%s",
			super.toString(),
			this.car != null ? String.format("Currently driving a %s", this.car) : "Currently not driving"
		);
	}
}
