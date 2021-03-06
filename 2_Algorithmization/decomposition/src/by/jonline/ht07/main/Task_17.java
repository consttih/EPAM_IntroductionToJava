package by.jonline.ht07.main;

public class Task_17 {

	public static void main(String[] args) {
		
		int numb = 123;
		int q = SkolkoRaz(numb);
		
		System.out.println(q);
	};
	
	public static int SkolkoRaz(int x1) {
		
		int q = 0;
		int razn = x1;
		
		do {
			int sumofnumb = SumOfNumbers(x1);
			razn -= sumofnumb;
			
			x1 = razn;
			q += 1;
			
		}while (razn != 0);
		
		return q;
	};
	
	public static int SumOfNumbers(int x1) {
		
		int[] bynum = ByNumbers(x1);
		int kol = bynum.length;
		int sum = 0;
		
		for (int i = 0; i < kol; i++) {
			sum += bynum[i];
		};
		
		return sum;
	};
	
	public static int[] ByNumbers(int x1) {

		int sch = x1;
		int p = 0;

		while (sch != 0) {

			sch /= 10;
			p += 1;
		}
		;

		int[] byNum = new int[p];
		for (int i = 0; i < p; i++) {

			byNum[i] = (x1 % (int) (Math.pow(10, i + 1))) / (int) (Math.pow(10, i));
		}
		;

		return byNum;
	};

}
