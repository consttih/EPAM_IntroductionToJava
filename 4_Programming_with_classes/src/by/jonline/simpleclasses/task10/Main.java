package by.jonline.simpleclasses.task10;

public class Main {

	public static void main(String[] args) {
		
		Airline plane1 = new Airline("Moscow", 987, "Tu-134", "12:22", "Mon, Wed");
		Airline plane2 = new Airline("Warsaw", 345, "Tu-154", "02:11", "Tue");
		Airline plane3 = new Airline("Kiev", 1023, "Tu-204", "14:48", "Fri, Sun");
		Airline plane4 = new Airline("Riga", 822, "Tu-134", "20:08", "Thu");
		Airline plane5 = new Airline("New-York", 706, "Tu-204", "06:30", "Mon, Sat");
		
		Airline[] airlines = new Airline[] {plane1, plane2, plane3, plane4, plane5};
		Airport airport = new Airport(airlines);
		
		airport.list_of_dist("warsaw");
		
		System.out.println();
		airport.list_of_days("mon");
		
		System.out.println();
		airport.list_of_days_with_time("mon", "13:00");
	}

}
