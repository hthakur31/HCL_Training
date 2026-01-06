package SeleniumProgramms;
//06-01-2026
//Gmail login
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class Ex2 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://onlinefeestechnocrats.in/");
		System.out.println("Open Website!");
		
		
		WebElement e1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]"));
		e1.click();
		System.out.println("Click Tution fee");
		
		WebElement e5 = driver.findElement(By.xpath("//input[@id='rdStu']"));
		e5.click();
		
		WebElement e2 = driver.findElement(By.xpath("//input[@id='Login1_UserName']"));
		e2.sendKeys("22-23STU18685");
		System.out.println("filled enroll");
		
		WebElement e3 = driver.findElement(By.xpath("//input[@id='Login1_Password']"));
		e3.sendKeys("31032004");
		System.out.println("filled password");
		
		
		WebElement e4 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[5]/div[2]/div[1]/section[1]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[2]/input[1]"));
		e4.click();
		System.out.println("Click login");
		
		Thread.sleep(10000);
		//driver.close();
		

	}

}
