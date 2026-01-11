package Assignment4JDBC;
import java.sql.*;
import java.util.Scanner;
public class JDBCConnection {
	
	public static void main(String[] args) {
		
		try(Connection con = DB_Connection.connectDB()) {
			System.out.println("Conncetion Successful !");
			
			//insertStudent(con, "Harshvardhan", "B.Tech", "AIML","VIII", 2026, "4578451212","harsh@gmail.com", 95.5, "Active");
			//displayStudent(con);
			SetDetails(con);
			displayStudent(con);
		}catch(SQLException e) {
			System.out.println("Unable to connect!");
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			System.out.println("Unable to connect!");
			e.printStackTrace();
		}
	}
	
	public static void SetDetails(Connection con) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.println("Enter Name : ");
		String Name =  sc.nextLine();
		
		System.out.println("Enter Course : ");
		String Course =  sc.nextLine();
		
		System.out.println("Enter Branch : ");
		String Branch =  sc.nextLine();
		
		System.out.println("Enter Semester : ");
		String Semester =  sc.nextLine();
		
		System.out.println("Enter year : ");
		int year =  sc.nextInt();
		
		System.out.println("Enter Mobile_No : ");
		String Mobile_No =  sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Email : ");
		String Email =  sc.nextLine();
		
		System.out.println("Enter Percentage : ");
		double Percentage =  sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Status : ");
		String Status =  sc.nextLine();
		
		//insertStudent(con, Name, Course, Branch, Semester, year, Mobile_No, Email, Percentage, Status );
		insertUsingPreparedStatement(con, Name, Course, Branch, Semester, year, Mobile_No, Email, Percentage, Status );
		System.out.println("Inset Successful");
		
	}
	//Insert student detail in the student table
	public static void insertStudent(Connection con, String Name, String Course, String Branch, String Semester, int year, String Mobile_No, String Email, double Percentage, String Status) {
		
		String sql = "INSERT INTO student (Name, Course, Branch, Semester, year, Mobile_No, Email, Percentage, Status) VALUES ('"+Name+"', '"+Course+"','"+Branch+"', '"+Semester+"',"+year+", '"+Mobile_No+"', '"+Email+"', "+Percentage+", '"+Status+"')";
		
		try(Statement stmt = con.createStatement()){
		int rows  = stmt.executeUpdate(sql);
		System.out.println("Inserted row : "+rows);
		
		}catch(SQLException e ) {
			System.out.println("Error in insertion");
		}
	}
	
	public static void insertUsingPreparedStatement(Connection con, String Name, String Course, String Branch, String Semester, int year, String Mobile_No, String Email, double Percentage, String Status)  {
		
		String sql = "INSERT INTO student (Name, Course, Branch, Semester, year, Mobile_No, Email, Percentage, Status) VALUES (?,?,?,?,?,?,?,?,?)";
		try(PreparedStatement ps = con.prepareStatement(sql)){
			ps.setString(1, Name);
			ps.setString(2, Course);
			ps.setString(3, Branch);
			ps.setString(4, Semester);
			ps.setInt(5, year);
			ps.setString(6, Mobile_No);
			ps.setString(7, Email);
			ps.setDouble(8, Percentage);
			ps.setString(9, Status);
			int row = ps.executeUpdate();
			System.out.println(row +" Row Affected");
		}catch(Exception e) {
			System.out.println("Exception!");
		}
	}
	
	public static void displayStudent(Connection con) {
		
		String sql = "SELECT * FROM student";
		try(Statement stmt = con.createStatement()){
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("Print Student table");
			
			while(rs.next()) {
				int Enrollment_No = rs.getInt("Enrollment_No") ;
				String Name = rs.getString("Name");
				String Course = rs.getString("Course");
				String Branch = rs.getString("Branch");
				String Semester = rs.getString("Semester");
				int year = rs.getInt("year") ;
				String Mobile_No = rs.getString("Mobile_No");
				String Email = rs.getString("Email");
				double Percentage = rs.getDouble("Percentage");
				String Status = rs.getString("Status");
				
				System.out.println(Enrollment_No + "\t"+ Name + "\t" + Course+ "\t" + Branch + "\t" + Semester + "\t" + year + "\t" + Mobile_No + "\t" + Email + "\t" + Percentage + "\t" + Status );
			}
			
			}catch(SQLException e ) {
				System.out.println("Error in insertion");
			}
	}
}

/*Enrollment_No INT  AUTO_INCREMENT  PRIMARY KEY,
Name VARCHAR(50),
Course VARCHAR(50),
Branch VARCHAR(50) NOT NULL,
Semester VARCHAR(20)NOT NULL,
year INT,
Mobile_No VARCHAR(10),
Email VARCHAR(200),
Percentage DOUBLE,
Status ENUM('Active', 'Inactive','Passout') DEFAULT 'Active'*/
