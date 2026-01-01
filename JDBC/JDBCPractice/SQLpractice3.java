package JDBCPractice;
import java.sql.*;
public class SQLpractice3 {

	private static Connection con;
	private static int insert(int id, String name, int age, double marks, PreparedStatement st) throws Exception{
        st.setInt(1, 1);
        st.setString(2, "Aman");
        st.setInt(3, 21);
        st.setDouble(4, 95.2);
        return st.executeUpdate();
	}
	
	private static void select(int id, PreparedStatement st) throws Exception {
		st.setInt(1, 1);
        ResultSet rs = st.executeQuery();
        
        while(rs.next()) {
            String name = rs.getString("name");
            int age = rs.getInt("age");
            double marks = rs.getDouble("marks");
            
            System.out.println(id + " " + name + " " + age + " " + marks);
        }
	}
	
	private static int update(int id, String name, int age, double marks, PreparedStatement st) throws Exception{
		st.setString(1, name);
		st.setInt(2, age);
		st.setDouble(3, marks);
		st.setInt(4, id);
		return st.executeUpdate();
	}
	
	private static int delete(int id, PreparedStatement st) throws Exception {
		st.setInt(1, id);
		return st.executeUpdate();
	}
	
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "DB_USERNAME", "DB_PASS");
        
        String insertQuery = "Insert into student(id, name, age, marks) values (?, ?, ?, ?)";
		PreparedStatement insertPreparedStatement = con.prepareStatement(insertQuery);
        
        String selectQuery = "Select * from student where id = ?";
        PreparedStatement selectPreparedStatement = con.prepareStatement(selectQuery);
        
        String updateQuery = "update student set name = ?, age = ?, marks = ? where id = ?";
        PreparedStatement updatePreparedStatement = con.prepareStatement(updateQuery);
        
        String deleteQuery = "delete from student where id = ?";
        PreparedStatement deletePreparedStatement = con.prepareStatement(deleteQuery);
        
        int rows = insert(1, "Aman", 21, 95.2, insertPreparedStatement);
        System.out.println("Inserted rows affected " + rows);
        
        select(1, selectPreparedStatement);
        
		rows = update(1, "Aman C", 21, 59.2, updatePreparedStatement);
		System.out.println("Updated! " + rows);
		
		select(1, selectPreparedStatement);
		
		rows = delete(1, deletePreparedStatement);
		System.out.println("Deleted! " + rows);
		
		select(1, selectPreparedStatement);
	}
}