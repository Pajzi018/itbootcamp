package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ProjectPage {
	static WebDriver driver;

	public ProjectPage(WebDriver driver) {
		this.driver = driver;
	}

	private static List<WebElement> Projects() {
		return driver.findElements(By.cssSelector("div.col-sm-3 a"));
	}

	public void getProjects(Integer index) {
		System.out.println(Projects().size());
	}
}