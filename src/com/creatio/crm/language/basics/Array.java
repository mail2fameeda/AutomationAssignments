package com.creatio.crm.language.basics;

public class Array
{

	public static void main(String[] args) 
	{
		//Categories and Sub categories 
		
		//String [] mainCategories = {"Grocesories " , "Electronics"};
		//String[] subcategories = {"Beverages","Snacks","Dairy Prodcuts","Produce"};
		
		
		//Define a 3D array to store products 
		
		String[][][] supermarket = new String [2][4][5];
		

		/* These items are Beverages Category		 */
		
		supermarket[0][0][0] = "Cola";
		supermarket[0][0][1] = "OrangeJuice";
		supermarket[0][0][2] = "Lemonade";
		supermarket[0][0][3] = "Green Tea";
		supermarket[0][0][4] = "Black Coffee";
		
		/* These items are chips Category		 */
		
		supermarket[0][1][0] = "Popcorn";
		supermarket[0][1][1] = "Trail Mix";
		supermarket[1][1][2] = "Beef Jerky";
		supermarket[0][1][3] = " Salted Nuts";
		supermarket[0][1][4] = "Rice Cakes";
		

		/* These items are Dairy Products Category		 */
		supermarket[0][2][0] = "Cottage Cheese";
		supermarket[0][2][1] = "Heavy Cream";
		supermarket[0][2][2] = "Ice Cream";
		supermarket[0][2][3] = "Parmesan Cheese";
		supermarket[0][2][4] = "Eggnog";
		

		/* These items are Produce Category		 */
		supermarket[0][3][0] = "Apples";
		supermarket[0][3][1] = "Bananas";
		supermarket[0][3][2] = "Carrots";
		supermarket[0][3][3] = "Potatoes";
		supermarket[0][3][4] = "Onions";
		

		/* These items are Electronics		 */
		
		supermarket[1][0][0] = "Cola";
		supermarket[1][0][1] = "Orange Juice";
		supermarket[1][0][2] = "Lemonade";
		supermarket[1][0][3] = "Green Tea";
		supermarket[1][0][4] = "Black Coffee";
		
		supermarket[1][1][0] = "Popcorn";
		supermarket[1][1][1] = "Trail Mix";
		supermarket[1][1][2] = "Rice Cakes";
		supermarket[1][1][3] = "Beef Jerky";
		supermarket[1][1][4] = "Salted Nuts";
		
		supermarket[1][2][0] = "Cottage Cheese";
		supermarket[1][2][1] = "Heavy Cream";
		supermarket[1][2][2] = "Ice Cream";
		supermarket[1][2][3] = "Parmesan Cheese";
		supermarket[1][2][4] = "Eggnog";
		
		supermarket[1][3][0] = "Apples";
		supermarket[1][3][1] = "Bananas";
		supermarket[1][3][2] = "Carrots";
		supermarket[1][3][3] = "Potatoes";
		supermarket[1][3][4] = "Onions";
		
		System.out.println(supermarket[0][2][4]);
		System.out.println(supermarket[1][3][4]);
		
		
		
	
	}

}
