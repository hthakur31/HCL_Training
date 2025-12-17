import java.util.*;

class fibonacci{
	public static void main(String[] args){
		int x;
		System.out.println("Enter the size of series of fibonacci");
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		int first = 0;
		int second = 1;
		if (x<=1){
			System.out.println("No Need");
			return;
		}
		System.out.println(first);
		System.out.println(second);
		for(int i = 3; i<=x; i++){
			
		int curr = first+second;
		first = second;
		second = curr;
		System.out.println(curr);
		}
	}
}