package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names=Arrays.asList("jone","jane","jack","jill");
		
		
		List<String> FilterName=names.stream()
										.filter(name->name.startsWith("j"))
										.map(String::toUpperCase)
									    .sorted()
									    .collect(Collectors.toList());
		
		FilterName.forEach(System.out::println);
	}

}
