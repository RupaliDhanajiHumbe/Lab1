package B;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		HashSet<String> number = new HashSet<>();
        number.add("z");
        number.add("b");
        number.add("c");
        System.out.println(number);
        number.forEach(x->System.out.println(x));
	}

}
