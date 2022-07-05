package by.online.ht02.main;

public class Task_10 {
	
	public static void main(String[] args) {
		
		double r1;
		double r2;
		double s1;
		double s2;
		
		r1 = 4;
		r2 = 3;
		
		s1 = 3.14159 * Math.pow(r1, 2);
		s2 = 3.14159 * Math.pow(r2, 2);
		
		if (s1 < s2) {
			System.out.println("the first circle is smaller");
		} else if (s2 < s1) {
			System.out.println("the second circle is smaller");
		}else {
			System.out.println("two circles are equally");
		}
	}

}
