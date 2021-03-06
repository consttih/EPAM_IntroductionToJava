package by.jonline.basicsofoop.task02;

import java.util.ArrayList;

public class Payment {

	private ArrayList<Product> products;
	
	{
		
		products = new ArrayList<>();
		
	}
	
	
	public Payment() {}
	

	public ArrayList<Product> getProducts() {
		return products;
	}


	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public void addProduct(Product prod) {
		this.products.add(prod);
	}
	
	
	public void removeProduct(Product prod) {
		this.products.remove(prod);
	}


	public static class Product{
		
		private String name;
		private double price;
		
		public Product() {};
		
		public Product(String name, double price) {
			super();
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		
	}
}
