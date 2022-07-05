package by.jonline.ht06.main;

import java.util.Arrays;

public class Task_03 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(array));

		for (int left = 0; left < array.length; left++) {

			int maxInd = left;

			for (int i = left; i < array.length; i++) {

				if (array[i] > array[maxInd]) {

					maxInd = i;
				}
				;
			}
			;
			
			int tmp = array[left];
			array[left] = array[maxInd];
			array[maxInd] = tmp;
			
		};
		
		System.out.println(Arrays.toString(array));

	}

}
