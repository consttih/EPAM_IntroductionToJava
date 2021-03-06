package by.jonline.ht07.main;

import java.util.Arrays;

public class Task_15 {

	public static void main(String[] args) {

		int n = 2;
		int[] rise = IncreasingNumbers(n);

		System.out.println(Arrays.toString(rise));
	};

	public static int[] IncreasingNumbers(int x1) {

		int k = 0;
		for (int i = (int) Math.pow(10, x1 - 1); i < (int) Math.pow(10, x1); i++) {
			int q = KolvoEl(i);

			if (q == x1 - 1) {

				k += 1;
			}
			;
		}
		;

		int[] incrnum = new int[k];
		int l = 0;

		for (int i = (int) Math.pow(10, x1 - 1); i < (int) Math.pow(10, x1); i++) {
			int q = KolvoEl(i);

			if (q == x1 - 1) {

				incrnum[l] = i;
				l++;
			}
			;
		}
		;

		return incrnum;
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

	public static int KolvoEl(int x1) { //проверяет цифры числа на возрастание 

		int[] bynum = ByNumbers(x1);
		int p = AmountOfNumbers(x1);

		int q = 0;
		for (int j = 1; j < p; j++) {
			if (bynum[j] < bynum[j - 1]) { // знак < т.к. массив цифр числа начинается последней цифрой и заканчивается первой 

				q += 1;
			}
			;
		}
		;

		return q;
	};

	public static int AmountOfNumbers(int x1) {

		int sch = x1;
		int p = 0;

		while (sch != 0) {

			sch /= 10;
			p += 1;
		}
		;
		return p;
	};
}
