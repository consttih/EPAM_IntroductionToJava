package by.jonline.ht04.main;

public class Task_03 {

	public static void main(String[] args) {

		// промежуток от -100 до 100

		int n = 20;
		int positive = 0;
		int nul = 0;
		int negative = 0;

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = ((int) (Math.random() * 201) - 100);
			System.out.println((i + 1) + ") " + a[i]);

			if (a[i] > 0) {

				positive += 1;

			} else if (a[i] == 0) {

				nul += 1;

			} else if (a[i] < 0) {

				negative += 1;

			}
			;
		}
		;
		System.out.println("number of positive numbers is " + positive);
		System.out.println("number of numbers equal to 0 is " + nul);
		System.out.println("number of negative numbers is " + negative);

	}

}
