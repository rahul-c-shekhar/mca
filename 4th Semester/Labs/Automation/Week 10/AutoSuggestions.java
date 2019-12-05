package pes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/student/workspace1/Automation/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("java");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li")));

		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));

		System.out.println("Auto Suggest List :" + list.size());
		for(int i = 0 ;i< list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		driver.close();
		
		
	}

}


