package by.jonline.ht03.main;

import java.util.Scanner;

public class Task_06 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n;
		int a, s;
		
		System.out.println("enter any positive integer");
		System.out.print(">> ");
		n = scan.nextInt();
		a = 1;
		s = 0;
		
		while (a <= n) {
			s = s + a;
			a++;
		};
		System.out.print(s);

	}

}
