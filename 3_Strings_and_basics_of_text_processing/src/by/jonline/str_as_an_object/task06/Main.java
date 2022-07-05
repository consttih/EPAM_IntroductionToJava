package by.jonline.str_as_an_object.task06;

public class Main {

	public static void main(String[] args) {
		
		String str = " my  name   is    Konstantin";
		toDoubleString(str);

	}
	
	public static void toDoubleString(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i)).append(str.charAt(i));
		}
		
		sb.toString();
		System.out.println(sb);
	}

}
