package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewSubjectPage {
	static WebDriver driver;

	public NewSubjectPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private static WebElement Subject () {
		return driver.findElement(By.cssSelector("div.box.well.well-sm"));
	}
	
	public void clickSubject() {
		Subject().click();
	}
	
}
