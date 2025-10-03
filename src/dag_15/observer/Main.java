package dag_15.observer;

import dag_15.observer.observers.Magazine;
import dag_15.observer.observers.Newspaper;
import dag_15.observer.observers.RadioBroadcaster;
import dag_15.observer.observers.TelevisionBroadcaster;

public class Main {
	public static void main(String[] args) {
		NewsAgency TT = new NewsAgency();

		TT.subscribe(new Magazine("Dagens Korvstoppning"));
		TT.subscribe(new Newspaper("The Daily Planet"));
		TT.subscribe(new TelevisionBroadcaster("SVT"));
		TT.subscribe(new TelevisionBroadcaster("NewFinancialTimes"));
		TT.subscribe(new RadioBroadcaster("The BBC"));
		TT.subscribe(
			news -> System.out.printf(
				"""
				 SOUP NEWS
				%s
				
				But... Soup is here to stay!
				""",
				news
			)
		);

		TT.publish("Storm brewing between the western and eastern front!");
	}
}
