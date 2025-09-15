package dag_2;

import java.util.Scanner;
import static java.lang.System.*;

public class TempAnalysis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] weekDays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		double[] weeklyTemp = new double[weekDays.length];
		double totalTemp = 0d;
		for (int i = 0; i < weekDays.length; ++i) {
			out.print("Input temperature(in °C) for " + weekDays[i] + ": ");
			double temp = Double.parseDouble(sc.nextLine().replace(',', '.'));
			weeklyTemp[i] = temp;
			totalTemp += temp;
		}

		double avgTemp = 0d;
		avgTemp = totalTemp / weekDays.length;
		out.printf("Weekly average temperature is %.2f%n", avgTemp);

		double highestTemp = Double.MIN_VALUE, lowestTemp = Double.MAX_VALUE;
		String highestDay = "", lowestDay = "";
		for (int i = 0; i < weekDays.length; ++i) {
			double temp = weeklyTemp[i]; String day = weekDays[i];
			if (temp < lowestTemp) { lowestTemp = temp; lowestDay = weekDays[i]; }
			if (temp > highestTemp) { highestTemp = temp; highestDay = weekDays[i]; }
		}
		out.printf("The highest temperature this week was %s(%.1f°C)%n", highestDay, highestTemp);
		out.printf("The lowest temperature this week was %s(%.1f°C)%n", lowestDay, lowestTemp);

		int daysOverTwenty = 0;
		for (var temp : weeklyTemp) { if(temp >= 20d) { ++daysOverTwenty; } }
		out.printf("There were %d days that were 20°C or more this week.%n", daysOverTwenty);
		out.printf("Press <Enter> to draw temperature graph..."); sc.nextLine();
		String[] rows = new String[25];
		for (int y = 0; y < rows.length; y++) {
			String row = "";
			for (int x = 0; x < weekDays.length; x++) {
				row += weeklyTemp[x] >= 2*y ? "██████████" : "          ";
			}
			if (y % 4 == 0) { row += " " + y*2 + "°C"; }
			rows[rows.length - 1 - y] = row;
		}
		for (var row : rows) { out.printf("%s%n", row); }
		for (var day : weekDays) { out.printf("%-10s", day); }
		out.printf("%n");
		for (var temp : weeklyTemp) { out.printf("%-10.1f", temp); }
	}
}
