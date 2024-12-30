package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class Listofthetop5 
{

	public static void main(String[] args) 
	
{
		
// Create an Array List to store the data of Top 5 most populated countries

		List<String> Top5Countries = new ArrayList<String>();
		
		Top5Countries.add("India");
		Top5Countries.add("China");
		Top5Countries.add("United States");
		Top5Countries.add("Indonesia");
		Top5Countries.add("Pakistan");
		
		System.out.println("Total values in the List:"+Top5Countries.size() + "\n");
		
		System.out.println("Top 5 most populated countries in the world are :"+Top5Countries +"\n");

//Print 2nd country from the list by using get method with index  
		
		System.out.println("Print 2nd Country from the List : " + " " +Top5Countries.get(1));
		
}

}
