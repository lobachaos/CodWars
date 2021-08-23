package kata;

import java.util.Arrays;

public class Kata07 {
	// https://www.codewars.com/kata/550498447451fbbd7600041c/train/java
	// Are they the "same"?

	public static boolean comp(int[] a, int[] b) {

		if (a == null || b == null)
			return false;
		if (a.length != b.length)
			return false;

		int[] sortedA = Arrays.stream(a).map(x -> x * x).sorted().toArray();
		int[] sortedB = Arrays.stream(b).sorted().toArray();
		return Arrays.equals(sortedA, sortedB);
	}
}
