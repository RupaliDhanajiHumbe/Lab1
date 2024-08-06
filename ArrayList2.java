package B;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arr=new ArrayList<>();

		arr.add("Rahul");
		arr.add(0,"Varsha");
		arr.add(1,"Asha");
		arr.add(0,"Anu"); 
		arr.add(1,"Rupaa.."); 
		arr.remove("Rupali"); 
		arr.remove("Asha"); 
		arr.remove(0);
		
		System.out.println(arr);        //print all element
		
		arr.forEach(x->System.out.println(x));
		System.out.println("\n");
		
		//OR 
		
		List<Integer> arr1=new ArrayList<>();
		arr1.add(14);
		arr1.add(7);
		arr1.set(1,2);
		arr1.add(20);
		arr1.add(17);                   
		
		arr1.forEach(a->
		{
			System.out.println("Number="+a);	
		});
	
		
		//OR
		
		ArrayList<String> arr2=Arrays.asList("Rupa","Ram","Rahul");
        
		arr2.forEach(b->System.out.println(b));             //1.way iterate
		
		arr2.forEach(System.out::println);                     //2nd way iterate
		
		for(String num:arr2)                                 //3nd way iterate
		{
			System.out.println(num);
		}
		
	}

}