package pes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/student/workspace4/Automation/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("file:///home/student/workspace4/Automation/src/pes/Box.html");
		
		Boolean result = driver.findElement(By.id("username")).isDisplayed();
		
		if (result) {
			System.out.println("Text Box is displayed");
		}
		else {
			System.out.println("Text Box is not displayed");
		}
			
		driver.close();
	}

}
