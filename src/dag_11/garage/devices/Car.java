package dag_11.garage.devices;

import dag_11.garage.people.Driver;

public class Car extends Device {
	private final Engine engine;
	private Driver driver;

	protected Car(Device.Builder device, Engine engine) {
		super(device);
		this.engine = engine;
		this.driver = null;
	}

	@Override
	public String toString() {
		return String.format(
			"%s%nEngine: %s%n%s",
			super.toString(),
			this.engine.toString(),
			(this.driver != null ? "Currently driven by: " + this.driver.getName() : "")
		);
	}

	public Driver getDriver() { return driver; }
	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public static class Builder extends Device.Builder {
		private Engine engine;

		public Car.Builder setEngine(Engine engine) {
			this.engine = engine;
			return this;
		}

		public final Car build(Device.Builder device) {
			return new Car(device, this.engine);
		}
	}
}
