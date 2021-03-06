package pes;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the browser : ");
		String browser = sc.nextLine();
		WebDriver driver = null;
		if (browser.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		else if (browser.equals("gc"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
			driver = new ChromeDriver();
		}
	sc.close();
	}

}
