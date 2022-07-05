package by.jonline.simpleclasses.task05;

public class Main {

	public static void main(String[] args) {
		
		Counter count = new Counter(16, 20, 12);
		System.out.println("Start value: ");
		System.out.println(count.getValue());
		
		/*
		int sch = 0;
		
		while(sch != 7) {
			count.increase();
			sch++;
		}
		
		System.out.println("Finish value (increase): ");
		System.out.println(count.getValue());
		*/
		
		
        int sch2 = 0;
		
		while(sch2 != 3) {
			count.decrease();
			sch2++;
		}
		
		System.out.println("Finish value (decrease): ");
		System.out.println(count.getValue());

	}

}
