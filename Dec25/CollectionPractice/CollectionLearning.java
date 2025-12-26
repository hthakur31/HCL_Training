package CollectionPractice;
import java.util.*;
public class CollectionLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> User = new ArrayList<>();
		User.add("Harsh");
		User.add("aayush");
		User.add("durgesh");
		User.add("vanshika");
		
		// Traverse using for loop
		System.out.println("\n GET user using for loop");
		for(int i = 0; i<User.size(); i++) {
			
			System.out.println(User.get(i));
		}
		
		// Traverse using Enhance for loop
		System.out.println("\n GET user using Enhance for loop");
		for(String user : User) {
			
			System.out.println(user);
		}
		
		// Traverse using Iterator
		System.out.println("\n GET user using Iterator");
		Iterator<String> it = User.iterator();
		
		while(it.hasNext()) {
			//System.out.println(it.next());
			if(it.next().equals("aayush")) {
				it.remove();
			}
			System.out.println(it.next());
		}
		 
	}

}
