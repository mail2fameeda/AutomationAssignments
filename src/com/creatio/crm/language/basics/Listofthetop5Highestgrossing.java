package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class Listofthetop5Highestgrossing 

{

	public static void main(String[] args) 
{

// Create an Array List to store the data of Top 5 Highest grossing movies

				List<String> Top5Movies = new ArrayList<String>();
				
				Top5Movies.add("Baahubali");
				Top5Movies.add("KGF");
				Top5Movies.add("RRR");
				Top5Movies.add("Pushpa");
				Top5Movies.add("Animal");
				
	System.out.println("Total values in the List:"+Top5Movies.size() + "\n");
				
				
//Print 3rd Movie from the list by using get method with index 

	System.out.println("Print 3rd Movie from the List : " + " " +Top5Movies.get(2));	


}

}
