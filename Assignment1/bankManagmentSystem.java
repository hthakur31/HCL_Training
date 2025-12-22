/*Design a console-based Bank Management Program in Java that allows a user to create a
bank account and perform basic banking operations such as deposit, withdrawal, balance
enquiry, and account details display. The program should handle exceptions as required.*/

import java.util.*;

class CreateAcc{
	
	private int AccNo;
	private String UserName;
	private double Balance;
	
	public CreateACC(int AccNo, String UserName, double Balance){
		
		this.AccNo = AccNo;
		this.UserName = UserName;
		this.Balance = Balance;
		
	}
	
	public int getAccNo(){
		return AccNo;
	}
	
	public String getUseName(){
		return UserName;
	}
	
	public int getBalance(){
		return Balance;
	}
	
	public void deposit(double Amount){
		if (Amount>0){
			Balance+=Amount;
			System.out.println("Deposit Successful");
		}
		else{
			System.out.println("Deposit Unsuccessful : Invalid amount");
		}
	}
	
	
	
	
}

public class bankManagmentSystem{
	
	public static void main(String[] args){
		
	
	}

}