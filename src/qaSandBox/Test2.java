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

public class Test2 {
	private String email = "pavlestanojevic995@gmail.com";
	private String pw = "257984136";
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Glen\\Desktop\\poi\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test

	// Testing login : Blank Email - valid password

	public void one() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		LoginPage log = new LoginPage(driver);

		driver.navigate().to(Client.SANDBOX);
		log.enterEmail("");
		log.enterPw(pw);
		log.clickLoginButton();
		
		Assert.assertEquals("Email field is required",
				driver.findElement(By.cssSelector("div.form-group:nth-child(1) > div:nth-child(2)")).getText());
		// Assert.assertEquals("Password is required",
		// driver.findElement(By.cssSelector("div.form-group:nth-child(2) >
		// div:nth-child(2)")).getText());

	}

	@Test

	// Testing login : Invalid Email - Invalid password

	public void two() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		LoginPage log = new LoginPage(driver);
		
		log.enterEmail("pavlestanojevic");
		log.enterPw("#@!$þˆY¥$$");
		log.clickLoginButton();
		Assert.assertEquals("Email field is required",driver.findElement(By.cssSelector("div.form-group:nth-child(1) > div:nth-child(2)")).getText());
		driver.quit();
	}
}
