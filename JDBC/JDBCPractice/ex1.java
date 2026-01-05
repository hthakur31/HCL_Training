package JDBCPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/");
		//WebElement e = driver.findElement(By.id());
		
		Thread.sleep(1000);
		driver.close();
	}

}
