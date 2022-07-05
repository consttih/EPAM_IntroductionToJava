package by.jonline.simpleclasses.task09;

public class Book {

	private final int iD;
	private final String name;
	private final String authors;
	private String publ_house;
	private int publ_year;
	private int amount_of_pages;
	private int price;
	private String type_of_binding;

	public Book(int iD, String name, String authors, String publ_house, int publ_year, int amount_of_pages, int price,
			String type_of_binding) {
		super();
		this.iD = iD;
		this.name = name;
		this.authors = authors;
		this.publ_house = publ_house;
		this.publ_year = publ_year;
		this.amount_of_pages = amount_of_pages;
		this.price = price;
		this.type_of_binding = type_of_binding;
	}

	public String getPubl_house() {
		return publ_house;
	}

	public void setPubl_house(String publ_house) {
		this.publ_house = publ_house;
	}

	public int getPubl_year() {
		return publ_year;
	}

	public void setPubl_year(int publ_year) {
		this.publ_year = publ_year;
	}

	public int getAmount_of_pages() {
		return amount_of_pages;
	}

	public void setAmount_of_pages(int amount_of_pages) {
		this.amount_of_pages = amount_of_pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType_of_binding() {
		return type_of_binding;
	}

	public void setType_of_binding(String type_of_binding) {
		this.type_of_binding = type_of_binding;
	}

	public int getID() {
		return iD;
	}

	public String getName() {
		return name;
	}

	public String getAuthors() {
		return authors;
	}

	@Override
	public String toString() {
		return "Book [iD=" + iD + ", name=" + name + ", authors=" + authors + ", publ_house=" + publ_house
				+ ", publ_year=" + publ_year + ", amount_of_pages=" + amount_of_pages + ", price=" + price
				+ ", type_of_binding=" + type_of_binding + "]";
	}

}
