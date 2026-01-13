package jan13_26;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("F:\\eclipse-java-2025-09-R-win32-x86_64\\HCL_Training\\SeleniumPractice\\jan10_26\\test.html");
		WebElement e1 = driver.findElement(By.id("enroll"));
		e1.sendKeys("0567AL221022");
		WebElement e2 = driver.findElement(By.id("name"));
		e1.sendKeys(Keys.TAB);
		e2.sendKeys("Harshvardhan");
		Thread.sleep(3000);
		e2.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		driver.close();
	}

}
