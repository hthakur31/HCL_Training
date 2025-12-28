import java.util.*;

public class StudentRecordManagment{
	public static void main(String[] args){
	
		Student s1 = new Student("Aayush", 1001, "AIML", "1234");
		Student s2 = new Student("Vanshika", 1002, "AIML", "2345");
		Student s3 = new Student("Harshvardhan", 1003, "AIML", "3456");
		Student s4 = new Student("Durgesh", 1004, "AIML", "4567");
		Student s5 = new Student("Prince", 1005, "AIML", "5678");
		
		List<Student> Studentlist = new ArrayList<>();
		Studentlist.add(s1);
		Studentlist.add(s2);
		Studentlist.add(s3);
		Studentlist.add(s4);
		Studentlist.add(s5);
		
		printRecord(Studentlist);
		System.out.println();
		System.out.println();
		System.out.println("After Remove record using roll no");
		System.out.println();
		System.out.println();
		removeRecord(Studentlist,1004);
		printRecord(Studentlist);
	}
	
	static void printRecord(List<Student> Studentlist){
		for(Student s : Studentlist){
			System.out.println("Student Name = "+s.name+"  Roll Number = "+ s.RollNo+ "  Branch = "+s.branch+"   Mobile Number = "+ s.MobileNo);
		}
	}
	

	static void removeRecord(List<Student> Studentlist, int rollno){
	
		Iterator<Student> it = Studentlist.iterator();
		while(it.hasNext()){
			//Student u = it.next();
			if(it.next().RollNo == rollno){
				it.remove();
				return;
			}
		}
		System.out.println("Student record not found");
	}
}
class Student{

	public String name;
	public int RollNo;
	public String branch;
	public String MobileNo;
	Student(String name, int RollNo, String branch, String MobileNo){
		this.name = name;
		this.RollNo = RollNo;
		this.branch = branch;
		this.MobileNo = MobileNo;
		
	}
}

