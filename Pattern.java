package main;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        for(int i=0; i<6; i++)
		        {
		          for(int j=5;j>i; j--)
		          {
		            System.out.print(j+" ");
		        }
		        for(int j=i+1;j<=5; j++)
		        {
		            System.out.print(j+" ");
		        }
		        System.out.println();
		       }
	}

}
