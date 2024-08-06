package B;

class Collec<T>
{
	T value;
	public void display()
	{
		System.out.println(value.getClass().getName());
	}
}

public class Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Collec <Integer> obj=new Collec();
		obj.value=10;
		obj.display();
		
		Collec <String> obj1=new Collec();
		obj1.value="10";
		obj1.display();
		
		Collec <Character> obj2=new Collec();
		obj2.value='c';
		obj2.display();
	}

}
