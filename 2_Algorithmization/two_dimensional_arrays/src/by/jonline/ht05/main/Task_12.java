package by.jonline.ht05.main;

public class Task_12 {

	public static void main(String[] args) {

		int n = 6;
		int m = 5;

		int a[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = ((int) (Math.random() * 11));

				System.out.print(a[i][j] + " ");
			}
			;
			System.out.println();

			int p = 0;
			while (p < m) {

				for (int j = 1; j < m; j++) {

					int max = 0;
					if (a[i][j] > a[i][j - 1]) {

						max = a[i][j - 1];
						a[i][j - 1] = a[i][j];
						a[i][j] = max;

					}
					;

				}
				;

				p += 1;

			}
			;
		}
		;
		System.out.println();
		System.out.println("descending order: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				System.out.print(a[i][j] + " ");

			}
			;
			System.out.println();
		}
		;

		System.out.println();

		for (int i = 0; i < n; i++) {

			int p = 0;

			while (p < m) {

				for (int j = 1; j < m; j++) {

					int min = 0;
					if (a[i][j] < a[i][j - 1]) {

						min = a[i][j - 1];
						a[i][j - 1] = a[i][j];
						a[i][j] = min;

					}
					;

				}
				;

				p += 1;

			}
			;
		}
		;

		System.out.println("ascending order: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				System.out.print(a[i][j] + " ");

			}
			;
			System.out.println();
		}
		;

		System.out.println();

	}

}
