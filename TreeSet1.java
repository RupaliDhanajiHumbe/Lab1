package B;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> number = new TreeSet<>();
        number.add("z");
        number.add("b");
        number.add("c");
        System.out.println(number);
        number.forEach(x->System.out.println(x));
        
        TreeSet<Integer> num = new TreeSet<>();
        num.add(56);
        num.add(34);
        num.add(78);
        num.forEach(x->System.out.println(x));
	}

}
