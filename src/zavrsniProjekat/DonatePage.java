package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DonatePage {
	static WebDriver driver;

	public DonatePage(WebDriver driver) {
		this.driver = driver;
	}

	private static List<WebElement> Donate() {
		return driver.findElements(By.cssSelector("ul.donation-radio-list:nth-child(3) li"));
	}
	
	
	public void getDonate(Integer index, String s) {
		if (index!=7) {
			Donate().get(index).click();
		}else if (index==7) {
			driver.findElement(By.cssSelector("#amount_custom")).sendKeys(s);;
		}
	}
}