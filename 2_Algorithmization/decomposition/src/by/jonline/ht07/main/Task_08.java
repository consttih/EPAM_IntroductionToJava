package by.jonline.ht07.main;

import java.util.Arrays;

public class Task_08 {

	public static void main(String[] args) {

		int[] array = {1, 2, 4, 5, 11, 14, 7, 3, 9};
		System.out.println(Arrays.toString(array));
		
		int sum;
		int k; // start of succession
		int m; // finish of succession
		
		k = 5;
		m = k + 2;

		sum = Successionofthree(k, m, array);
		System.out.println("sum of sequence members from " + k + " to " + m + " is " + sum);

	};

	public static int Successionofthree(int x1, int x2, int[] array) {

		int sum = 0;

		for (int i = x1 - 1; i < x2; i++) {
			sum += array[i];
		}
		;

		return sum;
	};

}
