package by.online.ht02.main;

public class Task_15 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double p;
		double u;
		
		a = 5;
		b = 7;
		p = (a + b) / 2;
		u = 2 * a * b;
		
		if (a < b) {
			System.out.println("a < b => " + a + " >> " + p);
			System.out.println("b > a => " + b + " >> " + u);
		} else if (a > b) {
			System.out.println("a > b => " + a + " >> " + u);
			System.out.println("b < a => " + b + " >> " + p);
		}

	}

}
