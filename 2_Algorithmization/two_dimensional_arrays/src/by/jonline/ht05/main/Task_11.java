package by.jonline.ht05.main;

public class Task_11 {

	public static void main(String[] args) {

		int n = 10;
		int m = 20;

		int a[][] = new int[n][m];
		int[] moret3 = new int[n];

		for (int i = 0; i < n; i++) {

			int sch = 0;

			for (int j = 0; j < m; j++) {
				a[i][j] = ((int) (Math.random() * 16));

				if (a[i][j] == 5) {

					sch += 1;
				}
				;

				System.out.print(a[i][j] + " ");
			}
			;
			System.out.println();

			if (sch >= 3) {
				moret3[i] = i + 1; // + 1 чтобы исключить 0
			}
			;
		}
		;
		System.out.println();

		for (int k = 0; k < n; k++) {
			if (moret3[k] != 0) {
				System.out.println("in the line " + moret3[k] + " the number 5 occurs 3 or more than 3 times.");
			}
			;
		}
		;

	}

}
