package by.jonline.ht03.main;

import java.math.BigInteger;

public class Task_10 {

	public static void main(String[] args) {
		BigInteger s = BigInteger.valueOf(1);
		long q;
		
		for (int i = 1; i <= 200; i++) {
			q = (long)(Math.pow(i, 2));
			BigInteger q2 = BigInteger.valueOf(q);
			s = s.multiply(q2);
			
		}
		System.out.print(s);
	}

}
