package by.jonline.basicsofoop.task03;

import by.jonline.basicsofoop.task03.Calendar.Holiday;

public class Show {
	
	public void showholidays(Calendar calend) {
		
		System.out.println("Holidays: ");
		
		for (Holiday hol : calend.getHolidays()) {
			
			System.out.println(hol.getDate() + " - " + hol.getName());
		}
		
		System.out.println();
		
	}

}
