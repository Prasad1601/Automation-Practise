package bhaurevision1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {
	
	void websiteconnect(WebDriver driver)
	{
		String url = "https://www.redbus.in/";
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}
	
	void Calender(WebDriver driver) throws Exception {
		
		WebElement from = driver.findElement(By.xpath("//*[@class='fl search-box clearfix']"));
		from.sendKeys("Aurangabad");
		
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Pune");
		
		WebElement cal = driver.findElement(By.id("onward_cal"));
		cal.click();
		
		//WebElement month = driver.findElement(By.className("monthTitle"));
		//month.click();
		//String mon = month.getText();
		//System.out.println(mon);
		
		while(!driver.findElement(By.className("monthTitle")).getText().equalsIgnoreCase("Aug 2022"))
		{
			WebElement next = driver.findElement(By.xpath("//*[@class='next']"));
			next.click();
			Thread.sleep(1000);
		}
		
		/*WebElement date = driver.findElement(By.xpath("//td[contains(text(),'10')]"));
		date.click();
		Thread.sleep(2000);*/
		
		List<WebElement> day = driver.findElements(By.xpath("//*[contains(@class,'day')]"));
		
		for(WebElement l : day)
		{
			if(l.getText().equalsIgnoreCase("19"))
			{
				l.click();
			}
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Establish the connection between Selenium and Java
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//We will connect selenium webDriver object with remote driver object
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		CalenderHandling obj = new CalenderHandling();
		obj.websiteconnect(driver);
		obj.Calender(driver);
		
	}

}
