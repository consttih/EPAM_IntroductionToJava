package by.jonline.basicsofoop.task02;

import by.jonline.basicsofoop.task02.Payment.Product;

public class Summa {
	
	public double totalCost(Payment payment) {
		
		double summa = 0;
		
		for(Product prod : payment.getProducts()) {
			
			summa += prod.getPrice();
		}
		
		return summa;
	}
}
