package dag_11.garage.devices;

public class Engine extends Device {
	private final String fuel;
	private final int torque;

	protected Engine(Device.Builder device, String fuel, int torque) {
		super(device);
		this.fuel = fuel;
		this.torque = torque;
	}

	@Override
	public String toString() {
		return String.format("%s, %s\n\tTorque: %s\n\tFuel: %s", super.getMaker(), super.getModel(), this.getTorque(), this.getFuel());
	}

	public String getFuel() { return this.fuel; }
	public int getTorque() { return this.torque; }

	public static class Builder extends Device.Builder{
		private String fuel;
		private int torque;

		public Engine.Builder setFuel(String fuel) {
			this.fuel = fuel;
			return this;
		}

		public Engine.Builder setTorque(int torque) {
			this.torque = torque;
			return this;
		}

		public final Engine build(Device.Builder device) {
			return new Engine(device, this.fuel, this.torque);
		}
	}
}
