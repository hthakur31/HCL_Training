import java.util.*;

public class AgeCustomException{
	static void checkAge(int age) throw InvalidAgeException{
		if (age <18){
			throw new InvalidAgeException("Invalid Age");
		}
		else{
			System.out.println("You are eligible to vote");
		}
	 }
	
	
	public static void main(String[] args){
		try{
			checkAge(16);
		}
		catch(InvalidAgeException e){
			System.out.println("Exception Handling"+e.getMesaage());
		}
	}

}
class InvalidAgeException extends Exception{

	InvalidAgeException(String message){
		super(message);
	}

}