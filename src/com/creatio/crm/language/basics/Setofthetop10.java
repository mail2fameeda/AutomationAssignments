package com.creatio.crm.language.basics;

import java.util.Set;
import java.util.TreeSet;

public class Setofthetop10 
{

	public static void main(String[] args) 
	
{
		
// Store the data of Top 10 Attractions by using Set-->Tree Set 		
		
		Set <String> Top10Attractions=new TreeSet<String>(); 
		
		Top10Attractions.add("Burj Khalifa");
		Top10Attractions.add("Great Wall of China");
		Top10Attractions.add("Machu Picchu");
		Top10Attractions.add("Taj Mahal");
		Top10Attractions.add("Eiffel Tower");
		Top10Attractions.add("Christ the Redeemer");
		Top10Attractions.add("Fushimi Inari-taisha Shrine");
		Top10Attractions.add("Petra");
		Top10Attractions.add("Iguazu Falls");
		Top10Attractions.add("Chichen Itza");
		
		
// Print the size of the Tree set collection 
		
		System.out.println("Size of the Treeset is :" + " " +Top10Attractions.size());
		
//Print the list of values in the Tree set 
		
		System.out.println("Total values in Tree set are : " +Top10Attractions);
}

}
