package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLessZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> number=Arrays.asList(-4,8,5,-22,0,-67);
		List<Integer> negative = number.stream().filter(x->x<=0)
										   .collect(Collectors.toList());
		negative.forEach(System.out::println);
	}

}
