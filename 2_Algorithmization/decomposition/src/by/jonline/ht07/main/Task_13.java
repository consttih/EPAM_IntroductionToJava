package by.jonline.ht07.main;

public class Task_13 {

	public static void main(String[] args) {

		int n = 20;
		NumbersTwins(n);

	};

	public static int[][] NumbersTwins(int x) {

		int[][] twins = new int[x - 1][2];
		for (int i = 0; i < (x - 1); i++) {
			twins[i][0] = x + i;
			twins[i][1] = twins[i][0] + 2;
			System.out.println(twins[i][0] + " " + twins[i][1]);
		}
		;

		return twins;
	};

}
