package by.jonline.ht03.main;

public class Task_13 {

	public static void main(String[] args) {
		
		double y;
		
		for (double x = -5; x <= 5; x = x + 0.5) {
			
			y = 5 - ((x * x) / 2);
			System.out.println("y = " + y);
		}

	}

}
