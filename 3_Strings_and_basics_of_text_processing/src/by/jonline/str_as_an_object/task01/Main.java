package by.jonline.str_as_an_object.task01;

public class Main {

	public static void main(String[] args) {
		
		String str = "            hi    my     name     is       Konstantin               ";
		largestNumberOfSpaces(str);

	}
	
	public static void largestNumberOfSpaces(String str) {
		
		int counter = 0;
		int maxAmount = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == ' ') {
				
				counter = 0;
				while (str.charAt(i) == ' ') {
					
					i++;
					counter++;
					
					if(i == str.length())
					break;
				}
				
				if (maxAmount < counter) {
					
					maxAmount = counter;
				}
				
			}
		}
		
		System.out.println("the largest number of occurrences of a space is " + maxAmount);
	}

}
