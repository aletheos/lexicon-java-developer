package dag_13.interface_demo;

public class Orc extends Enemy implements MeleeUnit {
	public Orc(String name, int maxHealth) {
		super(name, maxHealth);
	}

	@Override
	public void meleeAttack(Actor target) {

	}

	@Override
	public void performAction() {
	}
}
