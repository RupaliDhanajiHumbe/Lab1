package A;

import java.util.HashMap;

public class HashMapValSqu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,Integer> number=new HashMap<>();
		
		int Square=1;
		
		for(int i=1;i<=15;i++)
		{
			Square=i*i;
			number.put(i,Square);
		}
		 
		System.out.println(number);
	}

}