package B;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Long> ContactNumber=new HashMap<>();
		ContactNumber.put("Rupali",8756453478L);
		ContactNumber.put("Abhiji",9756453478L);
		ContactNumber.put("Shubham",7756453478L);
		ContactNumber.put("Rahul",6756453478L);
        ContactNumber.remove("Abhiji");
		
		System.out.println(ContactNumber.get("Rupali"));
		
		for(String s:ContactNumber.keySet())
		{
		System.out.println(s+" "+ContactNumber.get(s));
		}
		
	}

}
