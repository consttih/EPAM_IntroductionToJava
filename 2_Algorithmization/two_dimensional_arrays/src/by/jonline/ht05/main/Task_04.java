package by.jonline.ht05.main;

public class Task_04 {

	public static void main(String[] args) {

		int n = 5;
		int m = 5;
		int a[][] = new int[m][n];

		for (int i = 0; i < m; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					a[i][j] = j + 1;

					System.out.print(a[i][j] + " ");
				}
				;
			} else {
				for (int j = 0; j < n; j++) {
					a[i][j] = 5 - j;

					System.out.print(a[i][j] + " ");
				}
				;
			}
			;
			System.out.println();
		}

	}

}
