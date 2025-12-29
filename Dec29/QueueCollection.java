import java.util.*;

class QueueCollection {
		
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		System.out.println(q);
		q.remove(2);
		
		System.out.println("The size of the queue = "+q.size());
		System.out.println(q.contains(3));
		q.clear();
		System.out.println(q);
		
	}
 
}

