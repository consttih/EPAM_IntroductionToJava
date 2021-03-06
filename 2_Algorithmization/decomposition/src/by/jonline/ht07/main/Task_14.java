package by.jonline.ht07.main;

import java.util.Arrays;

public class Task_14 {

	public static void main(String[] args) {

		int k = 513;
		int[] armst = Armstrong(k);
		System.out.println(Arrays.toString(armst));

	};

	public static int[] Armstrong(int x) {
		
		int k = 0;
		for (int i = 1; i <= x; i++) {

			int am = AmountOfNumbers(i);
			int sum = SumOfNumbers(i);
			
			int arm = (int)Math.pow(sum, am);
			
			if (arm == i) {
				k += 1;
			};
		};
		
		int[] armstr = new int[k];
		int l = 0;
		
		for (int i = 1; i <= x; i++) {

			int am = AmountOfNumbers(i);
			int sum = SumOfNumbers(i);
			
			int arm = (int)Math.pow(sum, am);
			
			if (arm == i) {
				armstr[l] = i;
				l++;
			};
		};
		return armstr;
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

	public static int SumOfNumbers(int x1) {
		
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

		int sum = 0;
		for (int q = 0; q < byNum.length; q++) {
			sum += byNum[q];

		}
		;
		return sum;
	};

}
