package by.jonline.str_as_an_object.task05;

public class Main {

	public static void main(String[] args) {
		
		String str = " aaa aaaaaaaaaa hello aaa     a";
		amountOfA(str);

	}
	
	public static void amountOfA(String str) {
		
		int counter = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == 'a') {
				counter++;
			}
		}
		
		System.out.println(counter);
	}

}
