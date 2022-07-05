package by.jonline.ht03.main;

public class Task_17 {

	public static void main(String[] args) {
		
		double a;
		int n;
		double s;
		
		a = 2;
		n = 3;
		s = a;
		
		for (int i = 1; i <= n - 1; i++) {
			
			s = s * (a + i);
		};
		System.out.print(s);

	}

}
