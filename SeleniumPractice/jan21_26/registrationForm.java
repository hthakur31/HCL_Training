 package jan21_26;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationForm {
	WebDriver driver;
	public registrationForm(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "un") WebElement username;
	@FindBy(id = "ps") WebElement password;
	@FindBy(id = "male") WebElement radio;
	@FindBy(id = "btn") WebElement btnSubmit;
	
	JavascriptExecutor js; 
	public void testRegistration(String user, String pass ) {
//		username.sendKeys(user);
//		password.sendKeys(pass);
//		radio.click();
//		btnSubmit.click();
		
	}
	public void ByJs() {
		js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','user')",username);
		js.executeScript("arguments[0].setAttribute('value','pass')",password);
		js.executeScript("arguments[0].click()",radio);
		js.executeScript("arguments[0].click()",btnSubmit);
	}
}
