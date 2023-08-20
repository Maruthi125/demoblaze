package P.Demoblaze;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objects.Login;
import Objects.purchase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PURCHASE {
	
	@Test	
	public void Purchase(){
			
			WebDriverManager.chromedriver().setup();
			 WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.get("https://www.demoblaze.com/");

			 purchase purchase = new purchase(driver);
			 purchase.Cartt().click();
			 purchase.placeorder().click();
			 purchase.name().sendKeys("Leo");
			 purchase.country().sendKeys("india");
			 purchase.city().sendKeys("Hyderabad");
			 purchase.card().sendKeys("123445678900");
			 purchase.month().sendKeys("02");
			 purchase.year().sendKeys("24");
			 purchase.purchasee().click();
			 
			 
	}
}
