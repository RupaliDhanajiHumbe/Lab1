package main;

public class arrayindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{10,20,30,40},{50,60,70,80},{90,100,110,120}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+",");
			}
			System.out.println();
			}
		System.out.println("index of 20="+a[0][1]+" ");
	    System.out.print("index of 120="+a[2][3]);
	}

}
