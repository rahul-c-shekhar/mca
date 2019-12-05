package pes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///home/student/Example1.html");
		
		WebElement link = driver.findElement(By.id("username"));
		String text = link.getAttribute("value");
		System.out.println("Text: " +text);
		
		driver.findElement(By.id("username")).clear();
		
		//driver.quit();

	}

}
