package by.jonline.str_as_an_object.task03;

public class Main {

	public static void main(String[] args) {
		
		String str = "kayak";
		String str2 = "level";
		String str3 = "dog";
		
		isPalindrome(str);
		isPalindrome(str2);
		isPalindrome(str3);

	}
	
	public static void isPalindrome(String str) {
		
		StringBuilder sb1 = new StringBuilder(str);
		sb1.reverse();
		if (sb1.toString().equalsIgnoreCase(str)) {
			
			System.out.println(str + " is palindrom");
			
		}else {
			
			System.out.println(str + " is not palindrom");
		}
	}

}
