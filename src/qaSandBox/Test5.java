package qaSandBox;

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

public class Test5 {
	private String email = "pavlestanojevic995@gmail.com";
	private String pw = "257984136";
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Glen\\Desktop\\poi\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test

	// Testing login : Valid Email - Valid Password

	public void one() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		LoginPage log = new LoginPage(driver);
		Thread.sleep(5000);
		driver.navigate().to(Client.SANDBOX);
		log.enterEmail(email);
		log.enterPw(pw);
		Thread.sleep(2000);
		log.clickLoginButton();
		Thread.sleep(1000);
		String a = driver.getCurrentUrl();
		Assert.assertTrue(a.contains("dashboard"));
		driver.quit();
	
	}
}

