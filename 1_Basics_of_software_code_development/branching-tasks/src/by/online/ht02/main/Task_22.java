package by.online.ht02.main;

public class Task_22 {

	public static void main(String[] args) {
		double x;
		double y;
		double c;
		
		x = 7;
		y = 7;
		
		if (x > y) {
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}else if (y > x) {
			c = y;
			y = x;
			x = c;
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}else {
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
		
	}

}
