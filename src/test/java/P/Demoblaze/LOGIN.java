package P.Demoblaze;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objects.Login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LOGIN {
	@Test
	public void LOGIN() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");

		Login Login = new Login(driver);
		Login.Loginbutton().click();
		Login.Lusername().sendKeys("Maruthi'S999991");
		Login.Lpassword().sendKeys("99999991");
		Login.Lclick().click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String textOnAlert = alert.getText();
		Thread.sleep(2000);
		System.out.println(textOnAlert);
		Thread.sleep(2000);
		alert.accept();

	}
}