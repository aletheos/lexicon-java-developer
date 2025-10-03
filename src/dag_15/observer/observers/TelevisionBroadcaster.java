package dag_15.observer.observers;

public record TelevisionBroadcaster(String name) implements Observer {
	@Override
	public void update(String news) {
		System.out.print(
			"""
			! NO SIGNAL !
			"""
		);
	}
}
