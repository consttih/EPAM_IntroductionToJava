package by.jonline.ht03.main;

public class Task_05 {

	public static void main(String[] args) {

		int a;
		int s;
		a = 1;
		s = 0;
		
		while (a <= 100) {
			if (a % 2 == 1) {
				s = s + a;
			}
			a++;
		};
		
		System.out.print("the sum of odd numbers from 1 to 100 is equal to " + s);
	}

}
