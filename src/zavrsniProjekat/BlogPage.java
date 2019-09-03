package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BlogPage {
	static WebDriver driver;

	public BlogPage(WebDriver driver) {
		this.driver = driver;
	}
	//ELEMENTS
		private static WebElement FacebookIcon() {
			return driver.findElement(By.cssSelector("a.shareitem:nth-child(1)"));
		}
		private static WebElement TwitterIcon() {
			return driver.findElement(By.cssSelector("a.shareitem:nth-child(2)"));
		}
		private static List<WebElement> NavigationMenu() {
			return driver.findElements(By.cssSelector("#menu-menu li"));
		}
		private static WebElement SearchBox() {
			return driver.findElement(By.cssSelector("#s"));
		}
		private static WebElement Search() {
			return driver.findElement(By.cssSelector("#searchsubmit"));
			
		}
		private static WebElement ArchiveMonth(){
			return driver.findElement(By.cssSelector("#archives-dropdown-2"));
		}
		private static List<WebElement> SearchResultsBlog(){
			return driver.findElements(By.cssSelector("#post-16531"));
		}
		public void clickFacebook() {
			FacebookIcon().click();
		}
		public void clickTwitter() {
			TwitterIcon().click();
		}
		public void getNavigationMenu(Integer index) {
			NavigationMenu().get(index).click();
		}
		public void clickSearchBox(String s) {
			Search().sendKeys(s);
		}
		public void clickSearch() {
			Search().click();
		}
		public void selectArchiveMonth(String s) {
			Select ArchiveMonth = new Select(ArchiveMonth());
			ArchiveMonth.selectByVisibleText(s);
		}
		//#s
}
