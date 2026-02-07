package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		   WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://the-internet.herokuapp.com/upload");

	        // Click file upload button (opens OS dialog)
	        driver.findElement(By.id("file-upload")).click();

	        Thread.sleep(2000);

	        // Run AutoIt executable
	        Runtime.getRuntime().exec("F:\\AutoIt\\first.exe");

	        Thread.sleep(2000);

	        // Submit file
	        driver.findElement(By.id("file-submit")).click();

	        Thread.sleep(3000);
	        driver.quit();

	}

}
