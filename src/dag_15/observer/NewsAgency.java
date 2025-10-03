package dag_15.observer;

import dag_15.observer.observers.Observer;

import java.util.HashSet;

public class NewsAgency {
	private final HashSet<Observer> subscribers = new HashSet<>();

	private HashSet<Observer> getSubscribers() {
		return subscribers;
	}

	public boolean subscribe(Observer subscriber) {
		return this.subscribers.add(subscriber);
	}

	public boolean unsubscribe(Observer subscriber) {
		return this.subscribers.remove(subscriber);
	}

	public void publish(String news) {
		for (var subscriber : subscribers) {
			System.out.printf("%n════════════════%n");
			try	{
				subscriber.update(news);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.printf("%n════════════════%n");
	}
}
