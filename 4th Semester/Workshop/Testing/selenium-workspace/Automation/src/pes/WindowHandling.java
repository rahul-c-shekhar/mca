package pes;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		String title;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		//To get the address of the parent window
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		Thread.sleep(1000);
		
		//To get the address of all windows
		Set<String> allWh = driver.getWindowHandles();
		
		//To get the number of windows
		int n = allWh.size();
		System.out.println("Number of addresses : "+n);
		
		//To display the addresses of all the windows
		System.out.println("The following are the addresses : ");
		for(String s : allWh)
		{
			System.out.println(s);
			//To display the title of all the windows
			title = driver.switchTo().window(s).getTitle();
			System.out.println(title);
			
			//To close all the child browser windows
			if (s.equals(wh))
			{
				allWh.remove(s);
				continue;
			}
			
			//To close all the browser windows without using the quit()
			driver.switchTo().window(s).close();
			Thread.sleep(1000);
			
			
			//To close a specified window
//			if (title.equals("Fullerton"))
//			{
//				//To switch the control to a specified window
//				break;
//				
//				//driver.close();
//			}
		}
		
		//To maximize the current window
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//To close all the windows
		driver.quit();
	}
}

