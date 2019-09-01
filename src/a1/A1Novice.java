package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int totalCust = scan.nextInt();
		// Getting the total number of customers from the first input given as an integer
		//System.out.println("totalCust: " + totalCust);
		
		
		
		for (int i = 0; i <= totalCust; i++) {
			// creating  for loop to reuse for as many customers as needed
			
			String firstName = scan.next();
			char firstInital = firstName.charAt(0);
			// Getting the first name of a customer from input and then using that string to get the first initial as a character
			
			//System.out.println("firstName: " + firstName);
			
			String lastName = scan.next();
			// Getting the last name of the customer as a string from the input 
			//System.out.println("lastName: " + lastName);
			
			int items = scan.nextInt();
			// getting the items as an integer from the input
			//System.out.println("items: " + items);
			
			int n = 0;
			
			double total = 0.00;
			
			while ( n < items ) {
				
				int quantity = scan.nextInt();
				// quantity of item bought from input given
				//System.out.println("quantity: " + quantity);
				
				String itemName = scan.next();
				// name of item bought from input given
				//System.out.println("itemName: " + itemName);
				
				double priceItem = scan.nextDouble();
				//System.out.println("priceItem: " + priceItem);
				
				total = total + (quantity * priceItem);
				// updating total with quantity and price of current item.
				//System.out.println("total: " + total);
				
				n++;
				
			}
			
			System.out.println(firstInital + ". " + lastName + ": " + String.format("%.2f",total));
		}
		
		scan.close();
		// close scanner since all input has been parsed
	}
	
}