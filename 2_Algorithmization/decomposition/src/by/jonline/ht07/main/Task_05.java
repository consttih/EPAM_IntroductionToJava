package by.jonline.ht07.main;

import java.util.Arrays;

public class Task_05 {

	public static void main(String[] args) {

		double[] array = { 1, 2, 3, 45, 8, 4, 6, 8, 69, 4, 5, 7, 8 };

		double a = SecBiggest(array);
		System.out.println("the second largest number is " + a);

	};

	public static double SecBiggest(double[] x1) {

		System.out.println(Arrays.toString(x1));

		for (int left = 0; left < x1.length; left++) {

			int maxInd = left;
			for (int i = left; i < x1.length; i++) {

				if (x1[i] > x1[maxInd]) {

					maxInd = i;
				}
				;
			}
			;

			double tmp = x1[left];
			x1[left] = x1[maxInd];
			x1[maxInd] = tmp;
		}
		;

		return x1[1];

	};

}
