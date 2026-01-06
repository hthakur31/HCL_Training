package SeleniumProgramms;
//import java.util.*;
//05-01-2026
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ex1 {

	public static void main(String[] args) {
		
		try {
		//Create object of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//open website
		driver.get("https://placementguide.vercel.app/");
		System.out.println("Open Website");
		
		System.out.println("Title of the website : "+driver.getTitle());
		System.out.println("Current URL of the website : "+driver.getCurrentUrl());
		//System.out.println("Page Source of the website : "+driver.getPageSource());
		//System.out.println("Window Handle of the website : "+driver.getWindowHandle());
		
		driver.manage().window().maximize();
		WebElement mock = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/a[2]"));
		mock.click();
		System.out.println("Click the Mock Interview button!");
		
		
		WebElement namefield = driver.findElement(By.id("name"));
		System.out.println("Find name text field");
		namefield.sendKeys("Harshvardhan Thakur");
		System.out.println("Enter name Harshvardhan!");
		
		
		WebElement emailfield = driver.findElement(By.id("email"));
		System.out.println("Find email text field");
		emailfield.sendKeys("harshvardhanthakur26@gmail.com");
		System.out.println("Enter email!");
		
		
		Thread.sleep(5000);
		driver.close();
		
		}catch(Exception e) {
			System.out.println("Exception");
			//e.printStackTrace();
		}
	}

}
