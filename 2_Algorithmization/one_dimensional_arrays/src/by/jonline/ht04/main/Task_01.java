package by.jonline.ht04.main;

public class Task_01 {

	public static void main(String[] args) {

		int n;
		int k;
		int s;

		k = 3;
		n = 30;
		s = 0;

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = i;
			if (a[i] % k == 0) {
				s += a[i];
			}
			;
		}
		;
		System.out.println(s);
	}

}
