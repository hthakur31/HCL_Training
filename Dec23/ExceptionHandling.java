import java.util.*;

class ExceptionHandling1{
	public static void main(String[] args){
		int a = 20, b = 0;
		int c;
		try{
		
			c = a/b;
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception : Can't divide by 0 ");
		}
	}
}