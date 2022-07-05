package by.jonline.agregandcomp.task02;

public class Engine {
	
	private int fuel_consumption;

	public Engine(int fuel_consumption) {
		super();
		this.fuel_consumption = fuel_consumption;
	}

	public int getFuel_consumption() {
		return fuel_consumption;
	}

	public void setFuel_consumption(int fuel_consumption) {
		this.fuel_consumption = fuel_consumption;
	}

	@Override
	public String toString() {
		return "" + fuel_consumption;
	}
	
}
