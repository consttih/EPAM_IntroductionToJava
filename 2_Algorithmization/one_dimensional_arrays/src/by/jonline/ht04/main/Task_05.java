package by.jonline.ht04.main;

public class Task_05 {

	public static void main(String[] args) {

		int m = 15;
		int n = 101;
		int[] perm = new int[n];

		for (int j = 0; j < n; j++) {
			perm[j] = j;
		}
		;

		for (int i = 0; i < m; i++) {

			int r = i + (int) (Math.random() * (n - i));
			int t = perm[r];
			perm[r] = perm[i];
			perm[i] = t;
			System.out.print((i + 1) + ") " + perm[i] + " ");

		}
		;
		System.out.println();

		for (int q = 0; q < m; q++) {

			if (perm[q] > (q + 1)) {
				System.out.print(perm[q] + " ");
			}
			;

		}
		;

	}

}
