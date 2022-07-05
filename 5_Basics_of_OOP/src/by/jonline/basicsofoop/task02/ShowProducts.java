package by.jonline.basicsofoop.task02;

import by.jonline.basicsofoop.task02.Payment.Product;

public class ShowProducts {
	
	public void showProducts(Payment payment) {
		
		Summa summa = new Summa();
		
		for (Product prod : payment.getProducts()) {
			
			System.out.println("Name of product: " + prod.getName());
			System.out.println("Price of product: " + prod.getPrice());
			System.out.println();
		}
		
		System.out.println("Total price of all purchases is " + summa.totalCost(payment));
	}

}
