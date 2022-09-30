package bhaurevision1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollHandling {

	void websiteconnect(WebDriver driver)
	{
		String url = "https://www.redbus.in/";
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}

	void scroll(WebDriver driver) throws Exception
	{
		WebElement scr = driver.findElement(By.xpath("//*[@class='footer-row  ']"));
		scr.click();
		
		  JavascriptExecutor var = (JavascriptExecutor) driver;
		  var.executeScript("arguments[0].scrollIntoView()", scr);
		  
		  Thread.sleep(2000); scr.click(); Thread.sleep(2000);
		 
		
		
		/*
		 * Actions act = new Actions(driver);
		 * act.scrollToElement(scr).build().perform(); Thread.sleep(3000); WebElement
		 * top = driver.findElement(By.xpath("//*[@id='welcome_image_div']"));
		 * act.scrollToElement(top).build().perform(); Thread.sleep(3000); WebElement
		 * middle = driver.findElement(By.xpath("//*[@class='aw main-body']"));
		 * act.scrollToElement(middle).build().perform(); Thread.sleep(2000);
		 */
		
	}
	
	void handlingkeyboard(WebDriver driver) throws Exception
	{
		WebElement source = driver.findElement(By.id("src"));
		//source.click();
		Actions actn = new Actions(driver);
		Thread.sleep(3000);
		actn.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		source.sendKeys("hello");
		Thread.sleep(2000);
		actn.sendKeys(Keys.TAB).perform();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Establish the connection between Selenium and Java
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//We will connect selenium webDriver object with remote driver object
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		ScrollHandling obj = new ScrollHandling();
		obj.websiteconnect(driver);
		obj.scroll(driver);
		//obj.handlingkeyboard(driver);

	}

}
