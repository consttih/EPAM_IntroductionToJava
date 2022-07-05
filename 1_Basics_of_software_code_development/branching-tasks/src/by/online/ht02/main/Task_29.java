package by.online.ht02.main;

//3 points on one straight line

public class Task_29 {

	public static void main(String[] args) {
		
		double x1, y1;
		double x2, y2;
		double x3, y3;
		double a, b, c;
		double d1, d2, d3;
		double accuracy;
		
		x1 = -2;
		y1 = 5;
		x2 = 4;
		y2 = 3;
		x3 = 16;
		y3 = -1;
		accuracy = 1e-15;
		
		a = y2 - y1;
		b = x1 - x2;
		c = x1 * (y1 - y2) + y1 * (x2 - x1);
		
		d1 = Math.abs(a * x1 + b * y1 + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		d2 = Math.abs(a * x2 + b * y2 + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		d3 = Math.abs(a * x3 + b * y3 + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		if(d1 <= accuracy && d2 <= accuracy && d3 <= accuracy) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
