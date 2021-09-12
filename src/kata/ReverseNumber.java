package kata;

public class ReverseNumber {
	public static int reverse(int number) {
		int reverse = 0;

		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;

		}
		return reverse;
	}

}
