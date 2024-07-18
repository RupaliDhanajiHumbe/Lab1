package main;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="Java is a programming language";
		String num="12#34#56#67#89";
		String[] arr=text.split(" ");
		
		System.out.println(arr[3]);
		
		String[] arr1=num.split("#");
		
		for(String name:arr)
		{
			System.out.println(name);
		}
	}

}
