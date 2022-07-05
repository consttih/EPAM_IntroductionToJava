package by.jonline.ht07.main;

public class Task_09 {

	public static void main(String[] args) {

		double X;
		double Y;
		double Z;
		double T; // стороны четырёхугольника

		double XY; // гипотенуза
		double square;

		X = 3;
		Y = 4;
		Z = 9;
		T = 5;

		XY = Hypothenuza(X, Y);
		square = Rectangular(X, Y) + TriangleSq(Z, T, XY);

		System.out.println(square);

	};

	public static double Hypothenuza(double x1, double x2) {
		double hyp;

		hyp = Math.sqrt(((Math.pow(x1, 2)) + (Math.pow(x2, 2))));
		return hyp;
	};

	public static double Rectangular(double x1, double x2) {
		double sqrect;

		sqrect = (x1 * x2) / 2;
		return sqrect;
	};

	public static double TriangleSq(double x1, double x2, double x3) {
		double pp;
		double trsq;

		pp = (x1 + x2 + x3) / 2;
		trsq = Math.sqrt(pp * (pp - x1) * (pp - x2) * (pp - x3));

		return trsq;
	};

}
