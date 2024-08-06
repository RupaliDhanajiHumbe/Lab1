package B;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> member =new ArrayList<>();
		member.add("Magician");
		member.add("assistant");
		member.remove("Magician");
		member.add("Rupali");
		member.add("Rupa..");
		member.add("Varsha");
		member.remove(2);
		
		//member.remove(s->s.startsWith("M"));
		System.out.println(member);
		
		//OR
		
		List<Integer> arr=new ArrayList<>();
		arr.add(14);
		arr.add(7);
		arr.add(2);
		arr.add(20);
		arr.add(17);
		
		arr.replaceAll(num->num*num);
		System.out.println(arr);
		
		    //OR
		
		arr.removeIf(x->(x%2!=0));
		System.out.println("odd number="+arr);	
			 
	              //OR
		
	arr.forEach(a->
	{
		if(a%2==0)
		{
		System.out.println("even number="+a);	
		}
	});
	
	
  }
}