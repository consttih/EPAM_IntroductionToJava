package by.jonline.ht06.main;

import java.util.Arrays;

public class Task_01 {

	public static void main(String[] args) {

		int[] array_1 = { 10, 2, 10, 3};
		System.out.println(Arrays.toString(array_1));

		int[] array_2 = { 23, 5, 6, 7, 8, 9, 10};
		System.out.println(Arrays.toString(array_2));

		int k = 3;
		int[] array_3 = new int[array_1.length + array_2.length];

		for (int i = 0; i < array_3.length; i++) {

			if (i < k) {

				array_3[i] = array_1[i];
			}
			;
			if (i >= k && i < (k + array_2.length)) {

				array_3[i] = array_2[i - k];
			}
			;
			if (i >= (k + array_2.length)) {

				array_3[i] = array_1[i - array_2.length];
			}
			;
		}
		;
		
		System.out.println(Arrays.toString(array_3));

	}

}
