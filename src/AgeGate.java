import java.util.Scanner;

public class AgeGate {
	static String[] categories = { "Barn", "Tonåring", "Vuxen", "Senior" };
	int age;
	int category;

	public void run() {
		System.out.print("Skriv personens ålder: ");
		try { age = new Scanner(System.in).nextInt(); }
		catch(Exception e) {
			System.out.println("Felaktig inmatning: inte en heltalssiffra!");
			category = -2;
			return;
		}
		if (age < 0)       { category = -1; }
		else if (age < 13) { category = 0; }
		else if (age < 20) { category = 1; }
		else if (age < 65) { category = 2; }
		else               { category = 3; }

		System.out.println("Denna person är " + (category < 0 ? "inte född än" : (category > 0 ? "en " : "ett ") + categories[category].toLowerCase()));
	}

	public static void main(String[] args) {
		AgeGate o = new AgeGate();
		o.run();
		System.exit(o.category);
	}
}
