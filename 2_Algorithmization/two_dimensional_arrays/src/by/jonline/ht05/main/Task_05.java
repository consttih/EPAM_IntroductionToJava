package by.jonline.ht05.main;

public class Task_05 {

	public static void main(String[] args) {

		int n = 8;
		int a[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				a[i][j] = i + 1;
			}
			;
			for (int q = 0; q < n; q++) {
				System.out.print(a[i][q] + " ");
				
			}
			;
			System.out.println();
		}
		;

	}

}
