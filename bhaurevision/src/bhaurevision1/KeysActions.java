package bhaurevision1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class KeysActions {
	void websiteconnect(WebDriver driver)
	{
		String url = "https://www.redbus.in/";
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}
	void keyEvents(WebDriver driver) throws Exception {
		WebElement source=driver.findElement(By.id("src"));
		WebElement dest=driver.findElement(By.id("dest"));
		Actions act =new Actions(driver);
		source.sendKeys("aurangabad");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		dest.sendKeys("pune");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("C:\\Users\\Prasad\\Desktop\\IMP\\Prasad Notes\\screenshot.png"));
		
		
	}
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//We will connect selenium webDriver object with remote driver object
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		KeysActions obj = new KeysActions();
		obj.websiteconnect(driver);
		obj.keyEvents(driver);

	}

}
