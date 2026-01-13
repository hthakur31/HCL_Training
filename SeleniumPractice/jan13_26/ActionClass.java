package jan13_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*Action class methods for Mouse Action
	click()- left click
	contextClick() - for right click using mouse
	moveToElement(web element)
	doubleClick()
	clickActionHold()
	dragAndDrop(source, target)
	We have to perform operation after each and every method using -
	perform()
 */
public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("F:\\eclipse-java-2025-09-R-win32-x86_64\\HCL_Training\\SeleniumPractice\\jan13_26\\sample.html");
		Actions a = new Actions(driver);
		//WebElement e1 = driver.findElement(By.id("b1"));
		//a.click(e1);
		//a.clickAndHold();
		//a.doubleClick();
		//a.contextClick();
		
//		WebElement e2 = driver.findElement(By.tagName("a"));
//		a.moveToElement(e2);
//		a.click();
		
		WebElement e3 = driver.findElement(By.id("dragable"));
		WebElement e4 = driver.findElement(By.id("dropable"));
		a.dragAndDrop(e3, e4);
		a.perform();		
		Thread.sleep(5000);
		driver.close();
	}
}
