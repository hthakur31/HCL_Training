import java.util.*;

class primeNumber{

	static boolean Isprime(int x){
		boolean prime = true;
		for(int i = 2; i*i<x; i++){
			if(x%i == 0){
				prime = false;
				break;
			}
		}
		return prime;
	}
	public static void main(String[] args){
		int x;
		System.out.println("Enter the number to find out the prime number");
		Scanner s = new Scanner (System.in);
		x = s.nextInt();
		if(Isprime(x)){
			System.out.println(x+" is the prime number");
		}
		else{
			System.out.println(x+" is not the prime number");
		}
	}
}