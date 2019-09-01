package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int totalCust = scan.nextInt();
		// Getting the total number of customers from the first input given as an integer
		
		for (int i = 0; i <= totalCust; i++) {
			// creating  for loop to reuse for as many customers as needed
			
			String firstName = scan.next();
			char firstInital = firstName.charAt(0);
			// Getting the first name of a customer from input and then using that string to get the first initial as a character
			
			String lastName = scan.next();
			// Getting the last name of the customer as a string from the input 
			
			int items = scan.nextInt();
			// getting the items as an integer from the input
			
			int n = 0;
			// Initializing and creating n as a variable for the while loop to follow
			
			double total = 0.00;
			// creating and initializing total as a double to be used later, it is placed here so it goes back to 0 for each customer 
			
			while ( n < items ) {
				// a while loop for the number of items each customer has, it will cycle through and create a total price for their order
				
				int quantity = scan.nextInt();
				// quantity of item bought from input given
				
				String itemName = scan.next();
				// name of item bought from input given
				
				double priceItem = scan.nextDouble();
				// the price of the item from the input given
				
				total = total + (quantity * priceItem);
				// updating total with quantity and price of current item.
				
				n++;
				// incrementing n up so the while loop does not continue and get stuck
				
			}
			
			System.out.println(firstInital + ". " + lastName + ": " + String.format("%.2f",total));
			// printing out the first initial last name and total for each customer, the total is formated so it is a string with two decimal places
		}
		
		scan.close();
		// close scanner since all input has been parsed
	}
	
}