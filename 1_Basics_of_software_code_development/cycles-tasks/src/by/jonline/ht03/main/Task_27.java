package by.jonline.ht03.main;

public class Task_27 {

	public static void main(String[] args) {

		int n, m;
		int s;
		m = 126;
		n = 138;

		for (int i = m; i <= n; i++) {

			System.out.println("For " + i + ":");

			s = 2;

			while (i != s) {

				if (i % s == 0) {
					System.out.println(">> " + s);
				}
				;
				s++;
			}
			;

		}
		;

	}

}
