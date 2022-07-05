package by.online.ht02.main;

public class Task_27 {

	public static void main(String[] args) {
		
		double a, b, c, d;
		double min1, min2;
		double max;
		
		a = 8;
		b = 6;
		c = 8;
		d = 3;
		
		if (a >= b) {
			min1 = b;
		}else {
			min1 = a;
		}
		if (c >= d) {
			min2 = d;
		}else {
			min2 = c;
		}
		if (min1 >= min2) {
			max = min1;
		}else {
			max = min2;
		}
		System.out.println(max);
	}

}
