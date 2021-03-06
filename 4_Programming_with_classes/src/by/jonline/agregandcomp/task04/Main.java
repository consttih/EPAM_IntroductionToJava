package by.jonline.agregandcomp.task04;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Account ivanov = new Account("PB12345543", 12000, "Ivanov Ivan");
		Account ivanov2 = new Account("PB12345544", -100, "Ivanov Ivan");
		Account ivanov3 = new Account("PB12345545", -30, "Ivanov Ivan");
		Account ivanov4 = new Account("PB12345546", 386, "Ivanov Ivan");
		Account ivanov5 = new Account("PB12345547", 0, "Ivanov Ivan");
		Account sidarov = new Account("PI12345530", -100, "Sidarov Nikolay");
		Account sidarov2 = new Account("PI12345531", 560, "Sidarov Nikolay");
		
		
		Account[] bebank = new Account[] {ivanov, ivanov2, ivanov3, ivanov4, ivanov5, sidarov, sidarov2};
		Bank belbank = new Bank("Belbank", bebank);
		
		
		System.out.println(ivanov5.getStatus());
		belbank.blocking(ivanov5);
		System.out.println(ivanov5.getStatus());
		belbank.unblocking(ivanov5);
		System.out.println(ivanov5.getStatus());
		belbank.blocking(ivanov5);
		System.out.println();
		
		Account[] of_Ivanov = belbank.accountOfOwner("ivanov");
		
		System.out.println(Arrays.toString(of_Ivanov));
		System.out.println();
		
		System.out.println(Arrays.toString(belbank.sortedMoney(of_Ivanov)));
		System.out.println();
		
		belbank.totalAmount(of_Ivanov);
		System.out.println();
		
		belbank.sortedTotalAmount(of_Ivanov);
		
		

	}

}
