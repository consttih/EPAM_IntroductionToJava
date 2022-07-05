package by.jonline.agregandcomp.task05;

public class TravelPackage {
	
	private String name;
	private String type;
	private String transport;
	private String eat_type;
	private int amount_of_days;
	
	public TravelPackage(String name, String type, String transport, String eat_type, int amount_of_days) {
		super();
		this.name = name;
		this.type = type;
		this.transport = transport;
		this.eat_type = eat_type;
		this.amount_of_days = amount_of_days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getEat_type() {
		return eat_type;
	}

	public void setEat_type(String eat_type) {
		this.eat_type = eat_type;
	}

	public int getAmount_of_days() {
		return amount_of_days;
	}

	public void setAmount_of_days(int amount_of_days) {
		this.amount_of_days = amount_of_days;
	}

	@Override
	public String toString() {
		return "TravelPackage [name=" + name + ", type=" + type + ", transport=" + transport + ", eat_type=" + eat_type
				+ ", amount_of_days=" + amount_of_days + "]";
	}

	
}
