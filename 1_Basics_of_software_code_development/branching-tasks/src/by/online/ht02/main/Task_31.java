package by.online.ht02.main;

public class Task_31 {

	public static void main(String[] args) {
		
		double x, y, z;
		double a, b;
		
		x = 6;
		y = 6;
		z = 6;
		
		a = 6;
		b = 8;
		
		if ((y <= a && z <= b)||(z <= a && y <= b)) {
			System.out.print("Yes");
		}else if ((x <= a && z <= b)||(z <= a && x <= b)){
			System.out.print("Yes");
		}else if ((y <= a && x <= b)||(x <= a && y <= b)){
			System.out.print("Yes");
		}else {
			System.out.print("No");
		};

	}

}
