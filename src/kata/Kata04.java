package kata;

public class Kata04 {
	// https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java

	public static String capitalize(String str) {
		return Character.toUpperCase(str.charAt(0)) + str.substring(1);
	}

	public static String toJadenCase(String frase) {
		if (frase == null || frase.isEmpty()) {
			return null;
		}

		String[] array = frase.split(" ");
		String outraString = "";
		for (String s : array) {
			outraString += capitalize(s) + " ";
		}

		return outraString.substring(0, outraString.length() - 1);
	}
	
	

}
