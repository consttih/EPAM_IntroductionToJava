package by.jonline.ht07.main;

import java.util.Scanner;

public class Task_03 {

	public static void main(String[] args) {

		double a; // сторона шестиугольника
		double s; // площадь шестиугольника

		a = enterFromConsole("a>> ");
		s = HexaArea(a);

		System.out.println("the area of the hexagon is " + s);

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

	public static double HexaArea(double x1) {
		
		double s;
		
		s = 6 * ((Math.pow(x1, 2) * Math.sqrt(3)) / 4);
		return s;

	};

}
