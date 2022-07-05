package by.jonline.simpleclasses.task06;

//приложение изменяет время вперёд и назад

public class Main {

	public static void main(String[] args) {
		
		Time time1 = new Time(13, 15, 56);
		System.out.println(time1.toString());
		
		/*
		time1.hourChange(15);
		System.out.println(time1.toString());
		
		
		time1.minChange(5);
		System.out.println(time1.toString());
		
		
		time1.secChange(0);
		System.out.println(time1.toString());
		*/
		
		time1.timeChange(2, 30, 40);
		System.out.println(time1.toString());
	
	}

}
