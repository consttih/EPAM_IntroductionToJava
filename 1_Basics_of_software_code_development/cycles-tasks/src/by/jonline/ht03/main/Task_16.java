package by.jonline.ht03.main;

public class Task_16 {

	public static void main(String[] args) {
	long s;
	int s1;
	int s2;
	
	s2 = 1;
	s = 1;
	
		for (int i = 2; i <= 10; i++) {
			s1 = s2;
			s = s * (s1 + i);
			s2 = s1 + i;
		};
		System.out.println(s);

	}

}
