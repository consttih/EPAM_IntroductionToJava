package by.jonline.agregandcomp.task01;

public class Word {
	
	private String word_and_punct;

	public Word(String word_and_punct) {
		super();
		this.word_and_punct = word_and_punct;
	}

	public String getWord_and_punct() {
		return word_and_punct;
	}

	public void setWord_and_punct(String word_and_punct) {
		this.word_and_punct = word_and_punct;
	}

	@Override
	public String toString() {
		return word_and_punct;
	}
	
}
