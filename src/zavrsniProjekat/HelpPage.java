package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class HelpPage {
	static WebDriver driver;

	public HelpPage(WebDriver driver) {
		this.driver = driver;
	}

	private static List<WebElement> Buttons() {
		return driver.findElements(By.cssSelector(".blocks-list li"));
	}
	private static WebElement SearchBar() {
		return driver.findElement(By.cssSelector("#query"));
	}
	private static WebElement SignIn() {
		return driver.findElement(By.cssSelector(".nav-wrapper"));
	}
	public void getButtons(Integer index) {
		Buttons().get(index).click();
	}
	public void clickSearchBar(String s) {
		SearchBar().sendKeys(s, Keys.ENTER);
	}
	public void clickSignIn() {
		SignIn().click();
	}
}