package by.jonline.ht03.main;

import java.math.BigInteger;

public class Task_12 {

	public static void main(String[] args) {
	int a1;
	int an;
	int an1;

	BigInteger s = BigInteger.valueOf(1);
	
	a1 = 1;
	
	 for (int i = 1; i < 10; i++) {
		 an1 = a1;
		 an = 6 + an1;
		 BigInteger k2 = BigInteger.valueOf(an);
		 s = s.multiply(k2);
		 a1 = an;
	 };
	 System.out.print(s);
	}

}
