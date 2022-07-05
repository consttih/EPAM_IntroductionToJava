package by.jonline.simpleclasses.task04;

public class Train {
	
	private String destination;
	private int train_num;
	private String time;
	
	public Train(String destination, int train_num, String time) {
		super();
		this.destination = destination;
		this.train_num = train_num;
		this.time = time;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTrain_num() {
		return train_num;
	}

	public void setTrain_num(int train_num) {
		this.train_num = train_num;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Train [destination=" + destination + ", train_num=" + train_num + ", time=" + time + "]";
	}
	
	public int compareToPlus(Train tr) {
		
		int result = this.destination.compareTo(tr.destination);
		
		if (result == 0) {
			result = this.time.compareTo(tr.time);
		}
		
		return result;
	}

	

}
