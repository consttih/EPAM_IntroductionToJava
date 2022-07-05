package by.online.ht02.main;

public class Task_14 {

	public static void main(String[] args) {
		
		double a;
		double b;
		
		a = 100;
		b = 30;
		
		if (a + b < 180) {
			
			if (a == 90 || b == 90 || a + b == 90) {
				System.out.println("the triangle is rectangular");
			} else {
				System.out.println("the triangle is not rectangular");
			}
			
		} else {
			System.out.println("the triangle does not exist");
		}

	}

}
