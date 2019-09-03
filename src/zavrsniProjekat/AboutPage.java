package zavrsniProjekat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AboutPage {
	static WebDriver driver;

	public AboutPage(WebDriver driver) {
		this.driver = driver;
	}
	//ELEMENTS
	private static List<WebElement> ReadMore() {
		return driver.findElements(By.cssSelector(".c1nav a"));
	}
	private static List<WebElement> NewsList() {
		return driver.findElements(By.cssSelector(".forumTable tr"));
	}
	private static WebElement MemberALA() {
		return driver.findElement(By.cssSelector(".col-md-3 > center:nth-child(6) > a:nth-child(2) > img:nth-child(1)"));
	}
	private static WebElement NewsMore() {
		return driver.findElement(By.cssSelector(".box > h1:nth-child(1) > a:nth-child(1)"));
	}
	

	

	
	//ACTIONS
	
	public void getReadMore(Integer index) {
		System.out.println(ReadMore().size());
	}
	public void getNewsList(Integer index) {
		NewsList().get(index).click();
	}
	public void clickNewsMore() {
		NewsMore().click();
	}
	public void clickMemberAla() {
		MemberALA().click();
	}
}
