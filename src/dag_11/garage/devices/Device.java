package dag_11.garage.devices;

public class Device {
	private final String model;
	private final String manufacturer;

	protected Device(Device.Builder builder) {
		this.model = builder.model;
		this.manufacturer = builder.manufacturer;
	}

	@Override
	public String toString() {
		return String.format(
			"Model: %s%nManufacturer: %s",
			this.model,
			this.manufacturer
		);
	}

	protected String getModel() { return this.model; }
	protected String getMaker() { return this.manufacturer; }

	public static class Builder {
		private String model;
		private String manufacturer;

		public Device.Builder setModel(String model) {
			this.model = model;
			return this;
		}

		public Device.Builder setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
			return this;
		}

		public Device build() {
			return new Device(this);
		}
	}
}
