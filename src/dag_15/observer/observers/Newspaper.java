package dag_15.observer.observers;

public record Newspaper(String name) implements Observer {
	@Override
	public void update(String news) {
		System.out.printf(
			"""
			════ %s ❀❀
			Extree Extree!
			%s!
			Read all about it!
			""",
			this.name,
			news
		);
	}
}
