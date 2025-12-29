import java.util.*;

class LinkedListCollection {
		
	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<Integer>();
		System.out.println("Size of the vector = "+ ll.size());
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		ll.remove(2);
		
		ll.addFirst(6);
		ll.addLast(9);
		
		
		for(int i : ll){
			System.out.println(i);
		}
	}
 
}

