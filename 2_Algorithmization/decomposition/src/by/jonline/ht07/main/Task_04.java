package by.jonline.ht07.main;

import java.util.Scanner;

public class Task_04 {

	public static int value;

	public static void main(String[] args) {

		int[][] a = Array(); // матрица значений координат точек

		int[] mdis = new int[2];
		mdis = MaxDist(a);

		System.out.println();
		System.out.println("max distance is between points " + (mdis[0] + 1) + " and " + (mdis[1] + 1));

	};

	public static int[][] Array() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner x = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner y = new Scanner(System.in);

		System.out.print("How much points would you like to have? \n" + "enter >> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(">> ");
		}
		;

		Task_04.value = sc.nextInt();

		System.out.println();

		int[][] array = new int[Task_04.value][2];

		for (int i = 0; i < Task_04.value; i++) {
			System.out.print("enter value of x" + (i + 1) + " : >>");
			array[i][0] = x.nextInt();
			System.out.print("enter value of y" + (i + 1) + " : >>");
			array[i][1] = y.nextInt();
		}
		;

		System.out.println();

		for (int i = 0; i < Task_04.value; i++) {
			System.out.println("point " + (i + 1) + ": ");
			for (int j = 0; j < 2; j++) {
				System.out.print(array[i][j] + " ");
			}
			;

			System.out.println();
		}
		;

		return array;

	};

	public static int[] MaxDist(int[][] x1) {

		double dist;
		double mdist = 0;
		int[] maxind = new int[2];

		for (int i = 0; i < Task_04.value; i++) {
			for (int j = 0; j < Task_04.value; j++) {

				dist = Math.sqrt((Math.pow(x1[i][0] - x1[j][0], 2)) + (Math.pow(x1[i][1] - x1[j][1], 2)));

				if (dist >= mdist) {

					mdist = dist;
					maxind[0] = i;
					maxind[1] = j;

				}
				;
			}
			;
		}
		;

		return maxind;

	};

}
