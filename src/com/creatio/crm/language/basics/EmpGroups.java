package com.creatio.crm.language.basics;

public class EmpGroups 
{

	public static void main(String[] args)
	{
		
//two arrays created to store the employee names and and IDs data from Class Employee.
		
		String[] names = new String[3];
		int [] ids = new int[3];
		
//Retrieve the data from the Employees class and store in array
		
		Employees obj = new Employees();
		
		names[0]= obj.EmployeeNames1;
		names[1]= obj.EmployeeNames2;
		names[2]= obj.EmployeeNames3;
		
		ids[0]=obj.Employeeids1;
		
		ids[1]=obj.Employeeids2;
		
		ids[2]=obj.Employeeids3;

// Retrieving data from Employee class and stored in arrays and Print Employee name along with Employee ID		

		System.out.println("Employee Name is :" + names[0]+ "," + "Employee ID is :" + ids[0]);
		System.out.println("Employee Name is :" + names[1]+ "," + "Employee ID is :" + ids[1]);
		System.out.println("Employee Name is :" + names[2]+ "," + "Employee ID is :" + ids[2]);
	}

}


