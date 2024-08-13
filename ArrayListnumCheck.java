package B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListnumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> number=new ArrayList<>(Arrays.asList(12,34,56,34,23));
		 
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the number:");
		
		 int numbers=s.nextInt();
		 if(number.contains(numbers))
		 {
			System.out.println("number is available"); 
		 }
	
	}
}