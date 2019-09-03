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

public class Test3{

	public static final String SEARCH_THIS = "java";

	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\DELL\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void tres() throws Exception {
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
		
		//VolunteerPage walter = new VolunteerPage(driver);
		// Elements elm= new Elements(driver);

		driver.navigate().to(WebUrl.ARCHIVE);
		//nmenu.clickSignIn();
		nmenu.clickNavigation(1);
		nmenu.getBookFeatured(0);
		String a = driver.getCurrentUrl();
		//System.out.println(a);
		driver.navigate().back();                
		nmenu.getNineIcons(1);
		String b = driver.getCurrentUrl();
		//System.out.println(b);
		Assert.assertTrue(a.equals(b));
		driver.close();

	}
}