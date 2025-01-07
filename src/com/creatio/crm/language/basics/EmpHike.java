package com.creatio.crm.language.basics;

public class EmpHike {

	public static void main(String[] args)

	{

		double Hike;
		double Hikepercentage;
		double YearEndRating=1;
		int Bonus;
		int Experience = 0;
		int Salary=1000;
		String EmployeeName="Alice Johnson";
		{
		if (YearEndRating >= 5 && Experience <= 5 && Salary>=0)	;

		Salary=75000;
		Bonus = 1500;
		Hike = (Salary * 15 / 100) + Bonus;
		System.out.println("Hike is " + Hike+"\n");
		Hikepercentage = (Hike / Salary)*100;
		System.out.println("EmployeeName is :" +EmployeeName+"\n");
		System.out.println("HikePercentagevalue is :"+Hikepercentage);

	}

	}
}
