package bhaurevision1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechListicMangesh {
	
	void mangesh(WebDriver driver)
	{
		String url = "https://www.techlistic.com/p/java.html";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement Java = driver.findElement(By.cssSelector("//*[contains(@href,'https://www.techlistic.com/p/java.html') and (@xpath)]"));
		System.out.println(Java.getText());
		Java.click();
	
	}

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//We will connect selenium webDriver object with remote driver object
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		TechListicMangesh obj = new TechListicMangesh();
		obj.mangesh(driver);
		
	}
}
