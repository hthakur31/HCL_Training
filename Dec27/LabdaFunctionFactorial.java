import java.util.*;

//Factorial of the number using Labda Function
class LabdaFunctionFactorial{
	
	public static void main(String[] args) {
		
	A r = (a) -> {
		int f = 1;
		for(int i = a; i>0; i--){
			f*=i;
		}
		return f;
	};
	System.out.println(r.factorial(6));
		
	}
 
}
interface A {
	public int factorial(int a);
}