package by.jonline.simpleclasses.task05;

public class Counter {

	private int value;
	private int maxValue;
	private int minValue;

	public Counter() {
		value = 10;
		maxValue = 20;
		minValue = 5;
	}

	public Counter(int value, int maxValue, int minValue) {

		int tmp = Math.min(maxValue, minValue);
		if (tmp != minValue) {

			maxValue = minValue;
			minValue = tmp;
		}
		if (value > maxValue) {
			System.out.println("value is more than maxValue.\nvalue = maxValue");
			this.value = maxValue;
		} else if (value < minValue) {
			System.out.println("value is less than minValue.\nvalue = minValue");
			this.value = minValue;
		} else {
			this.value = value;
		}
		;
		
		this.maxValue = maxValue;
		this.minValue = minValue;

	}

	public int getValue() {
		return value;
	}
	
	public void increase() {
		this.value++;
		if (this.value > maxValue) {
			this.value = maxValue;
		}
		
	}
	
	public void decrease() {
		this.value--;
		if(this.value < minValue) {
			this.value = minValue;
		}
		
	}

}
