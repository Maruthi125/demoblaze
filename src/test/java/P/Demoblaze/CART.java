package P.Demoblaze;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objects.Cart;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CART {
	
	
	@Test
	public void cartt() {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.demoblaze.com/");
		 
		 
		 Cart Cart = new Cart(driver);
		 Cart.lumia().click();
		 Cart.cart().click();
		 
		 Alert alert = driver.switchTo().alert();
		 String textOnAlert = alert.getText();
		 System.out.println(textOnAlert);
		 alert.accept();
		 
	}

}
