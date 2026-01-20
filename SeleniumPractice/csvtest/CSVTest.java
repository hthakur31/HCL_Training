package csvtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
public class CSVTest {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		String csvFile = "F:\\eclipse-java-2025-09-R-win32-x86_64\\HCL_Training\\SeleniumPractice\\csvtest\\data.csv";
		BufferedReader br = new BufferedReader(new FileReader(csvFile));
		String line;
		//boolean FirstLine = true;
		while ((line = br.readLine()) != null) {
			
//			if(FirstLine) {
//				
//				FirstLine = false;
//				continue;
//			}
//	
			String[] data = line.split(",");
			String username = data[0];	
			String password = data[1];
			driver.get("https://onlinefeestechnocrats.in/LoginStudent.aspx?type=F");
			driver.findElement(By.xpath("//input[@id='Login1_UserName']")).clear();
			driver.findElement(By.xpath("//input[@id='Login1_Password']")).clear();
			driver.findElement(By.xpath("//input[@id='Login1_UserName']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='Login1_Password']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@id='Login1_LoginButton']")).click();
			
			String un = "aaaa";
			if(un.equals(username)) {
				
				System.out.println("login successful");
				
			}else {
				System.out.println("login unsuccessful");
			}
		}
	}

}
