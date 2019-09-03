package zavrsniProjekat;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test8 {

	public static final String SEARCH_THIS = "java";

	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\DELL\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void septo() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		AboutPage about = new AboutPage(driver);
		BlogPage blog = new BlogPage(driver);
		ContactPage contact = new ContactPage(driver);
		DonatePage donate = new DonatePage(driver);
		HelpPage help = new HelpPage(driver);
		JobsPage jobs = new JobsPage(driver);
		NavigationMenu nmenu = new NavigationMenu(driver);
		PeoplePage people = new PeoplePage(driver);
		ProjectPage project = new ProjectPage(driver);
		LoginPage log = new LoginPage(driver);
		Collection cl = new Collection(driver);
		CollectionAbout ca = new CollectionAbout(driver);
		// VolunteerPage walter = new VolunteerPage(driver);
		// Elements elm= new Elements(driver);

		driver.navigate().to(WebUrl.PEOPLE);
		people.StringList();
		Thread.sleep(2000);
		
		// Handler
		
		//ArrayList tabs = new ArrayList(driver.getWindowHandles());
		//driver.switchTo().window(tabs.get(1).toString());
		Thread.sleep(2000);
	
		File src = new File("C:\\Users\\DELL\\Desktop\\poi\\zavrsniFajl.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		ArrayList<String> imena = new ArrayList<String>();

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			String baba = sheet.getRow(i).getCell(1).getStringCellValue();
			imena.add(baba);
		}
		for (int g = 0; g < imena.size(); g++) {
			sheet.getRow(g + 1).getCell(7).setCellValue(imena.get(g));
		}
		FileOutputStream fout = new FileOutputStream(src);

		wb.write(fout);
		wb.close();

	}
}
