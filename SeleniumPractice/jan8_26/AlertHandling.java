package jan8_26;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		//Alert Handling
		//1. accept() 2. dismiss() 3. getText() 4. sendKeys()
		try {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		//driver.findElement(By.id("username")).sendKeys("aaaa");
		//driver.findElement(By.id("pass")).sendKeys("11111");
		driver.findElement(By.id("alert")).click();
		
		Thread.sleep(3000);
		//Alert alert = driver.switchTo().alert();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Dismissed");
		Thread.sleep(5000);
		driver.quit();
		
		}catch(Exception e) {
			System.out.println("Exception");
		}
	}

}
