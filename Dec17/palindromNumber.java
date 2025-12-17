import java.util.*;

class palindromNumber{
	static int Ispalindrome(int y){
		int rev = 0;
		while(y>0){
			int dig = y%10;
			rev = rev*10+dig;
			y/=10;
		}
		return rev;
	}
	static public void main(String[] args){
		int x;
		System.out.println("Enter the number to check palindrome ");
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		
		if(Ispalindrome(x) == x){
			System.out.println("Number is Palindrome");
		}
		else{
			System.out.println("Number is not Palindrome");
		}
	}
}