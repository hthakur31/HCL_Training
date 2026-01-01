package JDBCPractice;
import java.sql.*;

public class SQLEX1 {
	static Connection c = null;
	static Statement s = null;
	static ResultSet rs = null;
	static PreparedStatement ps = null;
	
	public static void jdbc()  {
	
		try {
		ps = c.prepareStatement("insert into orders (O_id, cus_name, price, dis_no, age) values(?,?,?,?,?)");
		ps.setInt(1, 10);
		ps.setString(2, "Harsh");
		ps.setDouble(3, 200.00);
		ps.setInt(4, 400);
		ps.setInt(5, 18);
		int rowAffected = ps.executeUpdate();
		System.out.println(rowAffected + " = Row affected");
		
		rs = s.executeQuery("SELECT * FROM orders");
		 
		 while(rs.next()) {
			 
			 System.out.print(rs.getInt("O_id"));
			 System.out.print("\t");
			 System.out.print(rs.getString(" cus_name"));
			 System.out.print("\t");
			 System.out.print("\t");
			 System.out.print(rs.getInt("price"));
			 System.out.print("\t");
			 System.out.print(rs.getInt("dis_no"));
			 System.out.print("\t");
			 System.out.print(rs.getInt("age"));
			 System.out.println();
		 }
		}catch(SQLException e) {
			System.out.println("SQL Exception");
			e.printStackTrace();
			}
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
		 jdbc();
		 rs = s.executeQuery("SELECT * FROM employee_info");
		 
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
