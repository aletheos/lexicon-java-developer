package dag_15.observer.observers;

public record RadioBroadcaster(String name) implements Observer {
	@Override
	public void update(String news) {
		System.out.printf(
			"""
			This has been %s, news at ten.
			And now, the weather report:
			%s
			""",
			this.name,
			news
		);
	}
}
