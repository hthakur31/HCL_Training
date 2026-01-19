package csvtest;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class XcelTest {

	public static void main(String[] args) throws IOException{
	
		WebDriver driver = new ChromeDriver();
		OPCPackage pkg = OPCPackage.open("");
		XSSWorkbook workbook  = new XSSWorkbook(pkg);
		Sheet sheet = workbook.getSheetAt(0);
		for(int i = 1; i<=sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			String username = rowcell[0].getStringValue();
			String password = rowcell[1].getStringValue();
			driver.get("");
			driver.findElement(By.id("")).sendKeys(username);
			driver.findElement(By.id("")).sendKeys(password);
			driver.findElement(By.xpath("")).click();
			driver.close();
			
		}
	}

}
