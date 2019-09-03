package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Research {
	static WebDriver driver;

	//private String email = "glenspamm@gmail.com";
	//private String pw = "257984136";
	
			
	public Research(WebDriver driver) {
		this.driver = driver;
	}
	private static List<WebElement> Research() {
		return driver.findElements(By.cssSelector(".result-list li"));
	}

	
	public void getResearch(Integer index) {
		Research().get(index).click();;
	
}
}