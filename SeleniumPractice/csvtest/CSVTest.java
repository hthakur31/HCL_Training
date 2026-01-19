package csvtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
public class CSVTest {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		String csvFile = "F:\\eclipse-java-2025-09-R-win32-x86_64\\HCL_Training\\SeleniumPractice\\csvtest\\Test.csv";
		BufferedReader br = new BufferedReader(new FileReader(csvFile));
		String line;
		boolean FirstLine = true;
		while ((line =br.readLine()) != null) {
			
			if(FirstLine) {
				
				FirstLine = false;
				continue;
			}
			
			String[] data = line.split(",");
			String username = data[0];	
			String password = data[1];
			driver.get("");
			driver.findElement(By.xpath("")).clear();
			driver.findElement(By.xpath("")).clear();
			driver.findElement(By.xpath("")).sendKeys();
			driver.findElement(By.xpath("")).sendKeys();
			driver.findElement(By.xpath("")).click();
			
			String un = "aaaa";
			if(un.equals(username)) {
				
				System.out.println("login successful");
				
			}else {
				System.out.println("login unsuccessful");
			}
		}
		br.close();
		driver.close();
	}

}
