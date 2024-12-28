package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsFramework {

	public static void main(String[] args) 
	{
		
//Student Details are stored using Map(HashMap) 
		
		Map<String,String> StudentMap1 = new HashMap <String,String>();
		Map<String,String >StudentMap2 = new HashMap<String,String>();
		Map<String,String >StudentMap3 = new HashMap<String,String>();
		
		StudentMap1.put("Name","John Doe");
		StudentMap1.put("Name","Jhon Doe");
		StudentMap1.put("Age","20");
		StudentMap1.put("Gender","Male");
		StudentMap1.put("Roll Number","S12345");
		StudentMap1.put("Grade","A");
		StudentMap1.put("Major","Computer Science");
		StudentMap1.put("GPA","3.8");
		StudentMap1.put("Email","john@example.com");
		StudentMap1.put("Contact Number","9999997777");
		StudentMap1.put("Address","123 Elm St");
		System.out.println("Total Values in StudentMap1 are :"+StudentMap1.size());
		System.out.println("Student 1 details :"+StudentMap1);
		
		
		StudentMap2.put("Name","Jane Smith");
		StudentMap2.put("Age","21");
		StudentMap2.put("Gender","Female");
		StudentMap2.put("Roll Number","S12346");
		StudentMap2.put("Grade","B");
		StudentMap2.put("Major","Mathematics");
		StudentMap2.put("GPA","3.5");
		StudentMap2.put("Email","jane@example.com");
		StudentMap2.put("Contact Number","9876665666");
		StudentMap2.put("Address","456 Oak St");
		System.out.println("Total Values in StudentMap2 are :"+StudentMap2.size());
		System.out.println("Student 2 details :"+StudentMap2);
		
		
		StudentMap3.put("Name","Mike Brown");
		StudentMap3.put("Age","22");
		StudentMap3.put("Gender","Male");
		StudentMap3.put("Roll Number","S12347");
		StudentMap3.put("Grade","A");
		StudentMap3.put("Major","Physics");
		StudentMap3.put("GPA","3.9");
		StudentMap3.put("Email","mike@example.com");
		StudentMap3.put("Contact Number","8787876546");
		StudentMap3.put("Address","789 Pine St");
		System.out.println("Total Values in StudentMap3 are :"+StudentMap3.size());
		System.out.println("Student 3 details :"+StudentMap3);
		
//Employee Details are stored using Map(HashMap) 
		
		Map<String,String> EmployeeMap1 = new HashMap <String,String>();
		Map<String,String >EmployeeMap2 = new HashMap<String,String>();
		Map<String,String >EmployeeMap3 = new HashMap<String,String>();
		
		EmployeeMap1.put("Employee ID","E001");
		EmployeeMap1.put("Name","Alice Green");
		EmployeeMap1.put("Age","30");
		EmployeeMap1.put("Gender","Female");
		EmployeeMap1.put("Department","Engineering");
		EmployeeMap1.put("Position","Software Engineer");
		EmployeeMap1.put("Salary","75,000");
		EmployeeMap1.put("Email","alice@example.com");
		EmployeeMap1.put("Contact Number","9876543213");
		System.out.println("Total Values in EmployeeMap1 are :"+EmployeeMap1.size());
		System.out.println("Employee 1 details :"+EmployeeMap1);
		
		
		EmployeeMap2.put("Employee ID","E002");
		EmployeeMap2.put("Name","Bob Johnson");
		EmployeeMap2.put("Age","35");
		EmployeeMap2.put("Gender","Male");
		EmployeeMap2.put("Department","Marketing");
		EmployeeMap2.put("Position","Marketing Manager");
		EmployeeMap2.put("Salary","85,000");
		EmployeeMap2.put("Email","bob@example.com");
		EmployeeMap2.put("Contact Number","9876543214");
		System.out.println("Total Values in EmployeeMap2 are :"+EmployeeMap2.size());
		System.out.println("Employee 2 details :"+EmployeeMap2);
		
		
		EmployeeMap3.put("Employee ID","E003");
		EmployeeMap3.put("Name","Carol White");
		EmployeeMap3.put("Age","28");
		EmployeeMap3.put("Gender","Female");
		EmployeeMap3.put("Department","Sales");
		EmployeeMap3.put("Position","Sales Executive");
		EmployeeMap3.put("Salary","65,000");
		EmployeeMap3.put("Email","carol@example.com");
		EmployeeMap3.put("Contact Number","9876543215");
		System.out.println("Total Values in EmployeeMap3 are :"+EmployeeMap3.size());
		System.out.println("Employee 3 details :"+EmployeeMap3);
		
	//Product Details are stored using Map(HashMap) 
		
		Map<String,String> ProductMap1 = new HashMap <String,String>();
		Map<String,String >ProductMap2 = new HashMap<String,String>();
		Map<String,String >ProductMap3 = new HashMap<String,String>();
		
		ProductMap1.put("Product ID","P001");
		ProductMap1.put("Name","Laptop");
		ProductMap1.put("Category","Electronics");
		ProductMap1.put("Price","$1,200");
		ProductMap1.put("Stock Quantity","50");
		ProductMap1.put("Supplier","Tech Supplies");
		ProductMap1.put("Warranty","2 years");
		ProductMap1.put("Rating","4.5");
		ProductMap1.put("Manufacturing Date","15-01-2023");
		ProductMap1.put("Expiry Date","15-01-2025");
		System.out.println("Total Values in ProductMap1 are :"+ProductMap1.size());
		System.out.println("Product 1 details :"+ProductMap1);
		
		ProductMap2.put("Product ID","P002");
		ProductMap2.put("Name","Desk Chair");
		ProductMap2.put("Category","Furniture");
		ProductMap2.put("Price","$150");
		ProductMap2.put("Stock Quantity","200");
		ProductMap2.put("Supplier","Office Depot");
		ProductMap2.put("Warranty","1 year");
		ProductMap2.put("Rating","4");
		ProductMap2.put("Manufacturing Date","10-02-2023");
		ProductMap2.put("Expiry Date","N/A");
		System.out.println("Total Values in ProductMap2 are :"+ProductMap2.size());
		System.out.println("Product 2 details :"+ProductMap2);
		
		
		ProductMap3.put("Product ID","P003");
		ProductMap3.put("Name","Coffee Maker");
		ProductMap3.put("Category","Kitchen");
		ProductMap3.put("Price","$75");
		ProductMap3.put("Stock Quantity","100");
		ProductMap3.put("Supplier","KitchenWorld");
		ProductMap3.put("Warranty","6 months");
		ProductMap3.put("Rating","4.2");
		ProductMap3.put("Manufacturing Date","20-03-2023");
		ProductMap3.put("Expiry Date","20-03-2024");
		System.out.println("Total Values in ProductMap3 are :"+ProductMap3.size());
		System.out.println("Product 3 details :"+ProductMap3);
		
//Create a List to Store all the Student data
		
		List<Map<String,String >> StudentList = new ArrayList<Map<String,String >>();
		StudentList.add(StudentMap1);
		StudentList.add(StudentMap2);
		StudentList.add(StudentMap3);
		System.out.println("Student List :"+StudentList);
		
//Create a List to Store all the Employee data
		
		List<Map<String,String >> EmployeeList = new ArrayList<Map<String,String >>();
		EmployeeList.add(EmployeeMap1);
		EmployeeList.add(EmployeeMap1);
		EmployeeList.add(EmployeeMap1);
		System.out.println("Employee List :"+EmployeeList);
		
//Create a List to Store all the Product data
	
		List<Map<String,String >> ProductList = new ArrayList<Map<String,String >>();
		ProductList.add(ProductMap1);
		ProductList.add(ProductMap2);
		ProductList.add(ProductMap3);
		System.out.println("Product List :"+ProductList);
	
	
// Store all the Student data , Employee Data and Product Data by using Map->HashMap
		
		Map<String,List<Map<String,String >>> data = new HashMap<String,List<Map<String,String >>>();
		data.put("StudentData", StudentList);
		data.put("Employee Data",EmployeeList);
		data.put("ProductData",ProductList);
		
//Print the Supplier name from Product Data 
		
System.out.println("Name of the Supplier from Product Details is : " + data.get("ProductData").get(1).get("Supplier"));
		
	}
	

}
