package kata;

public class TwiceAsOld {
	public static int TwiceAsOldCheck(int dadYears, int sonYears) {
		
		
		int doubleAge = Math.abs(sonYears * 2) ;
		
		return Math.abs(dadYears - doubleAge);

	}
}

/*
 * Your function takes two arguments:
 * 
 * current father's age (years) current age of his son (years)
 * 
 * Сalculate how many years ago the father was twice as old as his son (or in
 * how many years he will be twice as old).
 * 
 */