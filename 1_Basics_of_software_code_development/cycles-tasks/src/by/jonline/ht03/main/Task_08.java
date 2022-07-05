package by.jonline.ht03.main;

public class Task_08 {

	public static void main(String[] args) {
		int b;
		int h;
		int y;
		int c;
		c = 2;
		b = 20;
		h = 5;
		
		for (int a = 0; a <= b; a = a + h) {
			if (a == 15) {
				y = (a + c) * 2;
				System.out.println("y = " + y);
			}else if (a != 15) {
				y = (a - c) + 2;
				System.out.println("y = " + y);
			}
		};
	}

}
