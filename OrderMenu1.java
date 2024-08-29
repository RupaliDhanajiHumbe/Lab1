package A;

import java.util.Scanner;

public class OrderMenu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

	    String[] burgerOptions = {"Classic Burger", "Cheese Burger", "Veggie Burger"};
	    double[] burgerPrices = {10.99, 12.99, 11.99};
	    String[] pizzaOptions = {"Margherita", "Pepperoni", "Veggie Delight"};
	    double[] pizzaPrices = {14.99, 16.99, 15.99};
	    String[] coffeeOptions = {"Espresso", "Cappuccino", "Latte"};
	    double[] coffeePrices = {2.99, 3.99, 4.99};

	    String order = "";
	    double totalCost = 0.0;

	    while (true) 
	    {
	      System.out.println("Welcome to our cafe! Please select an option:");
	      System.out.println("1. Burgers");
	      System.out.println("2. Pizzas");
	      System.out.println("3. Coffee");
	      System.out.println("4. Exit");

	      int choice = scanner.nextInt();
	      
	      if (choice < 1 || choice > 4) 
	      {
	        System.out.println("Invalid choice. Please try again.");
	        continue;
	      }

	      if (choice == 1) 
	      {
	        System.out.println("Select a burger:");
	        for (int i = 0; i < burgerOptions.length; i++) 
	        {
	          System.out.println((i + 1) + ". " + burgerOptions[i] + " - $" + burgerPrices[i]);
	        }
	        
	        int burgerChoice = scanner.nextInt();
	        if (burgerChoice < 1 || burgerChoice > burgerOptions.length)
	        {
	          System.out.println("Invalid choice. Please try again.");
	          continue;
	        }
	        order += burgerOptions[burgerChoice - 1] + " ";
	        totalCost += burgerPrices[burgerChoice - 1];
	      }
	      else if (choice == 2) 
	      {
	        System.out.println("Select a pizza:");
	        for (int i = 0; i < pizzaOptions.length; i++) 
	        {
	          System.out.println((i + 1) + ". " + pizzaOptions[i] + " - $" + pizzaPrices[i]);
	        }

		 int pizzaChoice = scanner.nextInt();
	        if (pizzaChoice < 1 || pizzaChoice > pizzaOptions.length) 
	        {
	          System.out.println("Invalid choice. Please try again.");
	          continue;
	        }
	        order += pizzaOptions[pizzaChoice - 1] + " ";
	        totalCost += pizzaPrices[pizzaChoice - 1];
	      }
	      else if (choice == 3) 
	      {
	        System.out.println("Select a coffee:");
	        for (int i = 0; i < coffeeOptions.length; i++) 
	        {
	          System.out.println((i + 1) + ". " + coffeeOptions[i] + " - $" + coffeePrices[i]);
	        }
	        int coffeeChoice = scanner.nextInt();
	        if (coffeeChoice < 1 || coffeeChoice > coffeeOptions.length) 
	        {
	          System.out.println("Invalid choice. Please try again.");
	          continue;
	        }
	        order += coffeeOptions[coffeeChoice - 1] + " ";
	        totalCost += coffeePrices[coffeeChoice - 1];
	      }
	      else 
	      {
	        break;
	      }
	    }
	    System.out.println("Your order is: " + order);
	    System.out.println("Total cost: $" + totalCost);
	}

}
