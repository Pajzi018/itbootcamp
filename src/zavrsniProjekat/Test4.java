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

public class Test4 {

	public static final String SEARCH_THIS = "java";

	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\DELL\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void quatro() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		

		NavigationMenu nmenu = new NavigationMenu(driver);

		driver.navigate().to(WebUrl.ARCHIVE);
		nmenu.clickSearch("QA");
		Assert.assertTrue(nmenu.DropSearchVisible());
		nmenu.clickGo();
		nmenu.urlToBe("https://archive.org/search.php?query=QA");
		String a = driver.getCurrentUrl();
		System.out.println(a);
		Assert.assertTrue(a.contains("query=QA"));
		System.out.println(a);
		driver.close();
		

	}
}