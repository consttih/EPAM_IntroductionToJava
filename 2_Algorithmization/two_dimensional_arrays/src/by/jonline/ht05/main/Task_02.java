package by.jonline.ht05.main;

public class Task_02 {

	public static void main(String[] args) {

		int n = 5;
		int m = 5;
		int a[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = ((int) (Math.random() * 51) - 25);
				System.out.print(a[i][j] + " ");
			}
			;
			System.out.println();
		}
		;

		System.out.println();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (i == j) {
					System.out.println(a[i][j]);
				}
				;
			}
			;
		}
		;

	}

}
