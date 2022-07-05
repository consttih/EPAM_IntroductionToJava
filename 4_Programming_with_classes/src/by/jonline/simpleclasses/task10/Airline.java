package by.jonline.simpleclasses.task10;

public class Airline {

	private String destination;
	private int flight_number;
	private String plane_type;
	private String time;
	private String days;
	
	public Airline(String destination, int flight_number, String plane_type, String time, String days) {
		super();
		this.destination = destination;
		this.flight_number = flight_number;
		this.plane_type = plane_type;
		this.time = time;
		this.days = days;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlight_number() {
		return flight_number;
	}

	public void setFlight_number(int flight_number) {
		this.flight_number = flight_number;
	}

	public String getPlane_type() {
		return plane_type;
	}

	public void setPlane_type(String plane_type) {
		this.plane_type = plane_type;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flight_number=" + flight_number + ", plane_type=" + plane_type
				+ ", time=" + time + ", days=" + days + "]";
	}
	
	
}
