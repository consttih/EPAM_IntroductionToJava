package by.online.ht02.main;

import java.util.Scanner;

public class Task_21 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner an1 = new Scanner(System.in);
		String ans;
		String boys;
		String girls;
		
		System.out.println("Who are you: boy or girl? Inpur B or G.");
		System.out.print(">> ");
		
		ans = an1.next();
		boys = "B";
		girls = "G";
		
		if (boys.equals(ans)) {
			System.out.println("I love boys!");
		}else if(girls.equals(ans)) {
			System.out.println("I love girls!");
		}else {
			System.out.println("You should input only B or G!");
		}
	
	}
		
}

