package by.jonline.str_as_an_array.task05;

public class Main {

	public static void main(String[] args) {

		String str = "   my         name is     Konstantin    ";
		deleteSpaces(str);

	}

	public static void deleteSpaces(String str) {

		StringBuilder newstr = new StringBuilder();
		
		if(str.charAt(0) != ' ') {
			newstr.append(str.charAt(0));
		}

		for (int i = 1; i < str.length(); i++) {

			if (str.charAt(i) == ' ' && str.charAt(i - 1) == ' ') {
			} else {
				newstr.append(str.charAt(i));
			}
		}
		
		String str2 = newstr.toString().trim();
		System.out.println(str2);
	}

}
