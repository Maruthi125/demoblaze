package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup {

	WebDriver driver; 
	
	public  Signup(WebDriver driver) {
		this.driver=driver;
	}

	private By signinbutton = By.id("signin2");
	private By username = By.id("sign-username");
	private By password = By.id("sign-password");
	private By Signinclick = By.xpath("//button[contains(text(),'Sign up')]");

	public WebElement signinbutton() {

		return driver.findElement(signinbutton);

	}
	
	public WebElement username() {

		return driver.findElement(username);

	}
	public WebElement password() {

		return driver.findElement(password);
}
	public WebElement Signinclick() {

		return driver.findElement(Signinclick);
	}
}
