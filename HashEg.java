package B;

import java.util.HashMap;
public class HashEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HashMap<String, Integer> number = new HashMap<>();
	        number.put("a", 100);
	        number.put("b", 200);
	        number.put("c", 500);
	        int add=0;
	        for (int num : number.values()) 
	        {
	            add =add+num;
	        }
	        System.out.println("Add all values: " +add);
	}

}
