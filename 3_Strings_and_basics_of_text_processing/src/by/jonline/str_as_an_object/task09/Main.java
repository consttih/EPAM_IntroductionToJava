package by.jonline.str_as_an_object.task09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		smallAndCapital(str);
	}

	public static void smallAndCapital(String str) {

		int amountOfSmall = 0;
		int amountOfCapital = 0;

		for (int i = 0; i < str.length(); i++) {

			if ((int) (str.charAt(i)) >= 65 && (int) (str.charAt(i)) <= 90) {

				amountOfCapital++;
			}

			if ((int) (str.charAt(i)) >= 97 && (int) (str.charAt(i)) <= 122) {

				amountOfSmall++;
			}
		}
		
		System.out.println("Amount of small letters is " + amountOfSmall);
		System.out.println("Amount of capital letters is " + amountOfCapital);
		
	}

}
