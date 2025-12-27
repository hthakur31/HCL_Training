import java.util.*;

//Generics with multiple perameter
class GenericsConcept2 {
		
	public static void main(String[] args) {
		Gen<Integer,Double> i = new Gen<Integer,Double>();
		i.show(3,4.55);
		Gen<String, String> j = new Gen<String,String>();
		j.show("Har2sh", "Aayush");
		Gen<Double, Double> k = new Gen<Double,Double>();
		k.show(8.9, 7.8);
	
	}
 
}
class Gen <T, V>{
	
	void show(T a, V b){
		System.out.println(a+ " "+b);
	}
}
