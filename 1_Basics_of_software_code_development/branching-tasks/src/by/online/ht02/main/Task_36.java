package by.online.ht02.main;

public class Task_36 {

	public static void main(String[] args) {
		
		double x;
		double y;
		
		x = 1;
		
		if (x <= 3) {
			
			y = x * x - 3 * x + 9;
			System.out.print(y);
		}else if (x > 3) {
			
			y = 1 / (x * x * x + 6);
			System.out.print(y);
		};

	}

}
