package by.online.ht02.main;

//sum of min and max

public class Task_26 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double max;
		double min;
		double sum;
		
		a = 0;
		b = 3;
		c = 1;
		
		if (a >= b && a >= c) {
			if (b >= c) {
				max = a;
				min = c;
			}else {
				max = a;
				min = b;
			}
			sum = max + min;
			System.out.println(sum);
		};
		if (b >= a && b >= c) {
			if (a >= c) {
				max = b;
				min = c;
			}else {
				max = b;
				min = a;
			}
			sum = max + min;
			System.out.println(sum);
		};
		if (c >= b && c >= a) {
			if (b >= a) {
				max = c;
				min = a;
			}else {
				max = c;
				min = b;
			}
			sum = max + min;
			System.out.println(sum);
		}; 
		

	}

}
