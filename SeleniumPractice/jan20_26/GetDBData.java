package jan20_26;

import java.sql.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class GetDBData {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver(); 
		String URL = "jdbc:mysql://localhost:3306/login";
		String USERNAME = "root";
		String PASSWORD = "Harsh@2004";
		Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT username,password from login");
		while(rs.next()){
			String user = rs.getString("username");
			String pass = rs.getString("password");
			driver.get("");
			driver.findElement(By.id("")).sendKeys(user);
			driver.findElement(By.id("")).sendKeys(pass); 
			driver.findElement(By.xpath("")).click();
			System.out.println("login done!");
			driver.close();
		}
	}
}