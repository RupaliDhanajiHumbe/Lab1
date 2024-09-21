package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLength  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub										
		
		
		 List<String> names=Arrays.asList("cat","sat","mat","python","java","R");
			List<String> NewList=names.stream()
											.filter(str->str.length()>=4)
										    .collect(Collectors.toList());
			
			NewList.forEach(System.out::println);
	}
}