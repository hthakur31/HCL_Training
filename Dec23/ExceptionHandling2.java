import java.util.*;

class ExceptionHandling2{
	public static void main(String[] args){
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {10,0,5,2,0};
		
		for(int i = 0; i<arr1.length; i++){
			try{
				System.out.println(arr1[i]/arr2[i]);
			}
			catch(ArithmeticException e){
				System.out.println("Can't divide by 0");
			}
			catch(ArrayIndexOutOfBoundException aa){
				System.out.println("Array out of bound exception");
			}
		}
	}
	
}