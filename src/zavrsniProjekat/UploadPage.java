package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadPage {
	static WebDriver driver;

	//private String email = "glenspamm@gmail.com";
	//private String pw = "257984136";
	
			
	public UploadPage(WebDriver driver) {
		this.driver = driver;
	}
	private static WebElement UploadFile() {
		return driver.findElement(By.cssSelector(".buttonG"));
	}
	private static WebElement LiveMusicUploader() {
		return driver.findElement(By.cssSelector(".btn-primary"));
	}
	private static WebElement QuestionMark() {
		return driver.findElement(By.cssSelector("a.stealth:nth-child(1)"));
	}
	
	public void clickUploadFile() {
		UploadFile().click();
	}
	public void clickLiveMusicUpload() {
		LiveMusicUploader().click();
	}
	public void clickQuestionMark() {
		QuestionMark().click();
	}
	
}


