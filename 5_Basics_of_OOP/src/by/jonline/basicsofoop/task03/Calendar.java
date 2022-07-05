package by.jonline.basicsofoop.task03;

import java.util.ArrayList;

public class Calendar {
	
	private ArrayList<Holiday> holidays;
	
	{
		holidays = new ArrayList<>();
	}
	
	public Calendar() {};
	
	
	public ArrayList<Holiday> getHolidays() {
		return holidays;
	}


	public void setHolidays(ArrayList<Holiday> holidays) {
		this.holidays = holidays;
	}
	
	public void addHoliday(Holiday holiday) {
		holidays.add(holiday);
	}
	
	public void removeHoliday(Holiday holiday) {
		holidays.remove(holiday);
	}


	public static class Holiday{
		
		private String name;
		private String date;
		
		public Holiday() {}

		public Holiday(String name, String date) {
			super();
			this.name = name;
			this.date = date;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		};
		
		
		
	}

}
