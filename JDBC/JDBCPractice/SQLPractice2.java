package JDBCPractice;
import java.sql.*;
public class SQLPractice2 {

	static Connection c = null;
	static Statement s = null;
	static ResultSet rs = null;
	static PreparedStatement ps = null;
	
	public static void intervalues() throws SQLException {
		String s = "update orders set name = ? where O_id = ?";
		ps = c.prepareStatement(s);
		ps.setInt(1, 1);
		ps.setString(2, "harshvardhan");
		
	}
	public static void deletevalues() throws SQLException {
		String s = "delete from orders where O_id = ?";
		ps = c.prepareStatement(s);
		ps.setInt(1, 1);
	}
	
//	public static void procedurecalling() {
//		
//		String callProcedure = "{call dispMyStud()}";
//		CallableStatement cs = c.prepareCall(callProcedure);
//		rs = cs.executeQuery();
//		while(rs.next()) {
//			
//			System.out.println("order id " + O_id);
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			} catch(ClassNotFoundException e){
				System.out.println("Class not found");
				e.printStackTrace();
			}
			try {
			 c = DriverManager.getConnection("jdbc:mysql://localhost:3306/techkalaa", "root", "Harsh@2004");
			 s= c.createStatement();
			 
			 
			 
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
