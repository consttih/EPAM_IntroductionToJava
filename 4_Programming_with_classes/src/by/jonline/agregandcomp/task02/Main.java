package by.jonline.agregandcomp.task02;

public class Main {

	public static void main(String[] args) {
		
		Wheel wheel1 = new Wheel();
		Wheel wheel2 = new Wheel();
		Wheel wheel3 = new Wheel();
		Wheel wheel4 = new Wheel();
		
		Engine eingine = new Engine(20);
		
		Car bmw = new Car(wheel1, wheel2, wheel3, wheel4, eingine, "BMW");
		
		bmw.ride(20);
		bmw.refuel(10);
		bmw.wheel4.changeWheel(70);
		System.out.println(bmw.getBrand());
	
	}

}
