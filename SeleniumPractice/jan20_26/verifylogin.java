package jan20_26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifylogin{

	public static void main(String[] args){
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://onlinefeestechnocrats.in/LoginStudent.aspx?type=F");
		loginPage lp = new loginPage(driver);
		lp.username();
		lp.password();
		lp.loginclick();
	}
}
