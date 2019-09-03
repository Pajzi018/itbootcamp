package zavrsniProjekat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CollectionAbout {
	static WebDriver driver;

	public CollectionAbout(WebDriver driver) {
		this.driver = driver;
	}
	//ELEMENTS
	private static List<WebElement> Contributors() {
		return driver.findElements(By.cssSelector("div.items_list.person"));
	}
	private static List<WebElement> Graphics() {
		return driver.findElements(By.cssSelector("canvas.flot-overlay"));
	}
	private static List<WebElement> RelatedCollect()
	{
		return driver.findElements(By.cssSelector("div.about-box div.topinblock b a"));
	}
	private static WebElement TopTable() {
		return driver.findElement(By.cssSelector("table.stats-table"));
	}
	

	
	//ACTIONS
	
	public void getContributors(Integer index) {
		Contributors().get(index).click();
	}
	public void getGraphics(Integer index) {
		Graphics().get(index).click();
	}
	public void getRelatedCollect(Integer index) {
		RelatedCollect().get(index).click();
	}
	
}
