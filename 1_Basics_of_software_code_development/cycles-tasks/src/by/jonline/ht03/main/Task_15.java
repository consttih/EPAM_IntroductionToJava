package by.jonline.ht03.main;

import java.math.BigInteger;

public class Task_15 {

	public static void main(String[] args) {
		
		int n;
		int ss;
		
		ss = 0;
		n = 11;
		
				for (int i = 1; i < n; i = i * 2) {
			ss = ss + i; 
		};
		
		BigInteger ss2 = BigInteger.valueOf(ss);
		BigInteger s = ss2.pow(10);
		System.out.println(ss);
		System.out.println(s);
	}

}
