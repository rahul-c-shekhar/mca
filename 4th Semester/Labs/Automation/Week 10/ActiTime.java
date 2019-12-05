package pes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ActiTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/student/workspace1/Automation/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		driver.close();

	}

}
