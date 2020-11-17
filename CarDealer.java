package TestRun;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CarDealer {

	public static void main(String[] args) {
		
		HashMap<String, String> carsForSale = new HashMap<String, String>();
		
		carsForSale.put("Accord", "Honda");
		carsForSale.put("Odyssey", "Honda");
		carsForSale.put("Focus", "Ford");
		carsForSale.put("F150", "Ford");
		carsForSale.put("Wrangler", "Jeep");
		carsForSale.put("4Runner", "Toyota");
		carsForSale.put("Tundra", "Toyota");
		carsForSale.put("X5", "BMW");
		carsForSale.put("Quattro", "Audi");
		carsForSale.put("Tahoe", "Chevrolet");
		carsForSale.put("Maxima", "Nissan");
		carsForSale.put("Altima", "Nissan");
		carsForSale.put("MDX", "Acura");
		

		Scanner userInput = new Scanner(System.in);
		 System.out.println("Which model car are you looking for? ");
		 String name = userInput.nextLine();	
		 
		 if (carsForSale.get(name) != null) {
			 System.out.println("You're looking for a " + name + "? We have those. Let me show you our " + carsForSale.get(name) + " selection right over here!");
	        	
	        }else {
	        	System.out.println("Sorry, we don't have any right now.");
	        	}
}
}

//You are a car dealer. Create a hash map of vehicles.
//The model is the Key, the make is the Value.
//Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
//(e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
