import java.util.*;

class ArrayListCollection {
		
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		System.out.println("Size of the vector = "+ l.size());
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		//l.remove(2);
		//for(int i : l){
		//	System.out.println(i);
		//}
		// Convert ArrayList into Array
		
		System.out.println(l);
		
		Integer ia [] = new Integer[l.size()];
		ia = l.toArray(ia);
		
		for(int i : ia){
			System.out.println(i);
		}
		
		// print using iterator
		
		Iterator<Integer> it = l.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
 
}

