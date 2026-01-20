public class verifylogin{

	public static void main(String[] args){
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://onlinefeestechnocrats.in/LoginStudent.aspx?type=F");
		loginPage lp = new loginPage(driver);
		lp.username();
		lp.password();
		lp.loginclick();
	}
}
