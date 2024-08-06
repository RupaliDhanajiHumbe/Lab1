package B;

import java.util.HashSet;
import java.util.Set;


public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> arr=new HashSet<>();
		arr.add("Asmita");
		arr.add("ram");
		arr.add("Rahul");
		arr.add("Shita");
		arr.forEach(x->System.out.println(x.toUpperCase()));
		
	}

}
