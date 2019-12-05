package pes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demourl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//To enter the URL
		driver.get("https://www.google.co.in/");
		
		//To get the title of the current web page
		String title = driver.getTitle();
		System.out.println("Title : "+title);
		
		//To get the URL of current web page
		String url = driver.getCurrentUrl();
		System.out.println("URL : "+url);
		
		//To get the source code of the current web page
		String pageSrc = driver.getPageSource();
		System.out.println("Page Source : "+pageSrc);
		
		//To close the Window
		driver.close();
	}

}
