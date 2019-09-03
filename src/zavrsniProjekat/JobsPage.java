package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class JobsPage {
	static WebDriver driver;

	public JobsPage(WebDriver driver) {
		this.driver = driver;
	}

	private static List<WebElement> Jobs() {
		return driver.findElements(By.cssSelector("#jobs_table tr td a"));
	}
	private static WebElement SearchBox() {
		return driver.findElement(By.cssSelector("#q"));
	}
	private static WebElement SearchButton() {
		return driver.findElement(By.cssSelector("#btn_search_jobs"));
	}
	private static WebElement AdvancedSearch() {
		return driver.findElement(By.cssSelector("#link_show_advanced_search"));
	}
	public void getJobs(Integer index) {
		System.out.println(Jobs().size());
	}
	public void clickSearchBox(String s) {
		SearchBox().sendKeys(s);
	}
	public void clickSearch() {
		SearchButton().click();
	}
	public void clickAdvancedSearch() {
		AdvancedSearch().click();
	}
}