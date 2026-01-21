package jan21_26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registrationVerify {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("");
		registrationForm rf = new registrationForm(driver);
		rf.testRegistration("harsh", "harsh123");
	}

}
