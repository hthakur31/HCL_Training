package JDBCPractice;
import java.sql.*;

public class SQLEX1 {
	static Connection c = null;
	static Statement s = null;
	static ResultSet rs = null;
	
	public void jdbc() {
		
		
	}
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException e){
			System.out.println("Class not found");
			e.printStackTrace();
		}
		try {
		 c = DriverManager.getConnection("jdbc:mysql://localhost:3306/techkalaa", "root", "Harsh@2004");
		 s= c.createStatement();
		 rs = s.executeQuery("select * from employee_info");
		 
		 while(rs.next()) {
			 
			 System.out.print(rs.getInt("emp_id"));
			 System.out.print("\t");
			 System.out.print(rs.getString("Name"));
			 System.out.print("\t");
			 System.out.print("\t");
			 System.out.print(rs.getInt("Salary"));
			 System.out.println();
			 
		 }
		 
		}
		catch(SQLException e) {
		System.out.println("SQL Exception");
		e.printStackTrace();
		}
		
	}

}
