package by.jonline.ht07.main;

public class Task_11 {

	public static void main(String[] args) {

		int n1;
		n1 = 1234;

		int n2;
		n2 = 123;

		int num = WhereIsMore(n1, n2);

		if (num == 0) {
			System.out.println("the number of digits is the same");
		} else {
			System.out.println("there are more digits in the " + num + " number");
		}
		;

	};

	public static int WhereIsMore(int x1, int x2) {

		int sch1 = x1;
		int sch2 = x2;

		int p1 = 0;
		int p2 = 0;

		while (sch1 != 0) {

			sch1 /= 10;
			p1 += 1;
		}
		;

		while (sch2 != 0) {

			sch2 /= 10;
			p2 += 1;
		}
		;

		if (p1 > p2) {
			return 1;
		} else if (p1 < p2) {
			return 2;
		} else {
			return 0;
		}

	};

}
