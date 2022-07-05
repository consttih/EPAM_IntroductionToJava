package by.online.ht02.main;

public class Task_16 {

	public static void main(String[] args) {
		
		double x;
		double y;
		
		x = 0;
		y = 0;
		
		if (x > 0 && y > 0) {
			System.out.println("first quarter");
		} else if (x > 0 && y < 0) {
			System.out.println("firth quarter");
		} else if (x < 0 && y > 0) {
			System.out.println("second quarter");
		} else if (x < 0 && y < 0) {
			System.out.println("third quarter");
		} else if (x != 0 && y == 0) {
			System.out.println("axis x");
		} else if (x == 0 && y != 0) {
			System.out.println("axis y");
		} else if (x == 0 && y == 0) {
			System.out.println("center");
        }

    }
}
