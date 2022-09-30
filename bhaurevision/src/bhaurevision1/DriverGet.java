package bhaurevision1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGet {
	
	void flipkart(WebDriver driver) throws Exception
	{
		driver.get("https://www.flipkart.com/");
		
		String a = driver.getTitle();
		System.out.println(a);
		
		driver.get("https://www.google.com/");
		String b = driver.getTitle();
		System.out.println(b);
		
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
	}
	
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Prasad\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		DriverGet obj = new DriverGet();
		obj.flipkart(driver);
	
	}

}
