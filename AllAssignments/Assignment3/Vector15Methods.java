import java.util.*;

class Vector15Methods{
	public static void main(String[] args){
		
		//Vector with default constructor
		Vector<String> vec1 = new Vector<>();
		
		//Vector with the initial size and incremental size
		Vector<String> vec2 = new Vector<>(3,2);
		
		//Vector inside another vector
		Vector<String> vec3 = new Vector<>(vec1);
		
		//1 find capacity of the vector
		System.out.println("The capacity of the vector 1 : "+vec1.capacity());
		
		//2 find the size of the vector
		System.out.println("The size of the vector 1 : "+ vec1.size());

		//3 to chech wheather the vector is empty or not
		System.out.println("Is Vector Empty : "+ vec1.isEmpty());
		
		//4 to add element in the vector
		vec1.addElement("Harshvardhan");
		vec1.addElement("Premchand");
		vec1.addElement("Dharmveer Bharti");
		System.out.println("The added elements in the vector are : " + vec1);
		
		//5 add all element of the first vector into second 
		//vec2.addAllElements(vec1);
		
		//6 Find the index of the Specific element
		System.out.println("The index of the 'Premchand' is : "+vec1.indexOf("Premchand"));
		
		//7 Find the last index of the element
		vec1.addElement("Harshvardhan");
		System.out.println("The last index of the Harshvardhan is : "+ vec1.lastIndexOf("Harshvardhan"));
		
		//8 Remove a specific element by index
		vec1.removeElementAt(1);
		System.out.println("The Remaining elements are "+vec1);
		
		//9 Inset the element in the specific position
		vec1.insertElementAt("Premchand",1);
		System.out.println("The inseted element at the index 1 is : "+vec1.elementAt(1));
		
		//10 find the element using index value
		System.out.println("The element At index 2 is : "+vec1.elementAt(2));
		
		//11 find the first element of the vector
		System.out.println("The first element of the vector is : "+ vec1.firstElement());
		
		//12 Find the last element of the vector
		System.out.println("The last element of the Vector is : "+ vec1.lastElement());
		
		//13 convert vector to Array
		System.out.println("The Vector is converted into Array --");
		Object [] arr = vec1.toArray();
		for(Object o: arr){
			System.out.println(o);
			
		}
		//14 Iterate using Iterator
		System.out.println("Iterate vector Using Iterator --- ");
		Iterator <String>it = vec1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//15 remove all the elements from the vector
		System.out.println("Removing all the elements from the vector ---");
		vec1.removeAllElements();
		System.out.println("Is vector Empty : "+vec1.isEmpty());
		
		//16 vector sort
		//vec1.sort();
		//System.out.println("The element of the vector in sorted order :: \n "+vec1);
		
		
	}
}