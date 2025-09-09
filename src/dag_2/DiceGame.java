package dag_2;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rng = new Random();
		boolean exit = false;

		while (!exit) {
			int n, x;
			int yourScore = 0, theirScore = 0;
			System.out.println("\nKasta n antal x-sidiga tärning(ar)\nSyntax: <n>[d<x>]\nExempel: 12d4 (Ifall bara en siffra anges antas antalet sidor vara 6)\nLämna input blankt för att avsluta programmet.");
			var str = sc.nextLine().split("d");
			if (str[0].isBlank()) { exit = true; continue;}

			n = Integer.parseInt(str[0]);
			if(str.length > 1) {
				x = Integer.parseInt(str[1]);
			} else {
				x = 6;
			}

			System.out.print("Du rullade: ");
			for (int i = 0; i < n; i++) {
				System.out.print(i > 0 ? ", " : "");
				int yourDice = rng.nextInt(1, x+1);
				System.out.print(yourDice);
				yourScore += yourDice;
			}
			System.out.print("\nTotalt: " + yourScore + "\nTryck <Enter> for att fortsätta...");

			sc.nextLine();
			System.out.print("Datorn rullade: ");
			for (int i = 0; i < n; i++) {
				System.out.print(i > 0 ? ", " : "");
				int theirDice = rng.nextInt(1, x+1);
				System.out.print(theirDice);
				theirScore += theirDice;
			}
			System.out.print("\nTotalt: " + theirScore + "\nTryck <Enter> for att fortsätta...");
			sc.nextLine();

			System.out.println("\nDina poäng: " + yourScore + "\nDatorns poäng: " + theirScore);
			System.out.println("\n"+(yourScore > theirScore ? "Du" : yourScore == theirScore ? "Ingen" : "Datorn") + " vann spelet!");
			System.out.print("Vill du spela igen? J/[N]");
			String cmd = sc.nextLine();
			if(cmd.isBlank() || cmd.toUpperCase().charAt(0) != 'J') { exit = true; }
		}

		System.out.println("Hej då!");
	}
}
