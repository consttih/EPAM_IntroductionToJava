package by.jonline.basicsofoop.task01;

public class View {
	
	public static void showDirectory(Directory direct) {
		System.out.println("Directory " + direct.getName() + ": ");
		System.out.println("Files of directory: ");
		for (TextFile file : direct.getFiles()) {
			System.out.println(">> " + file.getName());
		}
		
		System.out.println();
	}

}
