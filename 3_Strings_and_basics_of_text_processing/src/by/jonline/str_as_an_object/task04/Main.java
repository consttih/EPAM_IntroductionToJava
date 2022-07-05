package by.jonline.str_as_an_object.task04;

public class Main {

	public static void main(String[] args) {

		String str = "Informatika";
		toCake(str);
	}

	public static void toCake(String str) {

		int index_t = str.indexOf('t');
		int index_o = str.indexOf('o');
		int index_r = str.indexOf('r');

		StringBuilder sb = new StringBuilder();
		
		sb.append(str.charAt(index_t)).append(str.charAt(index_o)).append(str.charAt(index_r))
				.append(str.charAt(index_t));
		
		sb.toString();

		System.out.println(sb);
	}

}
