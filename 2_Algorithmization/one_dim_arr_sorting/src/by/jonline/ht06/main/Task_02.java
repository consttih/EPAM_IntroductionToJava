package by.jonline.ht06.main;

import java.util.Arrays;

public class Task_02 {

	public static void main(String[] args) {

		int[] array_1 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(array_1));

		int[] array_2 = { 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(Arrays.toString(array_2));

		int[] array_3 = new int[array_1.length + array_2.length];

		for (int i = 0; i < array_3.length; i++) {

			if (i < array_1.length) {

				array_3[i] = array_1[i];
			} else {

				array_3[i] = array_2[i - array_1.length];
			}
			;

		}
		;

		boolean needIteration = true;

		while (needIteration) {
			needIteration = false;

			for (int i = 1; i < array_3.length; i++) {

				if (array_3[i] < array_3[i - 1]) {

					int tmp = array_3[i];
					array_3[i] = array_3[i - 1];
					array_3[i - 1] = tmp;

					needIteration = true;
				}
				;
			}
			;

		}
		;

		System.out.println(Arrays.toString(array_3));

	}

}
