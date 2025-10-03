package dag_15.observer.observers;

import dag_15.observer.exceptions.NoSignalException;

public record TelevisionBroadcaster(String name) implements Observer {
	/**
	 * throws a RuntimeException
	 */
	@Override
	public void update(String news) {
		throw new NoSignalException("! NO SIGNAL !");
	}
}
