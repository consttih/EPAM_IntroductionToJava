package by.jonline.ht05.main;

import java.util.Scanner;

public class Task_08 {

	public static void main(String[] args) {
		
		
		int n = 6; // строки
		int m = 5; // столбцы
		int a[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = ((int) (Math.random() * 11));
				System.out.print(a[i][j] + " ");
			}
			;
			System.out.println();
		}
		;

		System.out.println();
		
		System.out.println("choose the columns you want to change (1 - " + n + ") ");

		@SuppressWarnings("resource")
		Scanner scanner_1 = new Scanner(System.in);
		System.out.print(">> ");
		int n1 = scanner_1.nextInt() - 1;
		
		
		@SuppressWarnings("resource")
		Scanner scanner_2 = new Scanner(System.in);
		System.out.print(">> ");
		int n2 = scanner_2.nextInt() - 1;
		
		System.out.println();

		int per = 0;

		for (int k = 0; k < m; k++) {

			per = a[k][n2];
			a[k][n2] = a[k][n1];
			a[k][n1] = per;

		}
		;
		
		System.out.println("new matrix: ");
		System.out.println();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			;
			System.out.println();
		}
		;

	}

}
