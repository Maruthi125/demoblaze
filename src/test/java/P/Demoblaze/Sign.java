package P.Demoblaze;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Objects.Signup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sign {
	

	
	@SuppressWarnings("deprecation")
	@Test
	public void Sig() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.demoblaze.com/");
		 
		 Signup Signup = new Signup(driver);
		 Signup.signinbutton().click();
		 Signup.username().sendKeys("Maruthi'S9461");
		 Signup.password().sendKeys("9461");
		 Signup.Signinclick().click();
		 
		 Thread.sleep(5000);
		 
		 Alert alert = driver.switchTo().alert();
		 String textOnAlert = alert.getText();
		 Thread.sleep(2000);
		 System.out.println(textOnAlert);
		 Thread.sleep(2000);
		 alert.accept();

	}
	
	
	
	
	

}
