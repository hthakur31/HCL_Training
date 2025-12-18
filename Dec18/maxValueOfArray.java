import java.util.*;

// array ... 
// Data type [] a = new datatype[size];
// find the max value of array take input from user
class maxValueOfArray{
	
	public static void main(String[] args){
		
		int [] x = new int[5];
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<x.length; i++){
			x[i] = s.nextInt();
		}
		int max = 0;
		for(int i : x){
			if(i>max){
				max = i;
			}
		}
		System.out.println(max);
	}
}