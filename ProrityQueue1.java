package B;

import java.util.PriorityQueue;

public class ProrityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> num = new PriorityQueue<Integer>();
        num.add(16);
        num.add(34);
        num.add(78);
        System.out.println(num.peek());
        System.out.println(num.poll());
       System.out.println(num.peek());
	}
}