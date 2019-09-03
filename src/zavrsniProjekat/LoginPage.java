package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	static WebDriver driver;

	private String email = "glenspamm@gmail.com";
	private String pw = "257984136";
	
			
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private static WebElement LoginEmail () {
		return driver.findElement(By.cssSelector(".input-email"));
	}
	private static WebElement LoginPassword() {
		return driver.findElement(By.cssSelector(".input-password"));
	}
	private static WebElement LoginButton() {
		return driver.findElement(By.cssSelector(".btn"));
	}
	private static WebElement SignInForFree() {
		return driver.findElement(By.cssSelector(".login-header > p:nth-child(3) > a:nth-child(1)"));
	}
	private static WebElement HidePassword() {
		return driver.findElement(By.cssSelector(".password_icon"));
	}
	private static WebElement KeepMeLogged() {
		return driver.findElement(By.cssSelector(".input-checkbox"));
	}
	private static WebElement ForgotPassword() {
		return driver.findElement(By.cssSelector(".reset-password > a:nth-child(1)"));
	}
	private static WebElement ErrorMessage() {
		return driver.findElement(By.cssSelector("span.login-error"));
	}
	//Sign in Procedures //
	private static WebElement TermsOfAgreement() {
		return driver.findElement(By.cssSelector(".terms > a:nth-child(1)"));
	}
	
	
	public void clickLoginEmail(String s) {
		LoginEmail().sendKeys(s);
	}
	public void clickPassword(String s) {
		LoginPassword().sendKeys(s);
	}
	public void clickLoginButton() {
		LoginButton().click();
	}
	public void clickSignInForFree() {
		SignInForFree().click();
	}
	public void clickHidePassword() {
		HidePassword().click();
	}
	public void clickKeepMeLogged() {
		KeepMeLogged().click();
	}
	public void clickForgotPassword() {
		ForgotPassword().click();
	}
	public void getErrorMessage() {
		ErrorMessage().getText();
	}
	public void clickToA() {
		TermsOfAgreement().click();
	}
}
