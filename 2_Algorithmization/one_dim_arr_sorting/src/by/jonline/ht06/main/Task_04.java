package by.jonline.ht06.main;

import java.util.Arrays;

public class Task_04 {

	public static void main(String[] args) {

		int[] array = { 1,5,6,8,4,2,5,6,3,2,5,7,8,9};
		System.out.println(Arrays.toString(array));

		int sch = 0;
		boolean needmore = true;

		while (needmore) {

			needmore = false;
			for (int i = 1; i < array.length; i++) {

				if (array[i] < array[i - 1]) {

					int tmp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = tmp;

					sch += 1;

					needmore = true;
				}
				;
			}
			;
		}
		;
		
		System.out.println(Arrays.toString(array));
		System.out.println();
		System.out.println("amount of permutations is " + sch);

	}

}
