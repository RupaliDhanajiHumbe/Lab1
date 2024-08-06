package B;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr=new ArrayList<>();
		arr.add(14);
		arr.add(7);
		arr.set(1,2);
		arr.add(20);
		arr.add(17);
		
		
		arr.forEach(x->
		{
			if(x%2!=0)
			{
			System.out.println("odd number="+x);	
			}
		});
	}
}