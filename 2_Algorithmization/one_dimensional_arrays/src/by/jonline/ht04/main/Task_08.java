package by.jonline.ht04.main;

public class Task_08 {

	public static void main(String[] args) {

		int n = 20;

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = ((int) (Math.random() * 11) - 10);
			System.out.print((i + 1) + ")" + a[i] + "; ");
		}
		;

		int min = a[0];

		for (int j = 0; j < a.length; j++) {

			if (a[j] <= min) {
				min = a[j];
			}
			;
		}
		;
		System.out.println();
		System.out.println("min = " + min);

		int g = 0;
		for (int q = 0; q < a.length; q++) {

			if (a[q] == min) {
				g += 1;
			}
			;

		}
		;

		int[] b = new int[n - g];
		int[] c = new int[n];

		for (int k = 0; k < a.length; k++) {
			if (a[k] == min) {
				c[k] = a[k];
			} else {
				b[k] = a[k];
			}
		}
		;

		for (int l = 0; l < b.length; l++) {
			System.out.print((l + 1) + ")" + b[l] + "; ");
		}

	};

}
