import java.util.*;

//Use String Methods
class test {
		
	public static void main(String[] args) {
		Gen<Integer,Double> i = new Gen<Integer,Double>();
		i.show(3,4.55);
		//Gen<String> j = new Gen<String>();
		//j.show("Harsh");
		//Gen<Double> k = new Gen<Double>();
		//k.show(8.9);
	
	}
 
}

class Gen <T, V>{
	
	void show(T a, V b){
		System.out.println(a+ " "+b);
	}
}
