package by.jonline.ht04.main;

public class Task_02 {

	public static void main(String[] args) {

		int n = 20;
		int z = 15;
		int q = 0;
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * n);
			

			if (a[i] > z) {
				a[i] = z;
				q += 1;
				System.out.print("substitution ");
			}
			;
			System.out.println((i + 1) + ") " + a[i]);
		}
		;
		System.out.println("number of substitutions is " + q);
	}

}
