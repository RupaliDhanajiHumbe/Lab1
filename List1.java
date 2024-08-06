package B;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> Arr1=new ArrayList<>();  //Generic Class
		Arr1.add(2);
		Arr1.add(3);
		Arr1.add(4);
		Arr1.add(5);
	
		for(int num: Arr1)
		{
			System.out.println(num);
		}
		
		
		
		ArrayList Arr2=new ArrayList<>();  
		Arr2.add("rupali");
		Arr2.add(3);
		Arr2.add("Hi..");
		Arr2.add(5);
		
		String str=(String)Arr2.get(0);
		System.out.println(str);
	}

}
