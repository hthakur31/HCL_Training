package Assignment4JDBC;
import java.sql.*;
public class JDBCConnection {
	
	public static void main(String[] args) {
		
		try(Connection con = DB_Connection.connectDB()) {
			System.out.println("Conncetion Successful !");
			
			//insertStudent(con, "Harshvardhan", "B.Tech", "AIML","VIII", 2026, "4578451212","harsh@gmail.com", 95.5, "Active");
			//displayStudent(con);
			
		}catch(SQLException e) {
			System.out.println("Unable to connect!");
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			System.out.println("Unable to connect!");
			e.printStackTrace();
		}
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
	
	public static void displayStudent(Connection con) {
		
		String sql = "SELECT * FROM student WHERE Branch = 'CSE'";
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
