package by.jonline.simpleclasses.task09;

public class Bibliotek {

	private Book[] books;

	public Bibliotek(Book[] books) {
		super();
		this.books = books;
	}

	public void books_of_author(String Author) {

		for (int i = 0; i < books.length; i++) {
			if (books[i].getAuthors().contains(Author) == true) {
				System.out.println(books[i].toString());
			}
		}
	};
	
	public void books_of_publhouse(String publ_house) {

		for (int i = 0; i < books.length; i++) {
			if (books[i].getPubl_house().toUpperCase().contains(publ_house.toUpperCase()) == true) {
				System.out.println(books[i].toString());
			}
		}
	};
	
	public void books_after_year(int year) {

		for (int i = 0; i < books.length; i++) {
			if (books[i].getPubl_year() > year) {
				System.out.println(books[i].toString());
			}
		}
	};

}
