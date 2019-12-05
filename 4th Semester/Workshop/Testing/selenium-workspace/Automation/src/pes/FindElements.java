package pes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///home/rahul-c-shekhar/Dropbox/MCA/4th%20Semester/Testing%20Seminar/FindElements.html");
		
		List<WebElement> allBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int	n = allBoxes.size();
		System.out.println("Number of checkboxes : "+n);
		
		for(int i = 0; i < n; i++)
		{
			WebElement box = allBoxes.get(i);
			box.click();
			Thread.sleep(1000);
		}
		
		
	}
	

}
