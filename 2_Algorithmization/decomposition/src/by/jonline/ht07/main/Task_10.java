package by.jonline.ht07.main;

import java.util.Arrays;

public class Task_10 {

	public static void main(String[] args) {

		int n;
		n = 123456789;

		int[] num = ByNumbers(n);

		System.out.println(Arrays.toString(num));

	};

	public static int[] ByNumbers(int x1) {

		int sch = x1;
		int p = 0;

		while (sch != 0) {

			sch /= 10;
			p += 1;
		}
		;

		int[] byNum = new int[p];
		for (int i = 0; i < p; i++) {
	
			 byNum[i] = (x1 % (int)(Math.pow(10, i + 1))) / (int)(Math.pow(10, i));
		}
		;

		return byNum;
	};

}
