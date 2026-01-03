package Assignment4JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {

	public final static String URL = "jdbc:mysql://localhost:3306/college";
	public final static String USER = "root";
	public final static String PASSWORD = "Harsh@2004";
	public static Connection connectDB() throws SQLException, ClassNotFoundException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
		return con;
	}
	
}
