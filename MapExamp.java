package B;

import java.util.HashMap;

public class MapExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> capital=new HashMap<>();
		capital.put("India","NewDelhi");
		capital.put("Pakistan","Isiambad");
		capital.put("France","Paris");
		
		
		System.out.println(capital.get("India"));
		
	}

}
