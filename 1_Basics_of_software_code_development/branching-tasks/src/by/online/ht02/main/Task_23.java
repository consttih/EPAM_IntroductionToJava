package by.online.ht02.main;

import java.util.Scanner;

public class Task_23 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int dd;
		int mm;
		int dd2;
		int mm2;
		
		System.out.println("Please, input today's date like 'dd mm'.");
		System.out.print(">> ");
		
		dd = 15;
		mm = 05;
		
		dd2 = sc.nextInt();
		mm2 = sc.nextInt();
		
		if (dd == dd2 && mm == mm2) {
			System.out.println("Super! Today is realy this date!");
		}else {
			System.out.println("Hmm...I think, that today is a different day.");
		}
		

	}

}
