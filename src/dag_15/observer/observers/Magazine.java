package dag_15.observer.observers;

public record Magazine(String name) implements Observer {
	@Override
	public void update(String news) {
		System.out.printf(
			"""
			▄▀▄▀ %s ▄▀▄▀
			Anonymous sources state:
			%s
			
			How will this affect the royal wedding?
			""",
			this.name,
			news
		);
	}
}
