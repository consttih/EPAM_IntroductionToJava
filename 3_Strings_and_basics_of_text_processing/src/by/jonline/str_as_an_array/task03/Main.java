package by.jonline.str_as_an_array.task03;

public class Main {

	public static void main(String[] args) {
		String str = "1 2 34 hi  sun 678";
		
		amountOfDigits(str);

	}
	
	public static void amountOfDigits(String str) {
		
		int amount = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				
				amount ++;
			}
			
		}
		
		System.out.println("Amount of digits is " + amount);
	}

}
