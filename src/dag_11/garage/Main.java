package dag_11.garage;

import dag_11.garage.devices.*;
import dag_11.garage.people.Driver;

public class Main {
	public static void main() {
		Car c = new Car.Builder()
			.setEngine(
				new Engine.Builder()
					.setTorque(1500)
					.setFuel("E95")
					.build(
						new Device.Builder()
							.setModel("Herpa")
							.setManufacturer("Rolls-Royce")
					)
			)
			.build(
				new Device.Builder()
					.setManufacturer("Volvo")
					.setModel("999-S")
			);
		Driver d = new Driver("Matthias Johnsson", 23, "Norwegian", "High-speed manoeuvres", 12);
		d.addLicence("B");
		c.setDriver(d);
		d.setCar(c);
		System.out.println(d);
	}
}
