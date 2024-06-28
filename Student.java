
import java.util.*;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
                   Scanner s=new Scanner(System.in);
	    System.out.println("enter the value of 5 subject");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c=s.nextInt();
	    int d=s.nextInt();
	    int e=s.nextInt();
	    int f=a+b+c+d+e;
	    System.out.println("Addition the 5 subject" +f);
	    if(f>450)
	    {
	       System.out.println("Grade A");
	    }

	}

}

