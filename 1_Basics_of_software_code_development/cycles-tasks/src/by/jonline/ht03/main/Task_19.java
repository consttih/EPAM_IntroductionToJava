package by.jonline.ht03.main;

public class Task_19 {

	public static void main(String[] args) {
		
		double n;
		double sum;
		double e;
		
		e = 3.499999999999999;
		sum = 0;
		n = 0;
		
		while (sum <= e) {
			
			sum += (1 / (Math.pow(2, n))) + (1 / (Math.pow(3, n)));
			if (sum > e) {
				sum -= (1 / (Math.pow(2, n))) + (1 / (Math.pow(3, n)));
				break;
			};
			n++;
		};
		System.out.println(sum);
		
	}

}
