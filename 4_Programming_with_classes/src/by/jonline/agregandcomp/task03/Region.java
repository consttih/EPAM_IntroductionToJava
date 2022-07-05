package by.jonline.agregandcomp.task03;

import java.util.Arrays;

public class Region {

	private String name_of_region;
	private District[] districs_of_region;
	private City capital_of_region;
	private int square;

	public Region(String name_of_region, District[] districs_of_region, City capital_of_region) {
		super();
		this.name_of_region = name_of_region;
		this.districs_of_region = districs_of_region;
		this.capital_of_region = capital_of_region;
	}

	public String getName_of_region() {
		return name_of_region;
	}

	public void setName_of_region(String name_of_region) {
		this.name_of_region = name_of_region;
	}

	public District[] getDistrics_of_region() {
		return districs_of_region;
	}

	public void setDistrics_of_region(District[] districs_of_region) {
		this.districs_of_region = districs_of_region;
	}

	public City getCapital_of_region() {
		return capital_of_region;
	}

	public void setCapital_of_region(City capital_of_region) {
		this.capital_of_region = capital_of_region;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	public int squareOfRegion() {

		int square = 0;
		for (int i = 0; i < districs_of_region.length; i++) {
			square += districs_of_region[i].getSquare();
		}
		
		this.square = square;

		return square;
	}

	@Override
	public String toString() {
		return "Region [name_of_region=" + name_of_region + ", districs_of_region="
				+ Arrays.toString(districs_of_region) + ", capital_of_region=" + capital_of_region + ", square="
				+ square + "]";
	}
	
	

}
