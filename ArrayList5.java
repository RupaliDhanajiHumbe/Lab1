package B;
import java.util.List;
import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lang=new ArrayList<>();
		 
		lang.add("java");
		lang.add("R");
		lang.add("Python");
		lang.add("java Script");
		lang.add(" ");
		lang.add("c");
		
		lang.forEach(a->
		{
			System.out.println("language="+a);	
		});
		
	}
}