package jan21_26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registrationVerify {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("F:\\eclipse-java-2025-09-R-win32-x86_64\\HCL_Training\\SeleniumPractice\\jan21_26\\registrationform.html");
		registrationForm rf = new registrationForm(driver);
		rf.testRegistration("harsh", "harsh123");
		Thread.sleep(3000);
		driver.close();
	}

}
