package bhaurevision1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {
	
	void websiteconnect(WebDriver driver)
	{
		String url = "http://jqueryui.com/droppable/";
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}
	
	void Mouse(WebDriver driver) throws Exception
	{
		WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement small = driver.findElement(By.id("draggable"));
		WebElement big = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(small, big).build().perform();
		Thread.sleep(3000);
		driver.close();
	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Establish the connection between Selenium and Java
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//We will connect selenium webDriver object with remote driver object
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		MouseEvents obj = new MouseEvents();
		obj.websiteconnect(driver);
		obj.Mouse(driver);
		
	}
	
}
