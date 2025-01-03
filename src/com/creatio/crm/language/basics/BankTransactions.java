package com.creatio.crm.language.basics;

import java.util.HashMap;
import java.util.Map;

public class BankTransactions {

	public static void main(String[] args)

	{

//Transaction Details are stored using Map(HashMap) 

		Map<String, String> Credit = new HashMap<String, String>();
		Map<String, String> Debit = new HashMap<String, String>();

		Credit.put("Credit1", "50000");
		Credit.put("Credit2", "3000");
		Credit.put("Credit3", "4000");

		Debit.put("Debit1", "-2000");
		Debit.put("Debit2", "-15000");
		Debit.put("Debit3", "-200");
		Debit.put("Debit4", "-300");
		Debit.put("Debit5", "-3000");

//Print total number of credit and debt transactions completed

		System.out.println("Total No.of Transactions in Credit are :" + Credit.size());
		System.out.println("Total No.of Transactions in Debit are :" + Debit.size());

//Print the total amount credited and debited in account

		int x = 50000;
		int y = 3000;
		int z = 4000;
		int sum = x + y + z;

		System.out.println("The total amount credited : " + sum);

		int Debit1 = -2000;
		int Debit2 = -15000;
		int Debit3 = -200;
		int Debit4 = -300;
		int Debit5 = -3000;

		int Debit6 = Debit1 + Debit2 + Debit3 + Debit4 + Debit5;

		System.out.println("The total amount Debited : " + Debit6);

		int RemainingAmout = sum + Debit6;

		System.out.println("Total amount remaining at the end in Bank Account : " + RemainingAmout);

		// int Transaction = 10000;

		// if (Transaction<=15000)
		// {
		// System.out.println("Suspicious credit Transaction Amount");
		// }

		// else
		// {

		// System.out.println("Non Suspicious credit Transaction Amount");
		// }

		for (int i = 10000; i <= 10005; i++) {
			System.out.println("Suspicious credit Transaction");
			System.out.println(""+i);
		}

	}

}
