import java.util.*;

//Use Lambda Function without argument
class LambdaFunctionPractice2{
	
	public static void main(String[] args) {
		
	A r = () -> System.out.println("Hi there");
	r.show();
		
	}
 
}
interface A {
	public void show();
}