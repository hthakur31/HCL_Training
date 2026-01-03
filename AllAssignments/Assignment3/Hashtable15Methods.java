import java.util.*;

public class Hashtable15Methods {
    public static void main(String[] args) {

        //HashTable with Default constructor
        Hashtable<Integer, String> ht1 = new Hashtable<>();
		
		//HashTable with initial capacity
        Hashtable<Integer, String> ht2 = new Hashtable<>(20);
		
		//HashTable with initial capacity and loadfactor
        Hashtable<Integer, String> ht3 = new Hashtable<>(20, 0.8f);
		
		//HashTable inside HashTable
        Hashtable<Integer, String> ht4 = new Hashtable<>(ht1);

        
        ht1.put(1, "Apple");
        ht1.put(2, "Banana");
        ht1.put(3, "Mango");
        ht1.put(4, "Orange");

        
        System.out.println("1. get(): " + ht1.get(3));
        System.out.println("2. containsKey(): " + ht1.containsKey(2));
        System.out.println("3. containsValue(): " + ht1.containsValue("Apple"));
        System.out.println("4. size(): " + ht1.size());
        System.out.println("5. isEmpty(): " + ht1.isEmpty());

        ht1.remove(4);
        System.out.println("6. remove(): " + ht1);

        ht1.replace(1, "Green Apple");
        System.out.println("7. replace(): " + ht1);

        ht1.putIfAbsent(5, "Pineapple");
        System.out.println("8. putIfAbsent(): " + ht1);

        System.out.println("9. keySet(): " + ht1.keySet());
        System.out.println("10. values(): " + ht1.values());
        System.out.println("11. entrySet(): " + ht1.entrySet());

        ht2.putAll(ht1);
        System.out.println("12. putAll(): " + ht2);

        System.out.println("13. equals(): " + ht1.equals(ht2));
        System.out.println("14. hashCode(): " + ht1.hashCode());

        ht1.clear();
        System.out.println("15. clear(): " + ht1);
    }
}
