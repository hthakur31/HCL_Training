import java.util.*;

public class HashMap15Methods{
	public static void main(String[] args){
		
		// HashMap with default constructor
		HashMap<Integer,String> map1 = new HashMap<>();
		
		// HashMap with initial capacity
		HashMap<Integer,String> map2 = new HashMap<>(5);
		
		// HashMap inside HashMap
		HashMap<Integer,String> map4 = new HashMap<>(map1);
		
		//1 Add Element in map1
		map1.put(1,"One");
		map1.put(2,"Two");
		map1.put(3,"Three");
		map1.put(4,"Four");
		System.out.println("Added elements in the HashMap are "+map1);
		
		//2 Check wheather the Map is empty or not
		System.out.println("IS HashMap empty : "+map1.isEmpty());
		
		//3 to check size
		System.out.println("The size of the HashMap is : "+ map1.size());
		
		//4 check wheather the HashMap contains the key or not
		System.out.println("Is HashMap contains the key 2 : "+map1.containsKey(2));
		
		//5 Get value using the key
		System.out.println("The value of the key 3 is : "+map1.get(3));

		//6 Put All the elements of the of map1 into map2
		map2.putAll(map1);
		System.out.println("The elements in the map 2 are : "+map2);
		
		//7 To check the HashMap contains the given value or not
		System.out.println("the HashMap contains the given value 'One' " + map1.containsValue("One"));
		
		//8 To replace the value in specific key
		map1.replace(4,"Four","Five");
		System.out.println("The updated Hashmap with replace value is : "+ map1);
		
		//9 check load factor
		//System.out.println("The load factor of the HashMap is : "+map1.loadFactor());
		
		//10 to check the capacity of the HashMap 
		//System.out.println("The capacity of the HashMap is : "+ map1.capacity());
		
		//11 putIfAbsent
		map1.replace(4,"Five","Four");
		map1.putIfAbsent(5,"Five");
		System.out.println("New added Element in the HashMap : "+map1);
		
		//12 To check the map1 is equal to the map2 or not
		System.out.println("map1 is equal to the map2 : "+map1.equals(map2));
		
		//13 print only values 
		System.out.println("Values of the map1 are : "+map1.values());
		
		//14 remove specific elements
		map1.remove(5);
		System.out.println("HashMap after remove element whose key was 5 : "+map1);
		
		//15 Hashcodes of the HashMap
		System.out.println("The hashcode of the HashMap is : "+map1.hashCode());
		
		//16 Keyset 
		System.out.println("keySet(): " + map1.keySet());
		
		//17 Entryset
		System.out.println("entrySet(): " + map1.entrySet());
		
	}
}