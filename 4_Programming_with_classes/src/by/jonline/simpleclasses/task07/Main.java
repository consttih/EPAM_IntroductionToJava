package by.jonline.simpleclasses.task07;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] koord1 = new int[]{1, 2};
		int[] koord2 = new int[]{3, 4};
		int[] koord3 = new int[]{2, 6};
		
		Triangle tr1 = new Triangle(koord1, koord2, koord3);
		
		System.out.println(tr1.square());
		System.out.println(tr1.perimeter());
		System.out.println(Arrays.toString(tr1.mediana()));

	}

}
