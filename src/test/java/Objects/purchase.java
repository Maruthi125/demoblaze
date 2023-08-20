package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class purchase {
	
	WebDriver driver;
	
	public purchase(WebDriver driver) {
		this.driver=driver;
	}
	
	By cart = By.id("cartur");
	
	
	private By Cartt = By.xpath("//a[contains(text(),'Cart')]");
	private By placeorder = By.xpath("//button[contains(text(),'Place Order')]");
	private By name = By.id("name");
	private By country = By.id("country");
	private By city = By.id("city");
	private By card = By.id("card");
	private By month = By.id("month");
	private By year = By.id("year");
	private By purchasee = By.xpath("//button[contains(text(),'Purchase')]");
	
	public WebElement Cartt() {

		return driver.findElement(Cartt);

	}

	public WebElement placeorder() {

		return driver.findElement(placeorder);

	}
	
	public WebElement name() {

		return driver.findElement(name);

	}
	public WebElement country() {

		return driver.findElement(country);
}
	public WebElement city() {

		return driver.findElement(city);
	}
	public WebElement card() {

		return driver.findElement(card);

	}
	
	public WebElement month() {

		return driver.findElement(month);

	}
	public WebElement year() {

		return driver.findElement(year);
}
	public WebElement purchasee() {

		return driver.findElement(purchasee);
	}
	
}