package by.jonline.simpleclasses.task07;

import java.util.Arrays;

public class Triangle {

	private int[] point1;
	private int[] point2;
	private int[] point3;;

	public Triangle(int[] point1, int[] point2, int[] point3) {
		super();
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}

	public double square() {
		double s = ((point2[0] - point1[0]) * (point3[1] - point1[1]) - (point3[0] - point1[0]) * (point2[1] - point1[1])) / 2;
		
		return s;
	}
	
	public double perimeter() {
		
		double side1 = Math.sqrt(Math.pow((point1[0] - point2[0]), 2) + Math.pow((point1[1] - point2[1]), 2));
		double side2 = Math.sqrt(Math.pow((point2[0] - point3[0]), 2) + Math.pow((point2[1] - point3[1]), 2));
		double side3 = Math.sqrt(Math.pow((point3[0] - point1[0]), 2) + Math.pow((point3[1] - point1[1]), 2));
		
		return side1 + side2 + side3;
	}
	
	public int[] mediana() {
		int[] koord_med = new int[2];
		koord_med[0] = (point1[0] + point2[0] + point3[0]) / 3;
		koord_med[1] = (point1[1] + point2[1] + point3[1]) / 3;
		
		return koord_med;
	}

	@Override
	public String toString() {
		return "Triangle [point1=" + Arrays.toString(point1) + ", point2=" + Arrays.toString(point2) + ", point3="
				+ Arrays.toString(point3) + "]";
	}
	

}
