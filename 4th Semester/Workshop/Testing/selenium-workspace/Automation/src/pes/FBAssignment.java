package pes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FBAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement list1 = driver.findElement(By.id("day"));
		WebElement list2 = driver.findElement(By.id("month"));
		WebElement list3 = driver.findElement(By.id("year"));
		
		Select sel1 = new Select(list1);
		Select sel2 = new Select(list2);
		Select sel3 = new Select(list3);
		
		sel1.selectByVisibleText("3");
		sel2.selectByVisibleText("May");
		sel3.selectByVisibleText("1996");
		
		driver.close();
	}

}
