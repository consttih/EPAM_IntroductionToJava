package by.jonline.ht07.main;

import java.util.Arrays;

public class Task_12 {

	public static void main(String[] args) {

		int k = 6;
		int n = 100;

		int[] sumnum = SumOfNumbers(k, n);
		System.out.println(Arrays.toString(sumnum));
	};

	public static int[] SumOfNumbers(int x1, int x2) {

		int k = 0;

		for (int i = 0; i < x2; i++) {
			int[] byNum = ByNumbers(i);

			int sum = 0;
			for (int q = 0; q < byNum.length; q++) {
				sum += byNum[q];

			}
			;
			if (sum == x1) {
				k += 1;
			}
			;
		}
		;

		int[] SumOfNumb = new int[k];
		int l = 0;

		for (int i = 0; i < x2; i++) {

			int[] byNum = ByNumbers(i);

			int sum = 0;
			for (int q = 0; q < byNum.length; q++) {
				sum += byNum[q];

			}
			;

			if (sum == x1) {
				SumOfNumb[l] = i;
				l++;
			}
			;
		}
		;

		return SumOfNumb;
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

			byNum[i] = (x1 % (int) (Math.pow(10, i + 1))) / (int) (Math.pow(10, i));
		}
		;

		return byNum;
	};

}
