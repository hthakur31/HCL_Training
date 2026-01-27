 package jan21_26;

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
	
	public void testRegistration(String user, String pass ) {
		username.sendKeys(user);
		password.sendKeys(pass);
		radio.click();
		btnSubmit.click();
	}
}
