package pes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class NumberOfImages {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/home/student/workspace1/Automation/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		
		int counter=0;
		List<WebElement> listImages=driver.findElements(By.tagName("img"));
	    System.out.println("No. of Images: "+listImages.size());
	    for(WebElement image:listImages)
	    {
	         if(image.isDisplayed())
	         {
	                counter++;
	                System.out.println(image.getAttribute("alt"));
	         }
	    }
	    System.out.println("No. of total displable images: "+counter);
	    driver.close();

	}
}


