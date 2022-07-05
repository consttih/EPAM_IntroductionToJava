package by.jonline.simpleclasses.task09;

public class Main {

	public static void main(String[] args) {
		
		Book book1 = new Book(1234, "Chemistry", "I.I. Ivanov, S.S. Sidarov", "PIECE", 2020, 234, 25, "hardcover");
		Book book2 = new Book(1235, "Physics", "A.A. Avanov, S.A. Sidarov", "WORLD", 2012, 560, 25, "hardcover");
		Book book3 = new Book(1236, "Maths", "S.S. Sidarov", "SCIENCE", 2022, 780, 25, "paperback");
		Book book4 = new Book(1237, "Biology", "I.I. Ivanov", "TIME", 2018, 900, 25, "hardcover");
		Book book5 = new Book(1238, "Java", "K.K. Kolesnikov", "PIECE", 2016, 1156, 25, "paperback");
		
		Book[] books = new Book[] {book1, book2, book3, book4, book5};
		Bibliotek bibl = new Bibliotek(books);
		
		bibl.books_of_author("Ivanov");
		
		System.out.println();
		bibl.books_of_publhouse("world");
		
		System.out.println();
		bibl.books_after_year(2016);

	}

}
