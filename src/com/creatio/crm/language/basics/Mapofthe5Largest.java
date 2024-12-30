package com.creatio.crm.language.basics;

import java.util.HashMap;
import java.util.Map;

public class Mapofthe5Largest 
{

	public static void main(String[] args) 
	
{
		
//Details of Largest Cities in United States are stored using Map(HashMap) 	
		
		Map<String,String> LargestcityHashMap = new HashMap<String,String>();
		LargestcityHashMap.put("New York City","8,804,190");
		LargestcityHashMap.put("Los Angeles","3,898,747");
		LargestcityHashMap.put("Chicago","2,746,388");
		LargestcityHashMap.put("Houston","2,304,580");
		LargestcityHashMap.put("Phoenix","1,608,139");
		
		System.out.println("Total Values in HashMap are :"+LargestcityHashMap.size());
		System.out.println("5 largest cities in the United States and their populations are : "+LargestcityHashMap);
	
}

}
