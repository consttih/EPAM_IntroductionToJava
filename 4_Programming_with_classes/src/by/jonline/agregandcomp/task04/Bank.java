package by.jonline.agregandcomp.task04;

import java.util.Arrays;

public class Bank {

	private Account[] accounts;
	private String name;

	public Bank(String name, Account[] accounts) {
		super();
		this.accounts = accounts;
		this.name = name;
	}

	public Account[] accountOfOwner(String name) {
		
		System.out.println("Accounts of " + name + ":");
		
		int sch = 0;
		
		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i].getOwner().toUpperCase().contains(name.toUpperCase()) == true) {
				sch += 1;

			}
		}

		Account[] ofOwner = new Account[sch];
		
		sch = 0;

		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i].getOwner().toUpperCase().contains(name.toUpperCase()) == true) {

				ofOwner[sch] = accounts[i];
				sch += 1;

			}
		}

		return ofOwner;
	}
	

	public void blocking(Account acc) {
		acc.setStatus("blocked");
	}

	public void unblocking(Account acc) {
		acc.setStatus("unblocked");
	}

	public Account[] sortedMoney(Account[] nameAcc) {
		
		System.out.println("Sorted by amount of money accounts of " + nameAcc[0].getOwner() + ":");

		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;

			for (int i = 1; i < nameAcc.length; i++) {

				if (nameAcc[i].getAmmount_of_money() > nameAcc[i - 1].getAmmount_of_money()) {

					Account tsc = nameAcc[i];
					nameAcc[i] = nameAcc[i - 1];
					nameAcc[i - 1] = tsc;

					needIteration = true;
				}
			}
		}

		return nameAcc;
	}

	public void totalAmount(Account[] accounts) {

		int summa = 0;

		for (int i = 0; i < accounts.length; i++) {

			summa += accounts[i].getAmmount_of_money();
		}

		System.out.println("Total amount of money from all bank accounts of " + accounts[0].getOwner() + " is " + summa);
	}

	public void sortedTotalAmount(Account[] accounts) {

		int summa_plus = 0;
		int summa_minus = 0;

		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i].getAmmount_of_money() < 0) {
				summa_minus += accounts[i].getAmmount_of_money();
			} else {
				summa_plus += accounts[i].getAmmount_of_money();
			}
		}

		System.out.println("Total amount of money from all bank accounts with positive balance of "
				+ accounts[0].getOwner() + " is " + summa_plus);
		System.out.println("Total amount of money from all bank accounts with negative balance of "
				+ accounts[0].getOwner() + " is " + summa_minus);

	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bank [accounts=" + Arrays.toString(accounts) + "]";
	}

}
