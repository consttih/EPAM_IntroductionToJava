package by.jonline.agregandcomp.task03;

public class City {
	
	private String name_of_city;
	private int square;

	public City(String name_of_city, int square) {
		super();
		this.name_of_city = name_of_city;
		this.square = square;
	}

	public String getName_of_city() {
		return name_of_city;
	}

	public void setName_of_city(String name_of_city) {
		this.name_of_city = name_of_city;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	@Override
	public String toString() {
		return "City " + name_of_city + " (square=" + square + ")";
	}
	
	

}
