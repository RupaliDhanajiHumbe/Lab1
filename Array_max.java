package main;

public class Array_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number= {20,45,67,34,76,54,86};
		int max=number[0];
		for(int i=0;i<number.length;i++)
		{
			if(number[i]>max)
			{
				max=number[i];
			}
		}
		System.out.println("Maximun number="+max);
		
		
	}

}
