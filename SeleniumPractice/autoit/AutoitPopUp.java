package autoit;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoitPopUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://the-internet.herokuapp.com/basic_auth");
		 Thread.sleep(2000);
		 Runtime.getRuntime().exec("F:\\AutoIt\\popup.exe");
		 Thread.sleep(4000);
		 driver.quit();
	}

}
