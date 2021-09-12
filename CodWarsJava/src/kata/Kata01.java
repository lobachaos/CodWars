package kata;

public class Kata01 {
	
	public static int GetSum (int a , int b) {
		int total = 0;
		
		if(a==b) {
			return a;
		}
		else if (a>b) {
			int abs = b;
			b=a;
			a=abs;
		}
		
		for(int i =a ; i<=b ; i++) {
			total += i;
			
		}
		
		return total;
	}

}
