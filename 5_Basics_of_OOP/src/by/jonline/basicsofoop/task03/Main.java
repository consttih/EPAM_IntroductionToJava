package by.jonline.basicsofoop.task03;

import by.jonline.basicsofoop.task03.Calendar.Holiday;

public class Main {

	public static void main(String[] args) {
		
		Calendar calendar = new Calendar();
		Show show_hol = new Show();
		
		calendar.addHoliday(new Holiday("New Year", "01.01"));
		calendar.addHoliday(new Holiday("Victory day", "09.05"));
		calendar.addHoliday(new Holiday("Independence day", "03.07"));
		calendar.addHoliday(new Holiday("Knowledge day", "01.09"));
		
		show_hol.showholidays(calendar);
		System.out.println();
		
		Calendar.Holiday new_hol = new Calendar.Holiday();
		new_hol.setName("Birthday");
		new_hol.setDate("23.10");
		
		calendar.addHoliday(new_hol);
		show_hol.showholidays(calendar);
		System.out.println();
		
		calendar.removeHoliday(new_hol);
		show_hol.showholidays(calendar);
		System.out.println();
		

	}

}
