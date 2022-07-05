package by.online.ht02.main;

public class Task_13 {

	public static void main(String[] args) {
		
		double x1, y1;
		double x2, y2;
		double l1,l2;
		
		x1 = 2;
		y1 = 3;
		
		x2 = 5;
		y2 = 7;
		
		l1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		l2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
		
		if (l1 < l2) {
			System.out.println("the first point is closer");
		} else if (l2 < l1) {
			System.out.println("the second point is closer");
		}else {
			System.out.println("two points are at the same distance");
		}
	}

	}

