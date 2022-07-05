package by.online.ht02.main;

public class Task_08 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double aa;
		double bb;
		
		a = 6;
		b = 6;
		
		aa = Math.pow(a, 2);
		bb = Math.pow(b, 2);
		
		if (aa < bb) {
			System.out.println("the smallest quadrate is " + aa);
		} else if (aa == bb) {
			System.out.println("the quadrates are equally");
		} else {
			System.out.println("the smallest quadrate is " + bb);
		}

	}

}
