package by.jonline.ht05.main;

public class Task_09 {

	public static void main(String[] args) {

		int n = 6;
		int m = 5;
		int a[][] = new int[m][n];
		int[] sum = new int[n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = ((int) (Math.random() * 11));

				System.out.print(a[i][j] + " ");
			}
			;
			System.out.println();
		}
		;

		for (int q = 0; q < n; q++) {
			for (int l = 0; l < m; l++) {
				sum[q] += a[l][q];
			}
			;
		}
		;

		System.out.println();

		int max = sum[0];
		int maxnum = 0;

		for (int k = 0; k < n; k++) {
			System.out.print(sum[k] + " ");

			if (sum[k] > max) {

				max = sum[k];
				maxnum = k;
			}
			;
		}
		;
		
        System.out.println();
		System.out.println("column " + (maxnum + 1) + " has max summa");
	}

}
