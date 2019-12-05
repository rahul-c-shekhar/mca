package pes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("unused")
public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		//To open the browser
		driver.get("file:///home/rahul-c-shekhar/Dropbox/MCA/4th%20Semester/Testing%20Seminar/Sample.html");
		
		//By using id
		driver.findElement(By.id("fp")).click();
		driver.navigate().back();
		
		//By using name
		driver.findElement(By.name("pass")).click();
		driver.navigate().back();
		
		//By using className
		driver.findElement(By.className("forgot")).click();
		driver.navigate().back();
		
		//By using tagName
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		
		//By using linkText
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.navigate().back();
		
		//By using partialLinkText
		driver.findElement(By.partialLinkText("Inbox")).click();
		driver.navigate().back();
		
		//By using cssSelector
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Rahul");
		
		//To close the browser window
		driver.close();
	}

}
