package by.jonline.basicsofoop.task02;

import by.jonline.basicsofoop.task02.Payment.Product;

public class Main {

	public static void main(String[] args) {
		
		Payment payment = new Payment();
		ShowProducts sh_pr = new ShowProducts();
		
		payment.addProduct(new Product("Notebook", 600));
		payment.addProduct(new Product("TV", 1200));
		payment.addProduct(new Product("iPhone", 900));
		
		sh_pr.showProducts(payment);
		System.out.println();
		
		Payment.Product prod = new Payment.Product();
		prod.setName("iPad");
		prod.setPrice(1000);
		
		payment.addProduct(prod);
		
		sh_pr.showProducts(payment);
		System.out.println();
		
		payment.removeProduct(prod);
		
		sh_pr.showProducts(payment);
		

	}

}
