package by.jonline.ht07.main;

import java.util.Scanner;

public class Task_06 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		boolean tf;

		a = enterFromConsole("a>> ");
		b = enterFromConsole("b>> ");
		c = enterFromConsole("c>> ");

		tf = IsthreenumSimpl(a, b, c);

		System.out.println("three numbers are simple: " + tf);

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

	public static boolean IsthreenumSimpl(int x1, int x2, int x3) {

		int NOD = 1;

		for (int i = x1; i > 1; i--) {

			if (x1 % i == 0 && x2 % i == 0 && x3 % i == 0 && i > NOD) {

				NOD = i;
			}
			;
		}
		;

		if (NOD == 1) {

			return true;
		} else {

			return false;
		}
		

	};

}
