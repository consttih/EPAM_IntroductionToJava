package by.jonline.ht05.main;

public class Task_03 {

	public static void main(String[] args) {
		
		int n = 5;
		int m = 5;
		int k = 2;
		int p = 3;
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
		
		for (int q = 0; q < n; q++) {
	        
			System.out.print(a[k - 1][q] + " ");
		}
		;
		
        System.out.println();
        System.out.println();
		
		for (int f = 0; f < m; f++) {
	        
			System.out.println(a[f][p - 1]);
			
		}
		;
		System.out.println();

	}

}
