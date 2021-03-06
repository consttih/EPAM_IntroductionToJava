package by.jonline.str_as_an_object.task07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		withoutRepetitionaAndSpace(str);

	}
	
	public static void withoutRepetitionaAndSpace(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(Character.toString(str.charAt(i))) == i && !(str.charAt(i) == ' ')) {
				sb.append(str.charAt(i));
			}
		}
		
		sb.toString();
		System.out.println(sb);
	}

}
