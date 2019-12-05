package pes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) {
		
		//To open the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//To delete the cookies
		driver.manage().deleteAllCookies();
		
		//To enter the URL
		driver.get("https://www.seleniumhq.org/");
		
		//To enter the URL
		driver.navigate().to("https://www.google.co.in/");
		
		//To navigate to previous page
		driver.navigate().back();
		
		//To navigate to next page
		driver.navigate().forward();
		
		//To navigate to refresh the page
		driver.navigate().refresh();
		
		//To close the window
		driver.close();
	}

}
