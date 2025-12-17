import java.util.*;

class armstrongNumber{
	
	static int IsarmstrongNumber(int y){
		int num = 0;
		while (y>0){
			int dig = y%10;
			int cube = dig*dig*dig;
			num +=cube;
			y/=10;
		}
		return num;
	}
	public static void main(String[] args){
		int x;
		System.out.println("Enter an number to check armstrong number or not");
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		
		if (IsarmstrongNumber(x) == x){
			System.out.println("number is armstrong number");
		}
		else{
			System.out.println("number is not armstrong number");
		}
		
	}
}