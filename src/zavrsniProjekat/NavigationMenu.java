package zavrsniProjekat;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationMenu extends Base {

	static WebDriver driver;

	public NavigationMenu(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// NAVIGATION ELEMENTS - WEB
	
	private static List<WebElement> Navigation(){
		return driver.findElements(By.cssSelector("ul.nav.navbar-nav.navbar-main li.dropdown-ia"));
	}
	private static WebElement WebIcon() {
		return driver.findElement(By.cssSelector(
				"#navwrap2 > div.navbar.navbar-inverse.navbar-static-top > ul.nav.navbar-nav.navbar-main > li:nth-child(1) > a > span.iconochive-web"));
	}

	private static WebElement WebSearch() {
		return driver.findElement(By.cssSelector("#nav-wb-url"));
	}

	private static WebElement WebPagesHistory() {
		return driver.findElement(By.cssSelector(".wayback-txt > a:nth-child(1)"));
	}

	// TEXTS
	private static WebElement Texts() {
		return driver.findElement(By.cssSelector(
				"#navwrap2 > div.navbar.navbar-inverse.navbar-static-top > ul.nav.navbar-nav.navbar-main > li.dropdown.dropdown-ia.pull-left.hatted > a > span.iconochive-texts"));
	}

	private static WebElement BooksToBorrow() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.texts > div.col-sm-2.col-xs-5.col-sm-pull-2 > div > center > div > a"));
	}

	private static WebElement OpenLibrary() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.texts > div.col-sm-2.col-xs-5.col-sm-pull-4 > div > center > div > a"));
	}

	private static List<WebElement> BooksFeatured() {
		return driver.findElements(By.cssSelector("div.row:nth-child(2) > div:nth-child(1) > div:nth-child(1) a"));
	}

	private static List<WebElement> BooksTop() {
		return driver.findElements(By.cssSelector("div.row:nth-child(2) > div:nth-child(3) > div:nth-child(1) a"));
	}

	private static List<WebElement> BooksAdditionalFeature() {
		return driver.findElements(By.cssSelector("div.row:nth-child(2) > div:nth-child(5) > div:nth-child(1) a"));
	}

	// VIDEO
	private static WebElement Video() {
		return driver.findElement(By.cssSelector(
				"#navwrap2 > div.navbar.navbar-inverse.navbar-static-top > ul.nav.navbar-nav.navbar-main > li.dropdown.dropdown-ia.pull-left.hatted > a > span.iconochive-movies"));
	}

	private static WebElement TvNews() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.movies > div.col-sm-2.col-xs-5.col-sm-pull-2 > div > center > div > a"));
	}

	private static WebElement Nav911() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.movies > div.col-sm-2.col-xs-5.col-sm-pull-4 > div > center > div > a"));
	}

	private static List<WebElement> VideoFeatured() {
		return driver.findElements(By.cssSelector("div.row:nth-child(3) > div:nth-child(1) > div:nth-child(1) a"));
	}

	private static List<WebElement> VideoTop() {
		return driver.findElements(By.cssSelector("div.row:nth-child(3) > div:nth-child(3) > div:nth-child(1) a"));
	}

	private static List<WebElement> VideoAdditional() {
		return driver.findElements(By.cssSelector("div.row:nth-child(3) > div:nth-child(5) > div:nth-child(1) a"));
	}

	// AUDIO
	private static WebElement Audio() {
		return driver.findElement(By.cssSelector(
				"#navwrap2 > div.navbar.navbar-inverse.navbar-static-top > ul.nav.navbar-nav.navbar-main > li.dropdown.dropdown-ia.pull-left.hatted > a > span.iconochive-audio"));
	}

	private static WebElement LiveMusic() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.audio > div.col-sm-2.col-xs-5.col-sm-pull-2 > div > center > div > a"));
	}

	private static WebElement Audiobooks() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.audio > div.col-sm-2.col-xs-5.col-sm-pull-4 > div > center > div > a"));
	}

	private static List<WebElement> AudioFeatured() {
		return driver.findElements(By.cssSelector("div.toprow:nth-child(3) > div:nth-child(1) > div:nth-child(1) a"));
	}

	private static List<WebElement> AudioTop() {
		return driver.findElements(By.cssSelector("div.toprow:nth-child(3) > div:nth-child(3) > div:nth-child(1) a"));
	}

	private static List<WebElement> AudioAdditional() {
		return driver.findElements(By.cssSelector("div.toprow:nth-child(3) > div:nth-child(5) > div:nth-child(1) a"));
	}

	// SOFTWARE
	private static WebElement Software() {
		return driver.findElement(By.cssSelector(
				"#navwrap2 > div.navbar.navbar-inverse.navbar-static-top > ul.nav.navbar-nav.navbar-main > li.dropdown.dropdown-ia.pull-left.hatted > a > span.iconochive-software"));
	}

	private static WebElement SoftwareArcade() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.software > div.col-sm-2.col-xs-5.col-sm-pull-2 > div > center > div > a"));
	}

	private static List<WebElement> SoftwareFeatured() {
		return driver.findElements(By.cssSelector("div.row:nth-child(4) > div:nth-child(1) > div:nth-child(1) a"));
	}

	private static List<WebElement> SoftwareTop() {
		return driver.findElements(By.cssSelector("div.row:nth-child(4) > div:nth-child(1) > div:nth-child(1) a"));
	}

	private static List<WebElement> SoftwareAdditional() {
		return driver.findElements(By.cssSelector("div.row:nth-child(4) > div:nth-child(5) > div:nth-child(1) a"));
	}

	// IMAGE
	private static WebElement Image() {
		return driver.findElement(By.cssSelector(
				"#navwrap2 > div.navbar.navbar-inverse.navbar-static-top > ul.nav.navbar-nav.navbar-main > li.dropdown.dropdown-ia.pull-left.rightmost.hatted > a > span.iconochive-image"));
	}

	private static WebElement ImageMetropolitanMuseum() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.image > div.col-sm-2.col-xs-5.col-sm-pull-2 > div > center > div > a"));
	}

	private static WebElement ImageBrooklynMuseum() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.image > div.col-sm-2.col-xs-5.col-sm-pull-4 > div > center > div > a"));
	}

	private static List<WebElement> ImageFeatured() {
		return driver.findElements(By.cssSelector("div.row:nth-child(5) > div:nth-child(1) > div:nth-child(1) a"));
	}

	private static List<WebElement> ImageTop() {
		return driver.findElements(By.cssSelector("div.row:nth-child(5) > div:nth-child(3) > div:nth-child(1) a"));
	}

	private static List<WebElement> ImageAdditional() {
		return driver.findElements(By.cssSelector("div.row:nth-child(5) > div:nth-child(5) > div:nth-child(1) a"));
	}

	// LOGO
	private static WebElement Logo() {
		return driver.findElement(By.cssSelector(
				"#navwrap2 > div.navbar.navbar-inverse.navbar-static-top > ul.nav.navbar-nav.navbar-main > li.navbar-brand-li > a > span.iconochive-logo"));
	}

	// SignIN
	private static WebElement SignIn() {
		return driver.findElement(By.cssSelector(".nav-user"));
	}

	// UPLOAD
	private static WebElement Upload() {
		return driver.findElement(By.cssSelector(".nav-upload"));

	}

	// 9 ICONS (List / Search / Go button )
	private static List<WebElement> NineIcons() {
		return driver.findElements(By.cssSelector("center.mt-big a"));
	}

	private static WebElement Search() {
		return driver.findElement(By.cssSelector("input.form-control:nth-child(2)"));

	}

	private static WebElement Go() {
		return driver.findElement(By.cssSelector("button.btn"));

	}

	// Announcements
	private static WebElement SeeMore() {
		return driver.findElement(By.cssSelector("div.col-sm-3:nth-child(3) > div:nth-child(4) > a:nth-child(1)"));
	}

	private static WebElement AdvancedSearch() {
		return driver.findElement(By.cssSelector(".search-options__advanced-search-link"));
	}

	private static List<WebElement> TopCollections() {
		return driver.findElements(By.cssSelector("div.item-ia.collection-ia"));
	}
	private static WebElement GlenTest() {
		return driver.findElement(By.cssSelector("#user-menu"));
	}
	private static List<WebElement>TopCollectionItems() {
		return driver.findElements(By.cssSelector("div.results div.item-ia.collection-ia div div.num-items.topinblock"));
	}
	//

// actions
	public void clickNavigation(Integer index) {
		Navigation().get(index).click();
	}
	public void clickWebIcon() {
		WebIcon().click();
	}

	public void clickWebSearch() {
		WebSearch().click();
	}

	public void clickWebPagesHistory() {
		WebPagesHistory().sendKeys("Test", Keys.ENTER);
	}

	public void clickTexts() {
		Texts().click();
	}

	public void clickBooksToBorrow() {
		BooksToBorrow().click();
	}
	public void clickOpenLibrary() {
		OpenLibrary().click();
	}

	public void clickVideo() {
		Video().click();
	}

	public void clickTvNews() {
		TvNews().click();
	}

	public void click911() {
		Nav911().click();
	}

	public void clickAudio() {
		Audio().click();
	}

	public void clickLiveMusic() {
		LiveMusic().click();
	}

	public void getBookFeatured(Integer index) {
		BooksFeatured().get(index).click();
	}

	public void getBookTop(Integer index) {
		BooksTop().get(index).click();
	}

	public void getBookAdditional(Integer index) {
		BooksAdditionalFeature().get(index).click();
	}

	public void getVideoFeatured(Integer index) {
		VideoFeatured().get(index).click();
	}

	public void getVideoTop(Integer index) {
		VideoTop().get(index).click();
	}

	public void getVideoAdditional(Integer index) {
		VideoAdditional().get(index).click();
	}

	public void getAudioFeatured(Integer index) {
		AudioFeatured().get(index).click();
	}

	public void getAudioTop(Integer index) {
		AudioTop().get(index).click();
	}

	public void getAudioAdditional(Integer index) {
		AudioAdditional().get(index).click();
	}

	public void getSotrwareFeatured(Integer index) {
		SoftwareFeatured().get(index).click();
	}

	public void getSoftwareTop(Integer index) {
		SoftwareTop().get(index).click();
	}

	public void getSoftwareAdditional(Integer index) {
		SoftwareAdditional().get(index).click();
	}

	public void getImageFeatured(Integer index) {
		ImageFeatured().get(index).click();
	}

	public void getImageeTop(Integer index) {
		ImageTop().get(index).click();
	}

	public void getImageAdditional(Integer index) {
		ImageAdditional().get(index).click();
	}

	public void getNineIcons(Integer index) {
		NineIcons().get(index).click();
	}

	public void clickAudiobooks() {
		Audiobooks().click();
	}

	public void clickSoftware() {
		Software().click();
	}

	public void clickSoftwareArcade() {
		SoftwareArcade().click();
	}

	public void clickImage() {
		Image().click();
	}

	public void clickImageMetropolitanMuseum() {
		LiveMusic().click();
	}

	public void clickImageBrooklynMuseum() {
		ImageBrooklynMuseum().click();
	}

	public void clickLogo() {
		Logo().click();
	}

	public void clickSignIn() {
		SignIn().click();
	}

	public void clickUpload() {
		Upload().click();
	}

	public void clickSearch(String s) {
		Search().sendKeys(s);
	}

	public void clickGo() {
		Go().click();
	}

	public void clickSeeMore() {
		SeeMore().click();
	}

	public void clickAdvancedSearch() {
		AdvancedSearch().click();
	}

	public int getTopCollections() {
		return TopCollections().size();
		
		
	}
	
	public void clickGlenTest() {
		GlenTest().click();
	}
	public List<WebElement> countTopCollections() {
        return TopCollections();
    }
    
    public int countItems() {
        int counter = 0;
        for (WebElement e : countTopCollections()) {
            
            if (e.findElement(By.cssSelector("div.micro-label")).getText().equalsIgnoreCase("items")) {
                counter +=1;
            }
        }
        return counter;
    }
    public boolean NumberTopCollections() {
    	return driver.findElement(By.cssSelector("div.micro-label")).getText().equalsIgnoreCase("2,009,586");
		 
    }
    public static boolean DropSearchVisible() {
    	return driver.findElement(By.cssSelector("div.search-options.js-search-options.is-open")).isDisplayed();
    }

	/*
	 * public void sendKeysInputBox(String SEARCH_TERM) {
	 * inputSearchBox().sendKeys(SEARCH_TERM); }
	 * 
	 * public void clickOnDropCity() { dropCity().click(); }
	 * 
	 * public void clickOnDropArea() { dropArea().click(); }
	 * 
	 * public void clickOnSearchButton() { buttonSearch().click(); }
	 */

}
