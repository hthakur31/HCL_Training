package jan9_26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String user = "admin";
		String password = "admin";
		String URL = "https://" + user + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";// with username and password
		driver.get(URL);
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth"); // without username and password
		System.out.println("Page title : "+driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		
	}

}
