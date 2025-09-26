package dag_13.interface_demo;

import java.util.ArrayList;
import java.util.List;

public class Game {
	List<Actor> actorList;

	public Game() {
		actorList = new ArrayList<>();
		this.run();
	}

	private void run() {
		actorList.add(new Dragon("Xarnarox", 600));
		actorList.add(new Goblin("Snork", 40));
		actorList.add(new Player("Ale", 100));

		for (var actor : actorList) {
			if (actor instanceof Goblin) {
				System.out.println(
					String.format(
						"%s is a goblin!",
						actor
					)
				);
			}
			if (actor instanceof Dragon) {
				System.out.println(
					String.format(
						"%s is a dragon!",
						actor
					)
				);
			}
			if (actor instanceof Player) {
				System.out.println(
					String.format(
						"%s is a player!",
						actor
					)
				);
			}
			if (actor instanceof Enemy) {
				System.out.println(
					String.format(
						"%s is an enemy!",
						actor
					)
				);
			}
			if (actor instanceof Actor) {
				System.out.println(
					String.format(
						"%s is an actor!",
						actor
					)
				);
			}
		}
	}
}
