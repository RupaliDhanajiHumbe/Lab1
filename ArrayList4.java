package B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arr=new ArrayList<>();

		arr.add("Rahul");
		arr.add("Varsha");
		arr.add("Asha");
		arr.add("Anu"); 
		arr.add("Rupaa.."); 
		
		Collections.sort(arr);
		arr.forEach(System.out::println);
		
		//OR
		
		List<Integer> arr1=new ArrayList<>();
		arr1.add(14);
		arr1.add(7);
		arr1.add(2);
		arr1.add(20);
		arr1.add(17);
		
		Collections.sort(arr1);
		arr1.forEach(x->System.out.println(x));
	}

}
