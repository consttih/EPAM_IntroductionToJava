package by.jonline.ht03.main;

public class Task_07 {

	public static void main(String[] args) {
		int b;
		int h;
		int y;
		b = 5;
		h = 1;
		
		for (int a = 1; a <= b; a = a + h) {
			if (a > 2) {
				y = a;
				System.out.println("y = " + y);
			}else if (a <= 2) {
				y = -a;
				System.out.println("y = " + y);
			}
		};
	}

}
