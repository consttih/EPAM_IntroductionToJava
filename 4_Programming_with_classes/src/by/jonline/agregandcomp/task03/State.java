package by.jonline.agregandcomp.task03;

import java.util.Arrays;

public class State {

	private String name_of_state;
	private Region[] regions_of_state;
	private int square;
	private City capital_of_state;

	public State(String name_of_state, Region[] regions_of_state, City capital_of_state) {
		super();
		this.name_of_state = name_of_state;
		this.regions_of_state = regions_of_state;
		this.capital_of_state = capital_of_state;
	}

	public String getName_of_state() {
		return name_of_state;
	}

	public void setName_of_state(String name_of_state) {
		this.name_of_state = name_of_state;
	}

	public Region[] getRegions_of_state() {
		return regions_of_state;
	}

	public void setRegions_of_state(Region[] regions_of_state) {
		this.regions_of_state = regions_of_state;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	public City getCapital_of_state() {
		return capital_of_state;
	}

	public void setCapital_of_state(City capital_of_state) {
		this.capital_of_state = capital_of_state;
	}

	public int amountOfRegions() {
		return regions_of_state.length;
	}

	public int squareOfState() {

		int square = 0;
		for (int i = 0; i < regions_of_state.length; i++) {
			square += regions_of_state[i].getSquare();
		}
		
		this.square = square;

		return square;
	}
	
	public void capitOfReg() {
		
		for (int i = 0; i < regions_of_state.length; i++) {
			System.out.println("Capital of " + regions_of_state[i].getName_of_region() + " is " + regions_of_state[i].getCapital_of_region());
		}
	}

	@Override
	public String toString() {
		return "State [name_of_state=" + name_of_state + ", regions_of_state=" + Arrays.toString(regions_of_state)
				+ ", square=" + square + ", capital_of_state=" + capital_of_state + "]";
	}
	
	

}
