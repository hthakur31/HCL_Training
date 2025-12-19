import java.util.*;

/*Write a menu driven program in Java to perform insertion, deletion, linear search, binary
search, to find maximum value, to count even/ odd and to perform insertion sort operation in
one dimensional array.*/

class ArrayOperations{
	
	static void insertion(int[] arr, int val, int pos){
		
		int i = arr.length-1;
		
		while(i>=pos){
			arr[i+1] = arr[i];
			i-=1;
		}
		arr[pos]= val;
		i+=1;
	}
	static void Deletion(int[] arr,int n, int pos){
		int temp = arr[pos];
		
		while(pos<n-1){
			arr[pos] = arr[pos+1];
			pos+=1;
		}
		System.out.println(temp);
		n-=1;
	}
	
	static int BinarySearch(int[] arr,int val,int n){
	
		int i= 0, j= n-1;
		while(i<j){
			int mid = (i+j)/2;
			if(arr[mid] > val){
				j = mid-1;
			}
			else if(arr[mid]<val){
				i = mid+1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	
	static int linearSearch(int[] arr,int val, int n){
		
		for(int i = 0; i<n; i++){
			if(arr[i] == val){
				return i;
			}
		}
		return -1;
	}
	
	static int Maximumvalue(int[] arr, int n){
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<n; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}
	
	static void EvenOdd(int[] arr, int n){
		int even = 0, odd = 0;
		for(int i = 0; i<n; i++){
			if(arr[i] %2 ==0 ){
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("Even values count : "+ even);
		System.out.println("Odd values count : "+ odd);
	}
	
	static void insertionsort(int[] arr, int n){
		for(int i = 0; i<n; i++){
			int idx = arr[i];
			int j = i;
			while(j>0 && arr[j-1] > idx){
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = idx;
		}
	
	}
	
	public static void main(String[] args){
		Scanner  sc =  new Scanner(System.in);
		System.out.println("For insertion press '+'");
		System.out.println("For Deletion press '-'");
		System.out.println("For Binary Search press '?'");
		System.out.println("For linear Search press '/'");
		System.out.println("For Maximum value press 'M'");
		System.out.println("For Even / odd press '<'");
		System.out.println("For insertion sort press 'S'");
		
		System.out.println("Enter the size of the Array :");
		
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter an Array :");
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		char ch;
		System.out.println("Enter your Choice : ");
		
		
		ch = sc.next().charAt(0);
		
		switch(ch){
			
			case '+':
				System.out.println("Enter value to be insert : ");
				int val = sc.nextInt();
				System.out.println("Enter positision of the value : ");
				int pos = sc.nextInt();
				insertion(arr,val,pos);
				break;
				
			case '-':
				System.out.println("Enter positision of the value to be deleted: ");
				int p = sc.nextInt();
				Deletion(arr,n,p);
				break;
				
			case '?':
				System.out.println("Enter the value to be search : ");
				int v = sc.nextInt();
				System.out.println("Index of the value : "+BinarySearch(arr,v,n));
				break;
			
			case '/':
				System.out.println("Enter the value to be search : ");
				int va = sc.nextInt();
				System.out.println("Index of the value : "+linearSearch(arr,va,n));
				break;
				
			case 'M':
				System.out.println("Maximum value in Array : "+Maximumvalue(arr,n));
				break;
			
			case '<':
				EvenOdd(arr,n);
				break;
				
			case 'S':
				insertionsort(arr,n);
				break;
				
			default:
				System.out.println("Invalid Input");
					
		}
	}

}