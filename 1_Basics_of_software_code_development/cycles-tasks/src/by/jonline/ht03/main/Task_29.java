package by.jonline.ht03.main;

public class Task_29 {

	public static void main(String[] args) {

		int a;
		int b;
		int c, d;
		int i, m, z;

		a = 8;
		b = 98;
		c = a;
		d = b;
		i = 0;
		m = 0;
		z = 0;

		while (c > 0) {
			c /= 10;
			i += 1;
		}
		;
		while (d > 0) {
			d /= 10;
			m += 1;
		}
		;

		int[] a1 = new int[i];
		int[] b1 = new int[m];

		for (int e = 0; e < i; e++) {
			a1[e] = a % 10;
			a /= 10;
		}
		;

		for (int f = 0; f < m; f++) {
			b1[f] = b % 10;
			b /= 10;
		}
		;
		for (int g = 0; g < i; g++) {
			for (int l = 0; l < m; l++) {
				if (a1[g] == b1[l]) {
					System.out.print(b1[l] + " ");
					z += 1;
				}
				;
			}
			;
		}
		;
		if (z == 0) {
			System.out.print("there are no general figures ");
		}
		;
	}

}
