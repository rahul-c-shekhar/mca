package pes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gettext {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///home/rahul-c-shekhar/Dropbox/MCA/4th%20Semester/Testing%20Seminar/xPath.html");
		
		WebElement link = driver.findElement(By.id("g"));
		
		String text = link.getText();
		System.out.println(text);
		
		driver.close();
	}

}
