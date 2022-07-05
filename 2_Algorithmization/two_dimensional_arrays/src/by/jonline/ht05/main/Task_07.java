package by.jonline.ht05.main;

public class Task_07 {

	public static void main(String[] args) {

		int n = 4;
		int sch = 0;
		double a[][] = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				double arg = (double) ((Math.pow(i, 2) - Math.pow(j, 2)) / n);
				a[i][j] = (double)((int)(Math.sin(arg) * 100)) / 100.0; // округление до сотых 
				System.out.print(a[i][j] + " ");

				if (a[i][j] > 0) {
					sch += 1;
				}
				;

			}
			;
			System.out.println();
			
		}
		;
		System.out.println("amount of positive numbers is " + sch);

	}

}
