package by.online.ht02.main;

import java.util.Scanner;

// romashka 

public class Task_24 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n;
		String love;
		String notlove;
		String l1;
		
		n = (int)(Math.random() * 100);
		love = "loves me";
		notlove = "doesn't love me";
		
		System.out.println("Choose, how do u wanna start? Write: loves me OR doesn't love me. Without whitespace.");
		System.out.print(">> ");
		
		l1 = scan.nextLine();
		
		if (l1.equals(love)) {
			if (n % 2 == 0) {
				System.out.println("Sorry, he/she doesn't love you(");
			}else {
				System.out.println("He/she loves you!!!Run to him/her!");
			}
		}else if(l1.equals(notlove)) {
			if (n % 2 == 0) {
				System.out.println("He/she loves you!!!Run to him/her!");
			}else {
				System.out.println("Sorry, he/she doesn't love you(");
			}
		}else {
			System.out.println("Try to write it again.");
		}
		
	}

}
