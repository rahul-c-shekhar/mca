package pes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementList {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		
		//To get the address of all the links
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		//To count the number of links
		int	n = allLinks.size();
		System.out.println("Number of links : "+n);
		
		//To print all the links
		System.out.println("The links are : ");
		for(int i = 0; i < n; i++)
		{
			WebElement link = allLinks.get(i);
			String text = link.getText();
			System.out.println(text);
		}
		
		driver.close();
	}
}
