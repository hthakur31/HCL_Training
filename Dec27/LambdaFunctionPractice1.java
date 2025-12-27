import java.util.*;

//Use Lambda Function with argument
class LambdaFunctionPractice1{
	
	public static void main(String[] args) {
		
	A r = (s) -> System.out.println("Hi there "+s);
	r.show("Welcome");
		
	}
 
}
interface A {
	public void show(String s);
}