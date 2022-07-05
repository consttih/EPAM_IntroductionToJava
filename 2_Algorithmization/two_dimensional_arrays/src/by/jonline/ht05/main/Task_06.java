package by.jonline.ht05.main;

public class Task_06 {

	public static void main(String[] args) {

		int n = 10;
		int a[][] = new int[n][n];

		for (int p = 0; p < n / 2; p++) {
			for (int t = p; t < n - p; t++) {
				a[p][t] = 1;
			}
			;
		}
		;

		for (int k = n / 2; k < n; k++) {
			for (int l = n - k - 1; l < k + 1; l++) {
				a[k][l] = 1;
			}
			;
		}
		;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			;
			System.out.println();
		}
		;

	}

}
