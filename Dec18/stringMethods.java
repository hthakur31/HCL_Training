import java.util.*;

//Use String Methods
//String Buffer
//String builder
class stringMethods{
	
	public static void main(String[] args){
		
		String  s = "Harshvardhan";
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("v"));
		System.out.println(s.substring(1,6));
		System.out.println(s.concat("Thakur"));
		//System.out.println(s.trim("Thakur"));
		
	}
}