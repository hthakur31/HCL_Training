
class loginPage {
	WebDriver driver;
	By user = By.id("Login1_UserName");
	By pass = By.id("Login1_Password");
	By btn = By.xpath("//input[@id='Login1_LoginButton']");
	
	loginPage(WebDriver driver){
		this.driver = driver;
	}
	public void username(){
		driver.findElement(user).sendKeys("admin");
	}
	public void password(){
		driver.findElement(pass).sendKeys("admin@123");
	}
	public void loginclick(){
		driver.findElement(btn).click();
	}
}