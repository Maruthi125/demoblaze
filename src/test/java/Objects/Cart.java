package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
	
	WebDriver driver;
	
	public Cart(WebDriver driver) {
	
	this.driver = driver;
	
	}
	
	private By lumia = By.xpath("//a[contains(text(),'Nokia lumia 1520')]");
	private By cart = By.xpath("//a[contains(text(),'Add to cart')]");
	
	public WebElement lumia() {

		return driver.findElement(lumia);

	}
	
	public WebElement cart() {

		return driver.findElement(cart);
	}
	}


