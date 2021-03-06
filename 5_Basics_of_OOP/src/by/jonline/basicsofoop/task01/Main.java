package by.jonline.basicsofoop.task01;

public class Main {

	public static void main(String[] args) {
		
		Directory direct1 = new Directory("Literature");
		TextFile pushkin = new TextFile("Pushkin", direct1); //создание 
		String content_push = "I loved you, and that love, to die refusing,\r\n"
				+ "May still - who knows! - be smouldering in my breast\r\n"
				+ "Pray be not pained - believe me, of my choosing\r\n"
				+ "I had never have you troubled or distressed.";
		pushkin.complement(content_push); // дополнение
	
		TextFile blok = new TextFile("Blok", direct1);
		String content_blok = "I know your face so well, my fair,\r\n"
				+ "It feels like you have lived with me.\r\n"
				+ "At home, at parties, - everywhere\r\n"
				+ "Your dainty look is what I see.";
		blok.complement(content_blok);
		
		System.out.println(pushkin.getName()); // переименование
		pushkin.changeName("Pushkiin");
		System.out.println(pushkin.getName());
		System.out.println();
		
		blok.showContent();
		System.out.println();
		pushkin.showContent();
		System.out.println();
		
		String content_push2 = "\nI loved you mutely, hopelessly and truly,\r\n"
				+ "With shy yet fervent tenderness aglow;\r\n"
				+ "Mine was a jealous passion and unruly...\r\n"
				+ "May God grant that another will love you so!";
		pushkin.complement(content_push2);
		
		pushkin.showContent(); // вывод содержимого
		System.out.println();
		
		View.showDirectory(direct1);
		
		direct1.removeFile("blok"); // удаление
		TextFile tolstoy = new TextFile("Tolstoy");
		direct1.addTextFile(tolstoy);
		
		View.showDirectory(direct1);

	}

}
