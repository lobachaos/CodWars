package kata;

public class LikesIt {

	public static String whoLikesIt(String... names) {

		if (names == null || names.length == 0) {
			return "no one likes this";
		} else if (names.length == 1) {
			return names[0] + " likes this";
		} else if (names.length == 2) {
			return names[0] + " and " + names[1] + " likes this";
		} else if (names.length == 3) {
			return names[0] + ", " + names[1] + " and " + names[2] + " likes this";
		}
		return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";

	}

}
/*
 * You probably know the "like" system from Facebook and other pages. People can
 * "like" blog posts, pictures or other items. We want to create the text that
 * should be displayed next to such an item.
 * 
 * Implement the function which takes an array containing the names of people
 * that like an item. It must return the display text as shown in the examples
 */
//Note: For 4 or more names, the number in "and 2 others" simply increases.