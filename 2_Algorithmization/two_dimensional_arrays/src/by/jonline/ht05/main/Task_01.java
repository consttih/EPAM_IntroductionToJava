package by.jonline.ht05.main;

public class Task_01 {

	public static void main(String[] args) {

		int n = 6;
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
		
		for (int k = 0; k < n; k += 2) {
			if (a[0][k] > a[m - 1][k]) {
				for (int q = 0; q < m; q++) {
					System.out.println(a[q][k]);
				}
				;
			}
			;
			System.out.println();
		}
		;
	}

}
