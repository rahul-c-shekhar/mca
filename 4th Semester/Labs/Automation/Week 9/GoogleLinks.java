package pes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.WebElement;

public class GoogleLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
				
		//To get address of all links
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
				
		//To count number of links
		int count = allLinks.size();
		System.out.println("Size : "+count);
				
		//To print all links
		for(int i=0;i<count;i++)
		{
			WebElement link = allLinks.get(i);
			System.out.println(link.getText());
		}
				
		driver.close();

	}

}
