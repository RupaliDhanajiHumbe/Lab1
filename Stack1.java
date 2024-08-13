package B;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Stack<String> stack=new Stack<>();
		stack.push("Ram");
		stack.push("Soham");
		stack.push("Ganesh");
		stack.push("Rahul");
		stack.push("Aadi");
		stack.pop();
		stack.pop();
        System.out.println(stack);
	}

}
