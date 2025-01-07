package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment8 {

	public static void main(String[] args) 
	
	{

//Employee Details are stored using Map(HashMap) 

		Map<String,String> Emp1 = new HashMap <String,String>();
		Map<String,String >Emp2 = new HashMap<String,String>();
		Map<String,String >Emp3 = new HashMap<String,String>();
		Map<String,String >Emp4 = new HashMap<String,String>();
		Map<String,String >Emp5 = new HashMap<String,String>();
		
		
		Map<String,String >Hike1 = new HashMap<String,String>();
		Map<String,String >Hike2 = new HashMap<String,String>();
		Map<String,String >Hike3 = new HashMap<String,String>();
		
		Emp1.put("Name","Alice Johnson");
		Emp1.put("Base Salary","75000");
		Emp1.put("Experience(Years)","5");
		Emp1.put("Year-End Rating (Out of 5)","4.2");
		

		Emp2.put("Name","Bob Smith");
		Emp2.put("Base Salary","68000");
		Emp2.put("Experience(Years)","3");
		Emp2.put("Year-End Rating (Out of 5)","3.8");
		
		

		Emp3.put("Name","Carol Davis");
		Emp3.put("Base Salary","82000");
		Emp3.put("Experience(Years)","7");
		Emp3.put("Year-End Rating (Out of 5)","4.5");
		

		Emp4.put("Name","David Brown");
		Emp4.put("Base Salary","90000");
		Emp4.put("Experience(Years)","10");
		Emp4.put("Year-End Rating (Out of 5)","2");
		
		

		Emp5.put("Name","Eva Green");
		Emp5.put("Base Salary","60000");
		Emp5.put("Experience(Years)","2");
		Emp5.put("Year-End Rating (Out of 5)","3.5");
			
		
		Hike1.put("Rating","> =4");
		Hike1.put("% of base Salary as variable pay","15");
		Hike1.put("Bonus","1500");
		
		Hike2.put("Rating",">=3 && < 4");
		Hike2.put("% of base Salary as variable pay","10");
		Hike2.put("Bonus","1200");
		
		Hike3.put("Rating","< 3");
		Hike3.put("% of base Salary as variable pay","3");
		Hike3.put("Bonus","300");
		
		List<Map<String,String >> EmpList = new ArrayList<Map<String,String >>();
		EmpList.add(Emp1);
		EmpList.add(Emp2);
		EmpList.add(Emp3);
		EmpList.add(Emp4);
		EmpList.add(Emp5);
		System.out.println("Employee Details :"+EmpList + "\n");
		
		
		List<Map<String,String >> Hikepercentage = new ArrayList<Map<String,String >>();
		Hikepercentage.add(Hike1);
		Hikepercentage.add(Hike2);
		Hikepercentage.add(Hike3);
		
		System.out.println("Hikepercentage Details :"+Hikepercentage +"\n");
		
		
					
	
	}

}
