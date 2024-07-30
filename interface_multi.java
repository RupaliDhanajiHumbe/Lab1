package main;

interface multiplication
{
	int multi(int a,int b);
}
public class interface_multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		multiplication m1=(p,q)->p*q;
		System.out.println(m1.multi(10,3));
	}

}
