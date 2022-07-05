package by.jonline.simpleclasses.task10;

public class Airport {

	private Airline[] airlines;

	public Airport(Airline[] airlines) {
		super();
		this.airlines = airlines;
	}

	public void list_of_dist(String dist) {

		for (int i = 0; i < airlines.length; i++) {
			if (airlines[i].getDestination().toUpperCase().compareTo(dist.toUpperCase()) == 0) {
				System.out.println(airlines[i].toString());
			}
		}
	};

	public void list_of_days(String day) {

		for (int i = 0; i < airlines.length; i++) {
			if (airlines[i].getDays().toUpperCase().contains(day.toUpperCase()) == true) {
				System.out.println(airlines[i].toString());
			}
		}
	};

	public void list_of_days_with_time(String day, String time) {

		for (int i = 0; i < airlines.length; i++) {
			if ((airlines[i].getDays().toUpperCase().contains(day.toUpperCase()) == true)
					&& (airlines[i].getTime().compareTo(time) > 0)) {
				System.out.println(airlines[i].toString());
			}
		}
	};

}
