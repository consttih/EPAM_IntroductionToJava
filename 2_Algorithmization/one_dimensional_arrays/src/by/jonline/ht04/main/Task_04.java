package by.jonline.ht04.main;

public class Task_04 {

	public static void main(String[] args) {

		// вывод случайной выборки из m целых чисел от 0 до n - 1 (без повторений) +
		// обмен местами наибольшего и наименьшего члена выборки

		int m = 16;
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
			System.out.print(perm[i] + " ");

		}
		;
		System.out.println();

		int min = perm[0];
		int max = perm[0];
		int imin = 0;
		int imax = 0;

		for (int q = 0; q < m; q++) {

			if (perm[q] <= min) {
				min = perm[q];
				imin = q;
			}
			;
			if (perm[q] >= max) {
				max = perm[q];
				imax = q;
			}
			;

		}

		perm[imax] = min;
		perm[imin] = max;

		for (int k = 0; k < m; k++) {
			System.out.print(perm[k] + " ");
		}
	}
}