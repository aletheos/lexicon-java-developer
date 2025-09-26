package dag_13.abstract_demo;

import java.util.ArrayList;

public class Game {
	ArrayList<Actor> actorList;

	public Game() {
		actorList = new ArrayList<>();
		this.run();
	}

	private void run() {
		actorList.add(new Dragon());
		actorList.add(new Goblin());
		actorList.add(new Player());

		for (var actor : actorList) {
			if (actor instanceof Goblin) {
				System.out.println(actor + " är en goblin!");
			}
			if (actor instanceof Dragon) {
				System.out.println(actor + " är en dragon!");
			}
			if (actor instanceof Player) {
				System.out.println(actor + " är en player!");
			}
			if (actor instanceof Enemy) {
				System.out.println(actor + " är en enemy!");
			}
			if (actor instanceof Actor) {
				System.out.println(actor + " är en actor!");
			}
		}
	}
}
