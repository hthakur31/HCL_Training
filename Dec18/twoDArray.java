import java.util.*;

// WAP to find and avg of 2D array of 2*2
class twoDArray{
	
	public static void main(String[] args){
		
		int [][] x = new int[2][2];
		Scanner s = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i<2; i++){
			for(int j = 0; j<2; j++){
				x[i][j] = s.nextInt();
				sum+=x[i][j];
			}
		}
		int avg = sum/4;
		System.out.println(sum);
		System.out.println(avg);
	}
}