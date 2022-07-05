package by.jonline.ht07.main;

public class Task_07 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 10; i += 2) {

			sum += Factorial(i);
		}
		;
		System.out.println(sum);

	};
	
	public static int Factorial(int x1) {
		
		int fact = 1;
		for (int i = 1; i <= x1; i++) {
			fact *= i;
		};
		
		return fact;
	};

}
