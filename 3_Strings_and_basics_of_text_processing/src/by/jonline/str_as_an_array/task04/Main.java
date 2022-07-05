package by.jonline.str_as_an_array.task04;

public class Main {

	public static void main(String[] args) {

		String str = "ffj 12 jfjf 1 jfj 1 23";

		amountOfNumbers(str);

	}

	public static void amountOfNumbers(String str) {
		
		System.out.println(str);

		int amount = 0;
		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				
				if ((i == str.length() - 1) || !(Character.isDigit(str.charAt(i + 1)))) {
					amount++;
				}
			}
		}
		
		System.out.println("Amount of numbers is " + amount);
	}

}
