package by.jonline.ht07.main;

import java.util.Scanner;

public class Task_02 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;

		int NOD;

		a = enterFromConsole("a>> ");
		b = enterFromConsole("b>> ");
		c = enterFromConsole("c>> ");
		d = enterFromConsole("d>> ");

		NOD = NOD(a, b, c, d);

		System.out.println("for numbers " + a + " and " + b + " and " + c + " and " + d + " NOD is " + NOD);

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

	public static int NOD(int x1, int x2, int x3, int x4) {

		int NOD = 1;

		for (int i = x1; i > 1; i--) {

				if (x1 % i == 0 && x2 % i == 0 && x3 % i == 0 && x4 % i == 0 && i > NOD) {

					NOD = i;
				}
				;
			}
			;

		return NOD;

	};
	
}
