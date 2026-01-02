import java.util.*;

class ArrayList15Methods{
	
	public static void main(String[] args){
		
		// default array list
		List<String> list1 = new ArrayList<>();
		
		// array list with size
		List<String> list2 = new ArrayList<>(5);
		
		//array list inside passes the another array list
		List<String> list3 = new ArrayList<>(list1);
		
		//1 add() operation in List 1
		list1.add("Aayush");
		list1.add("Harsh");
		list1.add("Durgesh");
		
		//2 addAll() Method in list 2
		list2.addAll(list1);
		
		//3 add(index,element) element in specific index
		list1.add(1,"Vanshika");
		
		//4 to get element using get()
		System.out.println("Element at index 2 in list 1 is : "+list1.get(2));
		
		//5 remove by index 
		list1.remove(1);
		
		//6 Set element in perticular index set(index,element)
		list1.set(1,"Harsh");
		
		//7 remove by object or element
		list1.remove("Durgesh");
		
		//8 get the size of the array list1 
		System.out.println("The size of the list 1 : "+ list1.size());
		
		//9 To check wheather the list is empty or not
		System.out.println("Is list empty : " + list1.isEmpty());
		
		//10 check the index of perticutar object in list 2
		System.out.println("The index of harsh in list 2 : "+list2.indexOf("Harsh"));
		
		//11 lastIndexOf() the element 
		//System.out.println("The last Index of the element 2 "+ list1.lastIndexOf());
		
		//12 Using iterator
		System.out.println();
		System.out.println("Using iterator to print all the elements of list1 : ");
		Iterator<String> it = list1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//13 ToArray() convert array list 1 into ArrayList
		
		Object [] arr = list1.toArray();
		System.out.println("Printing all the elements of the array arr : ");
		for(Object o : arr){
			System.out.println(o);
		}
		
		//14 Clear all the elements of the list1
		list1.clear();
		System.out.println("After clear(), is list1 empty? " + list1.isEmpty());
		
		//15 using contains()
		System.out.println("is List contains the element Durgesh : "+ list1.contains("Durgesh"));
		
		System.out.println("List2: " + list2);
        System.out.println("List3 (created using collection constructor): " + list3);
		
	}
}