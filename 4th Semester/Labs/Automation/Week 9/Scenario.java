package pes;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String un = sc.nextLine();
		System.out.println("Enter Password: ");
		String pwd = sc.nextLine();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com/");
		
		String actual_title = driver.getTitle();
		System.out.println("Title: "+actual_title);
		
		String expected_title = "Gmail";
		
		if(actual_title.equalsIgnoreCase(expected_title))
		{
			System.out.println("Passed");
		}
		else
			System.out.println("Failed");
		
		driver.findElement(By.id("identifierId")).sendKeys(un);
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.id("passwordNext")).click();
		
		driver.close();
		sc.close();
	}

}
