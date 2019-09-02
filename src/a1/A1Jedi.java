package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int totalItems = scan.nextInt();
		// total amount of items based on first input
		
		String[][] store = new String[totalItems][3];
		// an array to hold all the items in the store
		
		for (int i = 0; i < store.length; i++) {
			// creating a for loop for each item in the store to add it to the array that represents the "store"
			
			String itemName = scan.next();
			double itemPrice = scan.nextDouble();
			// taking the names and prices of the items from the input given
			
			store[i][0] = itemName;
			// name of item
			store[i][1] = "0";
			// how many customers bought the item
			store[i][2] = "0";
			// how many of the item was bought 
			// creating a 2d array to hold data about the items and how many were purchased
		}
		
		int totalCust = scan.nextInt();
		// Getting the total number of customers from the input given as an integer
		
		
		
		for (int i = 0; i < totalCust; i++) {
			// creating  for loop to reuse for as many customers as needed
			
			boolean[] hasPurchasedItem = new boolean[store.length];
			// checks to see if a customer has already bought an item 
			
			String firstName = scan.next();
			char firstInital = firstName.charAt(0);
			// Getting the first name of a customer from input and then using that string to get the first initial as a character
			
			String lastName = scan.next();
			// Getting the last name of the customer as a string from the input 
			
			int items = scan.nextInt();
			// getting the items as an integer from the input
			
			for (int x = 0; x < items; x++) {
				
				int quantity = scan.nextInt();
				String purchasedItemName = scan.next();
				// getting the quantity and name of the item from the input given
				
				 for ( int p = 0; p < store.length; p++) {
					 if (store[p][0].equals(purchasedItemName)) {
						 // searching for name of item in the 0th layer of the array
						 
						 if(!hasPurchasedItem[p]) {
							 // testing to see if they haven't already bought the item
							 
							 store[p][1] =""+ (Integer.parseInt(store[p][1]) + 1);
							// incrementing number of customers that bought this item
							 
							hasPurchasedItem[p] = true;
							// making purchased item true so this doesn't loop infinitely 
						 }
						  
						 store[p][2] =""+ (Integer.parseInt(store[p][2]) + quantity);
						 // adding up the total number of items purchased  
					 }
				 } 	
			}
		}
		
	for ( int j = 0; j < store.length; j++) {
		if (store[j][1].equals("0")) {
			System.out.println("No customers bought " + store[j][0]);
			// this is printed when no customers have bought the item 
		} else {
			System.out.println((store[j][1]) + " customers bought "+ store[j][2] + " " + store[j][0]);
		}
	}
		
	}
}

