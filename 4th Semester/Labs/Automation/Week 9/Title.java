package pes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {

				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.google.com/");
				
				String actual_title = driver.getTitle();
				System.out.println("Title: "+actual_title);
				
				String expected_title = "Google";
				
				if(actual_title.equalsIgnoreCase(expected_title))
				{
					System.out.println("Passed");
				}
				else
					System.out.println("Failed");
				
				driver.close();

			}

}