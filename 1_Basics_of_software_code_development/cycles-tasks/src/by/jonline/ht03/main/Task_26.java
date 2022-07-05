package by.jonline.ht03.main;

import java.util.Scanner;

public class Task_26 {

	public static void main(String[] args) {
		
		int n;
		char s;
		
		System.out.println("Input symbol. The program will stop as soon as you enter '!'.");
		
		@SuppressWarnings("resource")
		Scanner n1 = new Scanner(System.in);
		String str = n1.next();
		s = str.charAt(str.length() - 1);
		n = (int)(s);
		System.out.println(">> " + n);
		
		do {
			@SuppressWarnings("resource")
			Scanner n2 = new Scanner(System.in);
			String str2 = n2.next();
			s = str2.charAt(str2.length() - 1);
			n = (int)(s);
			System.out.println(">> " + n);
		}
		while (s != '!');
	}

}
