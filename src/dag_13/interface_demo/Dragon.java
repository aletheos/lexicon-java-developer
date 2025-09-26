package dag_13.interface_demo;

public class Dragon extends Enemy implements MagicUnit{
	public Dragon(String name, int maxHealth) {
		super(name, maxHealth);
	}

	@Override
	public void magicAttack(Actor target) {

	}

	@Override
	public void performAction() {

	}
}
