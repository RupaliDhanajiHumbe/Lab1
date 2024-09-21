package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSqu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>number=Arrays.asList(2,5,7,4);
		System.out.println(number.stream().map(x->x*2).reduce(0, (res,x)->res+x));
		List<Integer>cube=number.stream().map(x->x*x*x)
								.collect(Collectors.toList());
		
		cube.forEach(num->System.out.println(num));
	}
}
