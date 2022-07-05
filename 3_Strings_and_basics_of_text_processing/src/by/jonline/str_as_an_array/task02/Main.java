package by.jonline.str_as_an_array.task02;

public class Main {

	public static void main(String[] args) {

		String word = "word word cat word dog  word !   word";
		String letter = toLetter(word);

		System.out.println(word);
		System.out.println(letter);

	}

	public static String toLetter(String str) {

		char[] words = str.toCharArray();
		StringBuilder newword = new StringBuilder();

		for (int i = 0; i < words.length; i++) {

			if ((i + 3 < words.length) && (words[i] == 'w') && (words[i + 1] == 'o') && (words[i + 2] == 'r')
					&& (words[i + 3] == 'd')) {
				
				newword.append("letter");
				i += 3;
			}else {
				
				newword.append(words[i]);
			}
		}
		
		return newword.toString();
	}

}
