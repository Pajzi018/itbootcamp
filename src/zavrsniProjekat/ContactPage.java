package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ContactPage {
	static WebDriver driver;

	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}
	//ELEMENTS
		private static WebElement MapOne() {
			return driver.findElement(By.cssSelector(".col-md-9 > a:nth-child(5)"));
		}
		private static WebElement MapTwo() {
			return driver.findElement(By.cssSelector(".col-md-9 > font:nth-child(20) > font:nth-child(2) > font:nth-child(2) > font:nth-child(23) > font:nth-child(17) > a:nth-child(7)"));
		}
		
		public void clickMapOne() {
			MapOne().click();
		}
		public void clickMapTwo() {
			MapTwo().click();
		}
	
}
