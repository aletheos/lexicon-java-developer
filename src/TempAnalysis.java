import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static java.lang.System.*;

public class TempAnalysis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] weekDays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		double[] weeklyTemp = new double[weekDays.length];
		double totalTemp = 0d;
		for (int i = 0; i < weekDays.length; ++i) {
			System.out.print("Input temperature(in °C) for " + weekDays[i] + ": ");
			double temp = Double.parseDouble(sc.nextLine().replace(',', '.'));
			weeklyTemp[i] = temp;
			totalTemp += temp;
		}

		double avgTemp = 0d;
		avgTemp = totalTemp / weekDays.length;
		System.out.printf("Weekly average temperature is %.2f%n", avgTemp);


		double highestTemp = Double.MIN_VALUE, lowestTemp = Double.MAX_VALUE;
		String highestDay = "", lowestDay = "";
		for (int i = 0; i < weekDays.length; ++i) {
			double temp = weeklyTemp[i]; String day = weekDays[i];
			if (temp < lowestTemp) { lowestTemp = temp; lowestDay = weekDays[i]; }
			if (temp > highestTemp) { highestTemp = temp; highestDay = weekDays[i]; }
		}
		out.printf("The highest temperature this week was %s(%.1f°C)%n", highestDay, highestTemp);
		out.printf("The lowest temperature this week was %s(%.1f°C)%n", lowestDay, lowestTemp);


		//for (int y = 0; y < 10; )
	}
}
