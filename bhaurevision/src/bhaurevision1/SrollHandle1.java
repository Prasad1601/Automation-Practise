package bhaurevision1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SrollHandle1 {
	void websiteconnect(WebDriver driver)
	{
		String url = "https://www.redbus.in/";
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}
	void scrollbyJS(WebDriver driver) throws Exception {
		WebElement src=driver.findElement(By.xpath("//*[@class='footer-row  ']"));
		//src.click();
		WebElement cetr=driver.findElement(By.xpath("//*[@class=\"flag-cont clearfix rest1 animate\"]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", src );		
		Thread.sleep(2000); 
		src.click();
		js.executeScript("arguments[0].scrollIntoView()", cetr);
		Thread.sleep(2000);
		cetr.click();
	}
	void scrollbyActions(WebDriver driver) throws Exception {
		WebElement src=driver.findElement(By.xpath("//*[@class='footer-row  ']"));
		//src.click();
		WebElement cetr=driver.findElement(By.xpath("//*[@class=\"flag-cont clearfix rest1 animate\"]"));
		Actions act=new Actions(driver);
		act.scrollToElement(src).build().perform();
		Thread.sleep(2000);
		act.scrollToElement(cetr).build().perform();
		Thread.sleep(2000);
	}
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//We will connect selenium webDriver object with remote driver object
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		SrollHandle1 obj = new SrollHandle1();
		obj.websiteconnect(driver);
		//obj.scrollbyJS(driver);
		obj.scrollbyActions(driver);


	}

}
