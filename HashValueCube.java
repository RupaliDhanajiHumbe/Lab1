package B;

import java.util.HashMap;

public class HashValueCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,Integer> number=new HashMap<>();
		
        int Cube=1;
		
		for(int i=1;i<=10;i++)
		{
			Cube=i*i*i;
			number.put(i,Cube);
		}
		
		System.out.println(number.get(5));
		System.out.println(number);
	
	}

}
