package by.jonline.ht04.main;

public class Task_06 {

	public static void main(String[] args) {

		int m = 15;
		int n = 101;
		double[] perm = new double[n];

		for (int j = 0; j < n; j++) {

			double w = j * Math.random();
			perm[j] = w;
		}
		;

		for (int i = 0; i < m; i++) {

			int r = i + (int) (Math.random() * (n - i));
			double t = perm[r];
			perm[r] = perm[i];
			perm[i] = t;
			System.out.print((i + 1) + ") " + perm[i] + " ");

		}
		;
		System.out.println();

		int g = 0;
		double s = perm[0] + perm[1];

		for (int i = 2; i < m; i++) {

			g = 0;

			for (int q = 1; q < (i + 1); q++) {

				if ((i + 1) % q == 0) {
					g += 1;

				}
			}
			;

			if (g == 1) {

				s += perm[i];

			}
			;

		}
		;

		System.out.println(s);

	}

}
