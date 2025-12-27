import java.util.*;

//Use Lambda Function with argument and returntype
class LambdaFunctionPractice3{
	
	public static void main(String[] args) {
		
	A r = (s) -> "Hi there "+s;
	System.out.println(r.show("Welcome"));
		
	}
 
}
interface A {
	public String show(String s);
}