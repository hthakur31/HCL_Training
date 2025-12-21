import java.util.*;

class Vehical{
	
	int price;
	String color;
	int wheel;
	
	
}

class car extends Vehical{
	
	//super(1000, "White", 4);
		car(int price, String color, int wheel){
		this.price = price;
		this.color=color;
		this.wheel = wheel;
		}
	
	void get(){
		System.out.println("Price "+price+ "color " +color + "Wheel "+ wheel);
	
	}
}

public class Single{
	public static void main(String[] args){
		
		car c = new car(1000, "Red", 4);
		c.get();
	}

}