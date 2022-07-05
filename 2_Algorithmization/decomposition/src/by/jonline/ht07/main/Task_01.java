package by.jonline.ht07.main;

import java.util.Scanner;

public class Task_01 {

	public static void main(String[] args) {

		int a;
		int b;

		int NOD;
		int NOK;

		a = enterFromConsole("a>> ");
		b = enterFromConsole("b>> ");

		NOD = NOD(a, b);
		NOK = NOK(a, b);

		System.out.println("for numbers " + a + " and " + b + " NOD is " + NOD);
		System.out.println("for numbers " + a + " and " + b + " NOK is " + NOK);

	};

	public static int enterFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value;

		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		;

		value = sc.nextInt();
		return value;

	};

	public static int NOD(int x1, int x2) {

		int NOD;

		if (x1 >= x2) {

			NOD = 1;

			for (int i = x1 / 2; i > 1; i--) {

				if (x1 % i == 0 && x2 % i == 0 && i > NOD) {

					NOD = i;
				}
				;
			}
			;
		} else {

			NOD = 1;

			for (int j = x2 / 2; j > 1; j--) {

				if (x1 % j == 0 && x2 % j == 0 && j > NOD) {

					NOD = j;
				}
				;
			}
			;
		}
		;

		return NOD;

	};

	public static int NOK(int x1, int x2) {

		int NOK;

		NOK = (x1 * x2) / (NOD(x1, x2));

		return NOK;

	};

}
