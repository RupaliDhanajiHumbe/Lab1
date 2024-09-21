package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       List<String> names=Arrays.asList("f","t","r","f","m","x");
		List<String> FilterLatter=names.stream()
										.filter(Letter->Letter!="f")
									    .collect(Collectors.toList());
		
		FilterLatter.forEach(System.out::println);
	}

}
