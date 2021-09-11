package kata;

import java.util.Arrays;
import java.util.stream.Stream;

public class YouOnlyNeedOne {
	public static boolean check(Object[] a, Object x) {
		Stream<Object> stream = Arrays.stream(a);
		return stream.anyMatch(p -> p.equals(x));
	}
	/*
	 * You will be given an array a and a value x. All you need to do is check
	 * whether the provided array contains the value.
	 * 
	 * Array can contain numbers or strings. X can be either.
	 * 
	 * Return true if the array contains the value, false if not.
	 * 
	 */
}
