package kata;

public class Kata05 {
	// https://www.codewars.com/kata/5506b230a11c0aeab3000c1f/train/java

	public static int evaporator(double content, double evap_per_day, double threshold) {
		int days = 0;
		double conversion = content *(threshold / 100);
		

		while (content > conversion) {

			content -= (content * (evap_per_day / 100));
			days++;
		}
		return days;

	}
}
