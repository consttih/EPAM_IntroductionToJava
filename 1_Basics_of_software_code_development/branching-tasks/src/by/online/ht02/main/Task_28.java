package by.online.ht02.main;

public class Task_28 {

	public static void main(String[] args) {
		double a, a2;
		double b, b2;
		double c, c2;
		double max;
		double d;
		
		a = 8;
		b = 9;
		c = 4;
		d = 8;
		a2 = d - a;
		b2 = d - b;
		c2 = d - c;
		
		if (a == d) {
			System.out.println("a = d = " + d);
		}; if (b == d) {
			System.out.println("b = d = " + d);
		}; if (c == d) {
			System.out.println("c = d = " + d);
		}; if (a != d && b != d && c !=d) {
			if (a2 > b2 && a2 > c2) {
				max = a2;
			}if (b2 > a2 && b2 > c2) {
				max = b2;
			}else {
				max = c2;
			}
			System.out.println(max);
		};
		

	}

}
