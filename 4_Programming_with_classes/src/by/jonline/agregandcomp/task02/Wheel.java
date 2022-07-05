package by.jonline.agregandcomp.task02;

public class Wheel {
	
	private int diametr;
	
	public Wheel() {
		diametr = 60;
	}

	public Wheel(int diametr) {
		super();
		this.diametr = diametr;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}
	
	public void changeWheel(int new_diametr) {
		
		this.diametr = new_diametr;
		System.out.println("The wheel has been changed.");
		System.out.println("New diameter is " + new_diametr);
	}

	@Override
	public String toString() {
		return "" + diametr;
	}
	

}
