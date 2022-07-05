package by.jonline.ht03.main;

import java.math.BigInteger;

public class Task_11 {

	public static void main(String[] args) {
		
		BigInteger dif = BigInteger.valueOf(0);
		long k;
		
		for (int i = 0; i <= 200; i++) {
			k = (long)(Math.pow(i, 3));
			BigInteger k2 = BigInteger.valueOf(k);
			dif = dif.subtract(k2);
		};
		System.out.print(dif);

	}

}
