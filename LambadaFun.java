package B;


interface Addable
{
	void add(int a,int b);
}
public class LambadaFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addable addable=(x,y)->
		{
			System.out.println(x+y);
			
		};
		addable.add(5, 6);
	}

}
