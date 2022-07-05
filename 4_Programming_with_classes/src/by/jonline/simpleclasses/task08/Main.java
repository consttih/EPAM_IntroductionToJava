package by.jonline.simpleclasses.task08;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(12345, "Ivanov", "Ivan", "Ivanovich", "ul. Ivanovskaya, 16", "1234432156788765", 65478);
		Customer customer2 = new Customer(12346, "Avanov", "Avan", "Avanovich", "ul. Avanovskaya, 17", "1234432156788766", 65479);
		Customer customer3 = new Customer(12347, "Bvanov", "Bvan", "Bvanovich", "ul. Bvanovskaya, 16", "1234432156788767", 65480);
		Customer customer4 = new Customer(12348, "Cvanov", "Cvan", "Cvanovich", "ul. Cvanovskaya, 16", "1234432156788768", 65481);
		Customer customer5 = new Customer(12349, "Zvanov", "Zvan", "Zvanovich", "ul. Zvanovskaya, 16", "1234432156788769", 65482);
		
		Customer[] cust = new Customer[] {customer1, customer2, customer3, customer4, customer5};
		
		Class_2 customers = new Class_2(cust);
		customers.writeArray();
		
		System.out.println();
		customers.alph_sort();
		customers.writeArray();
		
		System.out.println();
		customers.card_choice("1234432156788765", "1234432156788768");
		

	}
	

}
