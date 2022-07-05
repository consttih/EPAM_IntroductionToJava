package by.jonline.simpleclasses.task08;

public class Customer {
	
	private final int ID;
	private final String surname;
	private final String name;
	private final String patr;
	private String address;
	private String cred_card_num;
	private int bank_acc_num;
	
	public Customer(int iD, String surname, String name, String patr, String address, String cred_card_num,
			int bank_acc_num) {
		super();
		ID = iD;
		this.surname = surname;
		this.name = name;
		this.patr = patr;
		this.address = address;
		this.cred_card_num = cred_card_num;
		this.bank_acc_num = bank_acc_num;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCred_card_num() {
		return cred_card_num;
	}

	public void setCred_card_num(String cred_card_num) {
		this.cred_card_num = cred_card_num;
	}

	public int getBank_acc_num() {
		return bank_acc_num;
	}

	public void setBank_acc_num(int bank_acc_num) {
		this.bank_acc_num = bank_acc_num;
	}

	public int getID() {
		return ID;
	}

	public String getSurname() {
		return surname;
	}

	public String getName() {
		return name;
	}

	public String getPatr() {
		return patr;
	}

	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", surname=" + surname + ", name=" + name + ", patr=" + patr + ", address="
				+ address + ", cred_card_num=" + cred_card_num + ", bank_acc_num=" + bank_acc_num + "]";
	}
	
	public int compareTo(Customer castomer) {
		return this.surname.compareTo(castomer.surname);
	}
	
	

}
