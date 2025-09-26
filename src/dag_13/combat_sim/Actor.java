package dag_13.combat_sim;

public abstract class Actor {
	String name;
	int maxHealth;
	int currentHealth;

	public Actor(String name, int maxHealth) {
		this.name = name;
		this.maxHealth = maxHealth;
		this.currentHealth = maxHealth;
	}

	public abstract void performAction();

	@Override
	public String toString() {
		return this.name;
	}
}
