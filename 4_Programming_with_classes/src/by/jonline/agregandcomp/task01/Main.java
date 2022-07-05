package by.jonline.agregandcomp.task01;

public class Main {

	public static void main(String[] args) {
		
		Word word1 = new Word("Hello");
		Word word2 = new Word(",");
		Word word3 = new Word("my");
		Word word4 = new Word("name");
		Word word5 = new Word("is");
		Word word6 = new Word("Konstantin");
		
		Word word7 = new Word("I");
		Word word8 = new Word("am");
		Word word9 = new Word("programming");
		Word word10 = new Word("in");
		Word word11 = new Word("Java");
		
		Word word12 = new Word("I");
		Word word13 = new Word("study");
		Word word14 = new Word("chemistry");
		
		Word word15 = new Word("I");
		Word word16 = new Word("live");
		Word word17 = new Word("in");
		Word word18 = new Word("Minsk");
		
		Word word19 = new Word("ABOUT");
		Word word20 = new Word("ME");
		
		
		Word[] senten1 = new Word[] {word1, word2, word3, word4, word5, word6};
		Word[] senten2 = new Word[] {word7, word8, word9, word10, word11};
		Word[] senten3 = new Word[] {word12, word13, word14};
		Word[] senten4 = new Word[] {word15, word16, word17, word18};
		Word[] senten5 = new Word[] {word19, word20};
		
		Sentence sentence1 = new Sentence(senten1);
		Sentence sentence2 = new Sentence(senten2);
		Sentence sentence3 = new Sentence(senten3);
		Sentence sentence4 = new Sentence(senten4);
		Sentence heading = new Sentence(senten5);
		
		Sentence[] tex1 = new Sentence[] {sentence1, sentence2};
		Sentence[] tex2 = new Sentence[] {sentence3, sentence4};
		
		Text text1 = new Text(tex1);
		
		text1.writeText();
		
		System.out.println();
		Text text2 = new Text();
		text2 = text1.addSentences(tex2);
		text2.writeText();
		
		System.out.println();
		text2.addHeading(heading);
		
	}

}
