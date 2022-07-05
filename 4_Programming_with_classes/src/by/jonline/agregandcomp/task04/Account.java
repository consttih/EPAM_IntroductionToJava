package by.jonline.agregandcomp.task04;

public class Account {
	
	private String account_number;
	private int ammount_of_money;
	private String owner;
	private String status;
	
	{
		status = "unblocked";
		
	}
	
	public Account(String account_number, int ammount_of_money, String owner) {
		super();
		this.account_number = account_number;
		this.ammount_of_money = ammount_of_money;
		this.owner = owner;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public int getAmmount_of_money() {
		return ammount_of_money;
	}

	public void setAmmount_of_money(int ammount_of_money) {
		this.ammount_of_money = ammount_of_money;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Account [account_number=" + account_number + ", ammount_of_money=" + ammount_of_money + ", owner="
				+ owner + ", status=" + status + "]\n";
	}

}
