package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int totalItems = scan.nextInt();
		// total amount of items based on first input
		
		String[][] store = new String[totalItems][2];
		// an array to hold all the items in the store
		
		for (int i = 0; i < store.length; i++) {
			// creating a for loop for each item in the store to add it to the array that represents the "store"
			
			String itemName = scan.next();
			double itemPrice = scan.nextDouble();
			// taking the names and prices of the items from the input given
			
			store[i][0] = itemName;
			store[i][1] = ""+itemPrice;
		}
		
		int totalCust = scan.nextInt();
		// Getting the total number of customers from the input given as an integer
		
		double max = 0;
		String maxName = null;
		// creating a placeholder for max and name of max customer
		
		double min = 100000;
		String minName = null;
		// creating a placeholder for min and name of min customer 
		
		double avg = 0;
		// creating placeholder for average
		
		
		for (int i = 0; i < totalCust; i++) {
			// creating  for loop to reuse for as many customers as needed
			
			String firstName = scan.next();
			char firstInital = firstName.charAt(0);
			// Getting the first name of a customer from input and then using that string to get the first initial as a character
			
			String lastName = scan.next();
			// Getting the last name of the customer as a string from the input 
			
			int items = scan.nextInt();
			// getting the items as an integer from the input
			
			double sum = 0;
			// Initializing the sum as a double and placing it before the for loop so it will reset the sum 
			
			for (int x = 0; x < items; x++) {
				
				int quantity = scan.nextInt();
				String purchasedItemName = scan.next();
				// getting the quantity and name of the item from the input given
				
				double price = 0;
				// Initializing a double to serve as the price for the item we are working on in the for loop
				
				 for ( int p = 0; p < store.length; p++) {
					 if (store[p][0].equals(purchasedItemName)) {
						 price = Double.parseDouble(store[p][1]) * quantity;
						 // creating the price from an nested if statement in a for loop 	 
					 }
				 } 
				sum += price;
				// adding the price to the sum variable for every item for the customer
			}
			
			if(sum > max) {
				max = sum;
				maxName = firstName + " " + lastName;
				// finding the max by seeing if the sum is more then the value currently held in max
			}
			
			if(sum < min) {
				min = sum;
				minName = firstName + " " + lastName;
				// finding min by seeing if the sum is less then the value held in min 
			}
			avg += sum;
			// adding avg placeholder to current sum 
		}
		
		avg /= totalCust;
		// dividing sum by total customers to find the actual average 
		
		System.out.println("Biggest: " + maxName + " (" + String.format("%.2f",max) + ")");
		System.out.println("Smallest: " + minName + " (" + String.format("%.2f",min) + ")");
		System.out.println("Average: " + String.format("%.2f",avg)); 
		// printing out all of the largest, smallest, and average and formating numbers to two decimal places 
		
	}
}
