package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class Assignment6 {

	public static void main(String[] args)

	{
		List<Integer> Transactions = new ArrayList<Integer>();

		Transactions.add(5000);
		Transactions.add(-2000);
		Transactions.add(3000);
		Transactions.add(-15000);
		Transactions.add(-200);
		Transactions.add(-300);
		Transactions.add(4000);
		Transactions.add(-3000);

		// Print total number of Credit and Debit transactions

		int creditTrans = 0;
		int DebitTrans = 0;

		for (int i : Transactions)

			if (i > 0) {
				creditTrans++;
			} else

			{
				DebitTrans++;
			}

		System.out.println("Total No.of Credit Transactions completed :" + creditTrans+"\n");

		System.out.println("Total No.of Debit Transactions completed :" + DebitTrans+"\n");

		// Print the total amount credited and debited in account

		int CreditedAmount = 0;
		int DebitedAmount = 0;

		for (int i : Transactions) {
			if (i > 0) {
				CreditedAmount = i + CreditedAmount;
			} else {
				DebitedAmount = i + DebitedAmount;
			}
		}

		System.out.println("Total Amount Creditd :" + CreditedAmount+"\n");
		System.out.println("Total Amount Debited : " + DebitedAmount+"\n");

		// Print total amount remaining at the end in Bank Account

		int RemainAmount = CreditedAmount + DebitedAmount;

		System.out.println("Total amount remaining :" + RemainAmount+"\n");

		// Print total number of suspicious transactions
		
		int SuspTrans=0;
		
		for(int i:Transactions)
		{
			if (i>10000 || i<(-10000))
			{
				SuspTrans++;
				
				System.out.println("Suspicious Credit and Debit Tranasaction with amount" +i);
			}
		
			System.out.println("Total number of suspicious transactions :" +SuspTrans);
		}
		
	}

}
