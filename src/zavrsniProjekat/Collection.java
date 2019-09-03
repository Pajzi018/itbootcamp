package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Collection {
	static WebDriver driver;

	// private String email = "glenspamm@gmail.com";
	// private String pw = "257984136";

	public Collection(WebDriver driver) {
		this.driver = driver;
	}

	private static WebElement AboutButton() {
		return driver.findElement(By.cssSelector("a#tabby-about-finder"));
	}

	private static List<WebElement> radioButtons() {
		return driver.findElements(By.cssSelector("div.search-options.js-search-options.is-open label input"));
	}

	private static List<WebElement> moreLinks() {
		return driver.findElements(By.cssSelector("div.columns-facets a:nth-child(2)"));
	}

	private static WebElement searchThisCollectionBar() {
		return driver.findElement(By.cssSelector("input.form-control.input-sm.searchlist"));
	}

	private static List<WebElement> videoResults() {
		return driver.findElements(By.cssSelector("div.tile-img"));
	}

	private static List<WebElement> moreCheckboxes() {
		return driver.findElements(By.cssSelector("div#morf-page div.facell input"));
	}

	private static List<WebElement> PlayShare() {
		  return  driver.findElements(By.cssSelector("col-xs-1 col-sm-2 welcome-right")); }

	private static WebElement videoCount() {
		return driver.findElement(By.cssSelector("results_count"));
	}

	
	public void clickAbout() {
		AboutButton().click();
	}

	public void printCount() {
		
		System.out.println(videoCount().getText());
	}

	public void getMoreCheckboxes(Integer index) {
		moreCheckboxes().get(index).click();
	}
	public void getPlayShare(Integer index) {
		PlayShare().get(index).click();
	}

}

/*
 * 
 * package zavrsniProjekat;
 * 
 * import java.util.List;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.Keys; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.firefox.FirefoxDriver;
 * 
 * public class Collection { static WebDriver driver;
 * 
 * // private String email = "glenspamm@gmail.com"; // private String pw =
 * "257984136";
 * 
 * public Collection(WebDriver driver) { this.driver = driver; }
 * 
 * private static List<WebElement> Collections() { return
 * driver.findElements(By.cssSelector("spam.big-label.blue-pop a")); }
 * 
 * private static List<WebElement> ItemCollection() { return
 * driver.findElements(By.cssSelector("div.item-ia.hov")); }
 * 
 * private static List<WebElement> MediaType() { return
 * driver.findElements(By.cssSelector(".facet-mediatype label")); }
 * 
 * private static WebElement CountResult() { return
 * driver.findElement(By.cssSelector(".results_count")); }
 * 
 * private static WebElement MoreButtonMedia() { return
 * driver.findElement(By.cssSelector(".facet_mediatype > a:nth-child(2)")); }
 * private static List<WebElement> Year() { return
 * driver.findElements(By.cssSelector("div.fatable.facet-mediatype input"));
 * 
 * }
 * 
 * private static WebElement MoreYear() { return
 * driver.findElement(By.cssSelector(".facet_year > a:nth-child(2)")); }
 * 
 * 
 * private static List<WebElement> Topics() { return driver.findElements(By.
 * cssSelector("div.fatable.facet-subject label.farow input")); }
 * 
 * private static WebElement MoreTopics() { return
 * driver.findElement(By.cssSelector(".facet_subject > a:nth-child(2)")); }
 * 
 * private static List<WebElement> Collect() { return driver.findElements(By.
 * cssSelector("div.facet_collection.collapse label input")); }
 * 
 * private static WebElement MoreCollect() { return
 * driver.findElement(By.cssSelector(".facet_collection > a:nth-child(2)")); }
 * 
 * 
 * private static WebElement MoreCreator() { return
 * driver.findElement(By.cssSelector(".facet_creator > a:nth-child(2)")); }
 * 
 * private static List<WebElement> Language() { return
 * driver.findElements(By.cssSelector("div.facet_languageSorter.collapse input")
 * ); }
 * 
 * private static WebElement MoreLanguage() { return
 * driver.findElement(By.cssSelector(".facet_languageSorter > a:nth-child(2)"));
 * }
 * 
 * private static List<WebElement> DeepChoice() { return
 * driver.findElements(By.cssSelector("div.fatable.facet-subject input")); }
 * 
 * // SEARCH THIS COLLECTION private static WebElement SearchThisCollection() {
 * return driver.findElement(By.cssSelector("input.form-control:nth-child(1)"));
 * }
 * 
 * // PLAY OPTIONS / SHARE... private static List<WebElement> PlayShare() {
 * return
 * driver.findElements(By.cssSelector("col-xs-1 col-sm-2 welcome-right")); }
 * 
 * public void getCollections(Integer index) { Collections().get(index).click();
 * }
 * 
 * public void getItemCollection(Integer index) {
 * ItemCollection().get(index).click(); }
 * 
 * public void getMediaType(Integer index) { MediaType().get(index).click(); }
 * 
 * public void seeCountResult() { System.out.println(CountResult().getText()); }
 * 
 * public void clickMoreButtonMedia() { MoreButtonMedia().click(); }
 * 
 * public void getDeeChoice(Integer index) { DeepChoice().get(index).click(); }
 * 
 * public void clickYear(Integer index) { Year().get(index).click(); }
 * 
 * public void clickMoreYear() { MoreYear().click(); }
 * 
 * 
 * 
 * public void getTopics(Integer index) { Topics().get(index).click(); }
 * 
 * public void getMoreTopics() { MoreTopics().click(); }
 * 
 * 
 * 
 * public void getCollect(Integer index) { Collect().get(index).click(); }
 * 
 * public void clickMoreCollect() { MoreCollect().click(); }
 * 
 * 
 * 
 * public void getCreator(Integer index) { Creator().get(index).click(); }
 * 
 * public void getMoreCreator() { MoreCreator().click(); }
 * 
 * public void getCreatorChoice(Integer index) {
 * CreatorChoice().get(index).click(); }
 * 
 * public void getLanguage(Integer index) { Language().get(index).click(); }
 * 
 * public void clickMoreLanguage() { MoreLanguage().click(); }
 * 
 * public void getLanguageChoice(Integer index) {
 * LanguageChoice().get(index).click(); }
 * 
 * public void getPlayShare(Integer index) { PlayShare().get(index).click(); }
 * 
 * // SEARCH THIS COLLECTION public void clickSearchThisCollection() {
 * SearchThisCollection().sendKeys("Test", Keys.ENTER); }
 * 
 * }
 */
