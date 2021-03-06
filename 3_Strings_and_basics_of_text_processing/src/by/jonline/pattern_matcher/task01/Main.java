package by.jonline.pattern_matcher.task01;

public class Main {

	public static void main(String[] args) {

		String str = "It goes without saying, books are our teachers and friends. "
				+ "They teach us to be kind, clever, polite, hardworking, friendly. "
				+ "Books help us to learn more about nature, the world around us and many other interesting things.\n"
				+ "There are a lot of books on history, about animals, travellers, children, school and so on. "
				+ "Children like to read adventure and magic books, science fiction and detective stories. "
				+ "They enjoy stories, short stories, novels, fairy-tales, fables and poems.\n"
				+ "We must keep books clean and tidy. We must not spoil them.\n"
				+ "I am fond of reading, too. I like to read fairytales. " + "My favourite book is «Mary Poppins». "
				+ "The author of the book is Pamela Travers. " + "She is a famous English writer.";

		System.out.println(str);
		System.out.println();

		paragraphSorting(str);
		System.out.println();

		sentenceSorting(str);
		System.out.println();

		sentenceByLexemeSorting(str, 'o');

	}

	public static void paragraphSorting(String str) {

		String[] paragraph = str.split("\n");

		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;

			for (int i = 1; i < paragraph.length; i++) {

				if (amountOfSentences(paragraph[i]) > amountOfSentences(paragraph[i - 1])) {

					String iter = paragraph[i];
					paragraph[i] = paragraph[i - 1];
					paragraph[i - 1] = iter;

					needIteration = true;

				}
			}
		}

		for (int i = 0; i < paragraph.length; i++) {
			System.out.println(paragraph[i]);
		}
	}

	public static int amountOfSentences(String str) {
		String[] sentences = str.split("\\.*[.!?]\\s*");
		return sentences.length;
	}

	public static void sentenceSorting(String str) {

		String[] paragraph = str.split("\n");

		for (String para : paragraph) {

			String[] sentences = para.split("\\.*[.!?]\\s*");
			String[] sentences2 = new String[sentences.length];

			for (int i = 0; i < sentences.length; i++) {

				sentences2[i] = wordsSorting(sentences[i]);

			}

			for (String sentence : sentences2) {
				System.out.print(sentence + ". ");
			}

			System.out.print("\n");
		}

	}

	public static String wordsSorting(String str) {

		String[] words = str.split("\\s*[\\s,;:]\\s*");

		boolean needIteration = true;
		while (needIteration) {
		needIteration = false;

			for (int i = 1; i < words.length; i++) {

				if (words[i].length() > words[i - 1].length()) {

					String iter = words[i];
					words[i] = words[i - 1];
					words[i - 1] = iter;

					needIteration = true;

				}
			}

		}

		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			sb.append(word + ' ');
		}

		String text = sb.toString();

		return text;
	}

	public static void sentenceByLexemeSorting(String str, char lex) {

		String[] paragraph = str.split("\n");

		for (String para : paragraph) {

			String[] sentences = para.split("\\.*[.!?]\\s*");
			String[] sentences2 = new String[sentences.length];

			for (int i = 0; i < sentences.length; i++) {

				sentences2[i] = lexemeSorting(sentences[i], lex);

			}

			for (String sentence : sentences2) {
				System.out.print(sentence + ". ");
			}

			System.out.print("\n");
		}

	}

	public static String lexemeSorting(String str, char lec) {

		String[] words = str.split("\\s*[\\s,;:]\\s*");

		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;

			for (int i = 1; i < words.length; i++) {

				if ((amountOfSpecLetter(words[i], lec)) < (amountOfSpecLetter(words[i - 1], lec))) {

					String iter = words[i];
					words[i] = words[i - 1];
					words[i - 1] = iter;

					needIteration = true;

				} else if ((amountOfSpecLetter(words[i], lec)) == (amountOfSpecLetter(words[i - 1], lec))) {
					if (Character.toUpperCase(words[i].charAt(0)) < Character.toUpperCase(words[i - 1].charAt(0))) {

						String iter = words[i];
						words[i] = words[i - 1];
						words[i - 1] = iter;

						needIteration = true;
					}

				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			sb.append(word + ' ');
		}

		String text = sb.toString();

		return text;
	}

	public static int amountOfSpecLetter(String str, char letter) {

		String[] letters = str.split("");
		int counter = 0;

		for (String lett : letters) {

			if (Character.toString(letter).compareTo(lett) == 0) {

				counter++;
			}
		}

		return counter;
	}

}
