package by.jonline.ht05.main;

public class Task_10 {

	public static void main(String[] args) {

		int n = 6;
		int a[][] = new int[n][n];
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = ((int) (Math.random() * 21) - 10);

				System.out.print(a[i][j] + " ");

				if (i == j && a[i][j] > 0) {

					arr[i] = a[i][j];
				}
				;
			}
			;
			System.out.println();
		}
		;
		System.out.println();
		
		System.out.println("positive elements of the main diagonal are: ");

		for (int q = 0; q < n; q++) {
			if (arr[q] > 0) {

				System.out.print(arr[q] + " ");
			}
			;
		}
		;

	}

}
