import java.util.*;

class DequeCollection {
		
	public static void main(String[] args) {
		Deque<Integer> Dq = new ArrayList<Integer>();
		Dq.offer(1);
		Dq.offerLast(2);
		Dq.offerFirst(3);
		
		System.out.println("Element of Deque = "+Dq);
		int first = Dq.peekFirst();
		System.out.println("Fist element is = " + first);
		int last = Dq.peekLast();
		System.out.println("The last element of the Deque = "+ last);
		
		int rev = Dq.pollFirst();
		System.out.println("removed element  = "+ rev);
		System.out.println("Updated Element of Deque = "+Dq);
		
	}
 
}

