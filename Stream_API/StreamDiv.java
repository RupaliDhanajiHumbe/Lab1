package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>number=Arrays.asList(12,65,54,39,102,339,221,50,70);
		
		List<Integer> div=number.stream().filter(x->x%13==0)
								.collect(Collectors.toList());
		
		div.forEach(num->System.out.println(num));
	}

}
