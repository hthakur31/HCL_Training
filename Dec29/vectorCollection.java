import java.util.*;


class vectorCollection {
		
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("Size of the vector = "+ v.size());
		System.out.println("Capacity of the vector = "+ v.capacity());
		
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		System.out.println("Capacity of the vector = "+ v.capacity());
		v.addElement(5);
		System.out.println("first element of the vector = "+ v.firstElement());
		System.out.println("Last element of the vector = "+ v.lastElement());
		
		for(int i : v){
			System.out.println(i);
		}
	}
 
}

