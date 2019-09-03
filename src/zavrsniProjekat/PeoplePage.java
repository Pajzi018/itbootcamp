package zavrsniProjekat;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PeoplePage {
	static WebDriver driver;

	public PeoplePage(WebDriver driver) {
		this.driver = driver;
	}

	private static List<WebElement> People() {
		return driver.findElements(By.cssSelector("div.bio:nth-child(1) > div"));
	}
	public void StringList() {
        List <String> imena = new ArrayList<String>();
        for (int i=0; i<People().size(); i++) {
            String a = People().get(i).findElement(By.cssSelector("b")).getText();
            String b = People().get(i).findElement(By.cssSelector("i")).getText();
            String c = (a + " " + b);
            imena.add(c);
        }
        
        for (int i = 0; i<imena.size(); i++) {
            System.out.println(imena.get(i));
        }
    }
}