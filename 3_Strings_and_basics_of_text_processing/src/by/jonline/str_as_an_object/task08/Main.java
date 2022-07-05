package by.jonline.str_as_an_object.task08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		theLargestWord(str);

	}
	
	public static void theLargestWord(String str) {
	
		String[] words = str.split(" ");
		String largestWord = new String();
		int maxLenght = 0;
		
		for (int i = 0; i < words.length; i++) {
			
			if(words[i].length() > maxLenght) {
				maxLenght = words[i].length();
				largestWord = words[i];
			}
		}
		
		System.out.println(largestWord);
	}

}
