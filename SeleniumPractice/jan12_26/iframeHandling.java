package jan12_26;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/eclipse-java-2025-09-R-win32-x86_64/HCL_Training/SeleniumPractice/jan12_26/frameAndiframe.html");
		
		//Using index
		driver.switchTo().frame(0);
		
		//using id
		driver.switchTo().frame("frame2");
		
		//using WebElement
		WebElement fe = driver.findElement(By.id("frame2"));
		driver.switchTo().frame("fe");
		
		//switch back to previous frame
		driver.switchTo().defaultContent();
		
		
		Thread.sleep(5000);
		driver.quit();
		//List<WebElement> iframeelement = new ArrayList();
		
	}

}
