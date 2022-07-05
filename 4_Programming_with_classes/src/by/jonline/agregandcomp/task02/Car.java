package by.jonline.agregandcomp.task02;

public class Car {
	
	Wheel wheel1 = new Wheel();
	Wheel wheel2 = new Wheel();
	Wheel wheel3 = new Wheel();
	Wheel wheel4 = new Wheel();
	
	Engine eingine = new Engine(20);
	
	private String brand;

	public Car(Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, Engine eingine, String brand) {
		super();
		this.wheel1 = wheel1;
		this.wheel2 = wheel2;
		this.wheel3 = wheel3;
		this.wheel4 = wheel4;
		this.eingine = eingine;
		this.brand = brand;
	}

	public Wheel getWheel1() {
		return wheel1;
	}

	public void setWheel1(Wheel wheel1) {
		this.wheel1 = wheel1;
	}

	public Wheel getWheel2() {
		return wheel2;
	}

	public void setWheel2(Wheel wheel2) {
		this.wheel2 = wheel2;
	}

	public Wheel getWheel3() {
		return wheel3;
	}

	public void setWheel3(Wheel wheel3) {
		this.wheel3 = wheel3;
	}

	public Wheel getWheel4() {
		return wheel4;
	}

	public void setWheel4(Wheel wheel4) {
		this.wheel4 = wheel4;
	}

	public Engine getEingine() {
		return eingine;
	}

	public void setEingine(Engine eingine) {
		this.eingine = eingine;
	}
	
	public String getBrand() {
		return "Brand of this car is " + brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void ride(int km){
		System.out.println("The car goes " + km + " km.");
	}
	
	public void refuel(int litr){
		System.out.println("The car is filled with " + litr + " liters.");
	}
	
}
