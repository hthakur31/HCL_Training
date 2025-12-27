import java.util.*;

//Use String Methods
class GenericsConcept{
		
	public static void main(String[] args) {
		Gen<Integer> i = new Gen<Integer>();
		i.show(3);
		Gen<String> j = new Gen<String>();
		j.show("Harsh");
		Gen<Double> k = new Gen<Double>();
		k.show(8.9);
	
	}
 
}

class Gen <T>{
	
	void show(T a){
		System.out.println(a);
	}
}
