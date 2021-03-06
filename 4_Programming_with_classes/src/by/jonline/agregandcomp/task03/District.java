package by.jonline.agregandcomp.task03;

import java.util.Arrays;

public class District {
	
	private String name_of_district;
	private City[] cities_of_district;
	private int square;
	
	public District(String name_of_district, City[] cities_of_district) {
		super();
		this.name_of_district = name_of_district;
		this.cities_of_district = cities_of_district;
	}

	public String getName_of_district() {
		return name_of_district;
	}

	public void setName_of_district(String name_of_district) {
		this.name_of_district = name_of_district;
	}

	public City[] getCities_of_district() {
		return cities_of_district;
	}

	public void setCities_of_district(City[] cities_of_district) {
		this.cities_of_district = cities_of_district;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}
	
	public int squareOfDistrict() {
		
		int square = 0;
		for (int i = 0; i < cities_of_district.length; i++) {
			square += cities_of_district[i].getSquare();
		}
		
		this.square = square;
		
		return square;
	}

	@Override
	public String toString() {
		return "District [name_of_district=" + name_of_district + ", cities_of_district="
				+ Arrays.toString(cities_of_district) + ", square=" + square + "]";
	}
	
	
	

}
