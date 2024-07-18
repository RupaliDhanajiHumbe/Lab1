package main;


public class Try1 {

	static void operate(boolean op1, boolean op2) {

		boolean op3 = op1!= op2;

		boolean op4 = op1^op2;

		boolean op5 = op3 = op4;

		System.out.println(op5);

		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			operate(false,false);

			operate(true,false);

			operate(false,true);

			operate(true,true);

		}

		
}

