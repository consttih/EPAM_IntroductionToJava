package by.jonline.agregandcomp.task01;

import java.util.Arrays;

public class Text {

	private Sentence[] text;
	
	public Text() {
		
	}

	public Text(Sentence[] text) {
		super();
		this.text = text;
	}

	public void writeText() {

		for (int i = 0; i < text.length; i++) {
			text[i].writeSentence();
		}
	}

	public Text addSentences(Sentence[] text) {

		Sentence[] text2 = new Sentence[this.text.length + text.length];

		for (int i = 0; i < text2.length; i++) {

			if (i < this.text.length) {

				text2[i] = this.text[i];
			} else if (i >= this.text.length) {

				text2[i] = text[i - this.text.length];
			}
		}
		;
		Text text1 = new Text(text2);
		
		return text1;
	}
	
	public void addHeading(Sentence heading) {
		
		System.out.println();
		heading.writeSentence();
		System.out.println();
		
		this.writeText();
	}

	@Override
	public String toString() {
		return Arrays.toString(text);
	}

}
