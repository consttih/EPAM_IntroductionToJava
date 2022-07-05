package by.jonline.agregandcomp.task01;

import java.util.Arrays;

public class Sentence {

	private Word[] sentence;

	public Sentence(Word[] sentence) {
		super();
		this.sentence = sentence;
	}

	public void writeSentence() {

		for (int i = 0; i < sentence.length; i++) {
			if ((i == (sentence.length - 1)) && (sentence[i].getWord_and_punct().compareTo("!") != 0
					|| sentence[i].getWord_and_punct().compareTo("?") != 0)) {
				System.out.print(sentence[i] + ". ");
			} else {
				System.out.print(sentence[i] + " ");
			}
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(sentence);
	}

}
