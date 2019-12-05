package pes;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String un = sc.nextLine();
		System.out.println("Enter Password: ");
		String pwd = sc.nextLine();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys(un);
		
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		
		//To login
		driver.findElement(By.id("btnLogin")).click();
		
		driver.close();
		sc.close();
	}

}