package B;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collection;
public class ArrayLSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> number=new ArrayList<>();
		 
		 System.out.println("Enter the number up to user enter 0 number");
		 Scanner s=new Scanner(System.in);
		 int num=s.nextInt();
		 int sum=0;
		 while(num!=0)
		 {
			number.add(num); 
			sum=sum+num;
		    num=s.nextInt();
		 }
		 
		number.forEach(x->System.out.println(x));
		System.out.println("Sum of ArrayList="+sum);
	}

}
