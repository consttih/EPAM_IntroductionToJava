package by.jonline.ht07.main;

public class Task_16 {

	public static void main(String[] args) {

		int n = 3;
		int sum = SumOfOdd(n);
		int kol = AmountOfEven(sum);

		System.out.println(sum);
		System.out.println("Amount of even numbers in sum is " + kol);

	};

	public static int SumOfOdd(int x1) {

		int sum = 0;
		for (int i = (int) Math.pow(10, x1 - 1); i < (int) Math.pow(10, x1); i++) {
			boolean prov = ProverkaOdd(i);

			if (prov == true) {

				sum += i;
			}
			;
		}
		;

		return sum;
	};

	public static boolean ProverkaOdd(int x1) {

		int[] chisl = ByNumbers(x1);
		int p = chisl.length;
		boolean tf;
		int q = 0;

		for (int i = 0; i < p; i++) {
			if (chisl[i] % 2 != 0) {

				q += 1;
			}
			;
		}
		;

		if (q == p) {
			tf = true;
		} else {
			tf = false;
		}
		;

		return tf;
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

	public static int AmountOfEven(int x1) {

		int[] bynum = ByNumbers(x1);
		int kolvo = bynum.length;
		int q = 0;

		for (int i = 0; i < kolvo; i++) {
			if (bynum[i] % 2 == 0) {
				q += 1;
			}
			;
		}
		;

		return q;
	};

}
