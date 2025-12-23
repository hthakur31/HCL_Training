import java.util.*;

/* 1) A class sixth student required to solve basic mathematics problems. For this he/ she needs to
perform operations such as addition, subtraction, multiplication, division, remainder, square,
cube, and absolute. Write a program using methods to perform these basic operations
*/

class Operations{
	
	static void Addition(){
		
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number for addition : ");
		x = sc.nextInt();
		y = sc.nextInt();
		int sum = x+y;
		System.out.println("Addition of two number = "+sum);
	}
	
	static void subtraction(){
		
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number for subtraction : ");
		x = sc.nextInt();
		y = sc.nextInt();
		int sub = x-y;
		System.out.println("subtraction of two number = "+ sub);
	}
	
	static void multiplication(){
		
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number for multiplication : ");
		x = sc.nextInt();
		y = sc.nextInt();
		int mul = x*y;
		System.out.println("multiplication of two number = "+ mul);
	}
	
	static void division(){
		
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number for division : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(y == 0) {
		System.out.println("cannot divide by 0 ");
		}
		else{
			int div = x/y;
		System.out.println("division of two number = "+div);
		}
	}
	
	static void remainder(){
		
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number for remainder : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(y == 0){
			System.out.println("cannot find remainder by 0 ");
		}
		else{
			int rem = x%y;
			System.out.println("remainder of two number = "+rem);
		}
	}
	
	static void square(){
		
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for square : ");
		x = sc.nextInt();
		int sq =x*x;
		System.out.println("square of a number = "+sq);
	}
	
	static void cube(){
		
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for cube : ");
		x = sc.nextInt();
		int cu = x*x*x;
		System.out.println("cube of a number = "+cu);
	}
	
	static void Absolute(){
		
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for absolute : ");
		x = sc.nextInt();
		int ab = Math.abs(x);
		System.out.println("cube of a number = "+ab);
	}
	
	
	public static void main(String [] args){
	
		System.out.println("For Addition press '+'");
		System.out.println("For subtraction press '-'");
		System.out.println("For multiplication press '*'");
		System.out.println("For Division '/'");
		System.out.println("For remainder press '%'");
		System.out.println("For Square press 's'");
		System.out.println("For Cube press 'c'");
		System.out.println("For absolute press '$'");	
		
		char x ;
		System.out.println("Enter your choice :");
		Scanner sc = new Scanner(System.in);
		x = sc.next().charAt(0);;
		
		
		switch(x){
			
			case '+': 
				Addition();
				break;
				
			case '-': 
				subtraction();
				break;
				
			case '*': 
				multiplication();
				break;
				
			case '/': 
				division();
				break;
				
			case '%': 
				remainder();
				break;
				
			case 's': 
				square();
				break;
				
			case 'c': 
				cube();
				break;
				
			case '$': 
				Absolute();
				break;
				
			default :
				System.out.println("Invalid Input");
		
		}
	}
}