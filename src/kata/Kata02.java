package kata;

public class Kata02 {
	public static int nbYear(int p0, double percent, int aug, int p) {
		int pop = p0;
		double tax =(percent/100);
		int a = aug;
		int pTotal = p;
		int years = 0;
		
		while(pop < pTotal) {
			pop = (int) (pop +( pop*tax) + a);
			years++;
		}
		
		
		
		return years;
		
    }

}
