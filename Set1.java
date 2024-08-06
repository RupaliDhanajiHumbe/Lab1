package B;

import java.util.Set;
import java.util.TreeSet;
public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> Arr1=new TreeSet<>();  //Generic Class
		Arr1.add(12);
		Arr1.add(31);
		Arr1.add(41);
		Arr1.add(25);
	
		Arr1.forEach(num ->System.out.println(num));
		}
	}