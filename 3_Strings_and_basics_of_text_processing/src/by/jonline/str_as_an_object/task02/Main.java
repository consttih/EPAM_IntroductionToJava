package by.jonline.str_as_an_object.task02;

public class Main {

	public static void main(String[] args) {
		
		String str = "an apple, a banana, a pineapple";
		
		put_b_after_a(str);
		

	}
	
	public static void put_b_after_a(String str) {
		
		StringBuilder nstr = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			
			
			if(str.charAt(i) == 'a') {
				nstr.append(str.charAt(i)).append('b');
			}else {
				nstr.append(str.charAt(i));
			}
		}
		
		nstr.toString();
		System.out.println(nstr);
	}

}
