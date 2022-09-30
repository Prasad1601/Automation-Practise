package bhaurevision1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropDown {
	
	void websiteconnect(WebDriver driver)
	{
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}
	
	void dropdrownselect(WebDriver driver)
	{
		WebElement drop = driver.findElement(By.id("autocomplete"));
		drop.click();
		drop.sendKeys("Ind");
		
		List<WebElement> countries = driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
		
		for(WebElement i : countries)
		{
			System.out.println(i.getText());
			if(i.getText().equalsIgnoreCase("Indonesia"))
			{
				i.click();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Establish the connection between Selenium and Java
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//We will connect selenium webDriver object with remote driver object
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		AutoSuggestedDropDown obj = new AutoSuggestedDropDown();
		obj.websiteconnect(driver);
		obj.dropdrownselect(driver);
	}

}
