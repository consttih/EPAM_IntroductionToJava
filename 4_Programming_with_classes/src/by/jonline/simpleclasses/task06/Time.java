package by.jonline.simpleclasses.task06;

public class Time {

	private int hour;
	private int min;
	private int sec;

	public Time(int hour, int min, int sec) {
		super();
		if (hour > 24 || hour < 0) {
			System.out.println("Hours should be in the range from 0 to 24.\nhour = 0");
			this.hour = 0;
		}
		this.hour = hour;

		if (min > 60 || min < 0) {
			System.out.println("Minutes should be in the range from 0 to 60.\nminutes = 0");
			this.min = 0;
		}
		this.min = min;

		if (sec > 60 || sec < 0) {
			System.out.println("Seconds should be in the range from 0 to 60.\nseconds = 0");
			this.sec = 0;
		}
		this.sec = sec;
	};

	public void hourChange(int h) {

		int timecomm = hour * 3600 + min * 60 + sec + h * 3600;

		if (timecomm >= 0) {
			int tr_s = timecomm % 60;
			int tr_m = (timecomm % 3600) / 60;
			int tr_h = (timecomm % (3600 * 24)) / 3600;

			this.sec = tr_s;
			this.min = tr_m;
			this.hour = tr_h;
		}

		if (timecomm < 0) {

			timecomm = 86400 + (timecomm);

			int tr_s = timecomm % 60;
			int tr_m = (timecomm % 3600) / 60;
			int tr_h = (timecomm % (3600 * 24)) / 3600;

			this.sec = tr_s;
			this.min = tr_m;
			this.hour = tr_h;

		}

	}

	public void minChange(int m) {

		int timecomm = hour * 3600 + min * 60 + sec + m * 60;

		if (timecomm >= 0) {
			int tr_s = timecomm % 60;
			int tr_m = (timecomm % 3600) / 60;
			int tr_h = (timecomm % (3600 * 24)) / 3600;

			this.sec = tr_s;
			this.min = tr_m;
			this.hour = tr_h;
		}

		if (timecomm < 0) {

			timecomm = 86400 + (timecomm);

			int tr_s = timecomm % 60;
			int tr_m = (timecomm % 3600) / 60;
			int tr_h = (timecomm % (3600 * 24)) / 3600;

			this.sec = tr_s;
			this.min = tr_m;
			this.hour = tr_h;

		}

	}

	public void secChange(int s) {

		int timecomm = hour * 3600 + min * 60 + sec + s;

		if (timecomm >= 0) {

			int tr_s = timecomm % 60;
			int tr_m = (timecomm % 3600) / 60;
			int tr_h = (timecomm % (3600 * 24)) / 3600;

			this.sec = tr_s;
			this.min = tr_m;
			this.hour = tr_h;

		}

		if (timecomm < 0) {

			timecomm = 86400 + (timecomm);

			int tr_s = timecomm % 60;
			int tr_m = (timecomm % 3600) / 60;
			int tr_h = (timecomm % (3600 * 24)) / 3600;

			this.sec = tr_s;
			this.min = tr_m;
			this.hour = tr_h;

		}
	}
	
	public void timeChange(int h, int m, int s) {

		int timecomm = hour * 3600 + min * 60 + sec + s + m * 60 + h * 3600;

		if (timecomm >= 0) {

			int tr_s = timecomm % 60;
			int tr_m = (timecomm % 3600) / 60;
			int tr_h = (timecomm % (3600 * 24)) / 3600;

			this.sec = tr_s;
			this.min = tr_m;
			this.hour = tr_h;

		}

		if (timecomm < 0) {

			timecomm = 86400 + (timecomm);

			int tr_s = timecomm % 60;
			int tr_m = (timecomm % 3600) / 60;
			int tr_h = (timecomm % (3600 * 24)) / 3600;

			this.sec = tr_s;
			this.min = tr_m;
			this.hour = tr_h;

		}
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + ", sec=" + sec + "]";
	}

}
