package main;

import java.util.Scanner;

public class Electricity_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter the amount of KWh units consumed: ");
        int units = scanner.nextInt();

        int bill = 0;

        if (units <= 100)
        {
            bill = units * 10;
            System.out.println("Electricity Bill=" +bill);
        } 
        else if (units > 100 && units<= 200) 
        {
            bill = (100 * 10) + ((units - 100) * 15);
            System.out.println("Electricity Bill=" +bill);
        } 
        else if (units>200 && units <= 300)
        {
            bill = (100 * 10) + (100 * 15) + ((units - 200) * 20);
            System.out.println("Electricity Bill=" +bill);
        }
        else 
        {
            bill = (100 * 10) + (100 * 15) + (100 * 20) + ((units - 300) * 25);
            System.out.println("Electricity Bill=" +bill);
        }

	}

}
