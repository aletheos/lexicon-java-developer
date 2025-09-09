package dag_1;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double first, second, result;
		char operator;
		boolean exit = false;

		while (!exit) {
			System.out.print("Enter two numerical values separated by an operator(+, -, *, /):");
			String input = scanner.nextLine().strip();
			if (input.isBlank()) { System.out.println("No equation entered."); continue; }

			String[] arrStrings = input.split(" ");
			if (arrStrings.length != 3 || arrStrings[1].length() > 1) {
				System.out.println("Illegal input: Too many or too few operands entered!\nSeparate your inputs with spaces.\n");
				continue;
			}
			try {
				first = Double.parseDouble(arrStrings[0].strip());
				operator = arrStrings[1].charAt(0);
				if ("+-*/".indexOf(operator) < 0) { throw new IllegalArgumentException(); }
				second = Double.parseDouble(arrStrings[2].strip());
			} catch (Exception e) {
				if (e.getClass() == IllegalArgumentException.class) {
					System.out.println("Illegal input: second input is not a recognized operator (+, -, *, /)\n");
					continue;
				} else {
					System.out.println("Illegal input: Non-numerical data detected! Type using arabic numerals and period for decimal delimiter.\n");
					continue;
				}
			}
			// spännande grej, testa i ett äventyrsspel någon gång
			//for (Scanner s = new Scanner(System.in); s.hasNext(); System.out.print(s.next())) {}
			double rng = new Random(0xDEAFD011L).nextDouble()*1000000;
			System.out.println(rng);
			System.out.println(Math.floor(rng/100%10));
			exit = true;
		}
	}
}
