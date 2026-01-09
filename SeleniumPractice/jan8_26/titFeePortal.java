package jan8_26;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class titFeePortal {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://onlinefeestechnocrats.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//a[normalize-space()='Online Tuition Fee Payment & No Dues Request']")).click();
		
		boolean isCheck = driver.findElement(By.xpath("//input[@id='rdStu']")).isSelected();
		if(!isCheck) {
			System.out.println("radio button is ready to select");
			driver.findElement(By.xpath("//input[@id='rdStu']")).click();
		}else {
			System.out.println("radio button already selected");
		}
		driver.findElement(By.id("Login1_UserName")).sendKeys("22-23STU18685");
		driver.findElement(By.name("Login1$Password")).sendKeys("31032004");
		driver.findElement(By.className("submit")).click();
		
		Thread.sleep(5000);
		
		String totalFee = driver.findElement(By.xpath("//th[normalize-space()='Total Dues']")).getText();
		String totalFeevalue = driver.findElement(By.xpath("//span[@id='ctl00_cPanel_ExportGridview_ctl02_Label19']")).getText();
		System.out.println(totalFee + " = "+totalFeevalue);
		
		String fee1 = driver.findElement(By.xpath("//label[normalize-space()='Graduation Ceremony@ 1000.00']")).getText();
		String fee2 = driver.findElement(By.xpath("//label[normalize-space()='Placement-AI Even sem@ 3750.00']")).getText();
		String fee3 = driver.findElement(By.xpath("//label[normalize-space()='Semester Reg/Activity Even sem@ 250.00']")).getText();
		
		System.out.println("Miscllaneous Fees : ");
		System.out.println(fee1);
		System.out.println(fee2);
		System.out.println(fee3);
		
		Thread.sleep(3000);
		System.out.println();
		
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		System.out.println("Links in fees pages" + AllLinks.size());
		
		for(WebElement e : AllLinks) {
			
			System.out.println(e.getAttribute("href"));
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
