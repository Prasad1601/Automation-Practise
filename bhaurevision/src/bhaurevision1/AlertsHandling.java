package bhaurevision1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {
	
	void websiteconnect(WebDriver driver)
	{
		String url = "https://demoqa.com/alerts";
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}
	
	void alert(WebDriver driver) throws Exception
	{
		WebElement button = driver.findElement(By.id("confirmButton"));
		button.click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		button.click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement button1 = driver.findElement(By.id("promtButton"));
		button1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("prasad");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(2000);
		driver.close();
		
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Establish the connection between Selenium and Java
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//We will connect selenium webDriver object with remote driver object
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		AlertsHandling obj = new AlertsHandling();
		obj.websiteconnect(driver);
		obj.alert(driver);
		
	}

}
