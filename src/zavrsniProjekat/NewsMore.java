package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NewsMore {
	static WebDriver driver;

	public NewsMore(WebDriver driver) {
		this.driver = driver;
	}

	private static WebElement MailBox() {
		return driver.findElement(By.cssSelector(".box > h1:nth-child(1) > a:nth-child(1)"));
	}
	private static List<WebElement> Tabelica() {
		return driver.findElements(By.cssSelector("tr.forumRow td:nth-child(1) a"));
	}
	
	public void getMailBox() {
		MailBox().click();
	}
	public void getTabelica(Integer index) {
		Tabelica().get(index).click();
	}
}