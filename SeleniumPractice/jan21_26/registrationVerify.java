package jan21_26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registrationVerify {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		registrationForm rf = new registrationForm(driver);
		driver.get("F:\\eclipse-java-2025-09-R-win32-x86_64\\HCL_Training\\SeleniumPractice\\jan21_26\\registrationform.html");
		//rf.testRegistration("harsh", "harsh123");
		rf.ByJs();
		Thread.sleep(3000);
		driver.quit();
	}
}
