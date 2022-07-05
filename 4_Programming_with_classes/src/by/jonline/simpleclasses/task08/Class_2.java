package by.jonline.simpleclasses.task08;

public class Class_2 {

	private Customer[] customer;

	public Class_2(Customer[] customer) {
		this.customer = customer;
	}

	public Customer[] alph_sort() {

		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;

			for (int i = 1; i < customer.length; i++) {

				if (customer[i].compareTo(customer[i - 1]) < 0) {
					Customer tmp = customer[i];
					customer[i] = customer[i - 1];
					customer[i - 1] = tmp;

					needIteration = true;
				}
				;
			}
			;
		}
		;

		return customer;

	}

	public void writeArray() {

		for (int i = 0; i < customer.length; i++) {
			System.out.println(customer[i].toString());
		}
	}

	public void card_choice(String start, String finish) {

		for (int i = 0; i < customer.length; i++) {
			if (customer[i].getCred_card_num().compareTo(start) > 0
					&& customer[i].getCred_card_num().compareTo(finish) < 0) {
				System.out.println(customer[i].toString());
			}
		}
		;
	};

}
