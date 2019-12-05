package pes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleToNaukri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/student/workspace4/Automation/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://naukri.com");
		
		driver.quit();

	}

}
