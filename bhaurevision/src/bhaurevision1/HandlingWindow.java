package bhaurevision1;

import java.time.Duration;
import java.util.Set;
import java.util.*;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {
	
	void websiteconnect(WebDriver driver)
	{
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}

	void handlingnew(WebDriver driver)
	{
		String handle = driver.getWindowHandle();
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement button = driver.findElement(By.id("openwindow"));
		button.click();
		
		Set<String> OpenWindows = driver.getWindowHandles();
		
		java.util.Iterator<String> handles = OpenWindows.iterator();
		
		while(handles.hasNext())
		{
			String newwindow = (String) handles.next();
			
			if(!handle.equalsIgnoreCase(newwindow))
			{
				driver.switchTo().window(newwindow);
				String newwindowhandle = driver.getTitle();
				System.out.println(newwindowhandle);
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

		HandlingWindow obj = new HandlingWindow();
		obj.websiteconnect(driver);
		obj.handlingnew(driver);
	}

}
