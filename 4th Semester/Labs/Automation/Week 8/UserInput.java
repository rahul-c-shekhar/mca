package pes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/student/workspace4/Automation/drivers/chromedriver");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the url : ");
		String url = sc.nextLine();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.close();
		sc.close();
	}

}
