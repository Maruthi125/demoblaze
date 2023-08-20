package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	WebDriver driver;
	
	public Login (WebDriver driver) {
		this.driver =driver;
	}
	
	
	private By Loginbutton = By.id("login2");
	private By Lusername = By.id("loginusername");
	private By Lpassword = By.id("loginpassword");
	private By Lclick=  By.xpath("//button[contains(text(),'Log in')]");
	
	
	public WebElement Loginbutton() {
		
		return driver.findElement(Loginbutton);
	}
public WebElement Lusername() {
		
		return driver.findElement(Lusername);
}
public WebElement Lpassword() {

	return driver.findElement(Lpassword);
}
public WebElement Lclick() {

	return driver.findElement(Lclick);
}

}
		

