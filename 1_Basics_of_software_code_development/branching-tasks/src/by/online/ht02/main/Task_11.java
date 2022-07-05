package by.online.ht02.main;

public class Task_11 {

	public static void main(String[] args) {
		
		double a1, b1, c1;
		double a2, b2, c2;
		double s1, s2;
		double p1, p2;
		
		a1 = 4;
		b1 = 5;
		c1 = 7;
		
		a2 = 3;
		b2 = 5;
		c2 = 4;
		
		p1 = (a1 + b1 + c1) / 2;
		p2 = (a2 + b2 + c2) / 2;
		
		s1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
		s2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));
		
		System.out.println(s1);
		System.out.println(s2);
		
		if (s1 < s2) {
			System.out.println("the first triangle is smaller");
		} else if (s2 < s1) {
			System.out.println("the second triangle is smaller");
		}else {
			System.out.println("two triangles are equally");
		}
		

	}

}
