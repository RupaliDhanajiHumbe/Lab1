package A;

public class ab {
	int value = 0;
	ab(){
	addValue();
	}
	void addValue(){
	value += 10;
	}
	int getValue(){
	return value;
	}
	}
	class Derived extends ab{
	Derived(){
	addValue();
	}
	void addValue(){
	value += 20;
	}
		
	public static void main(String[] args){
		ab b = new Derived();
	System.out.println(b.getValue());

	}
}