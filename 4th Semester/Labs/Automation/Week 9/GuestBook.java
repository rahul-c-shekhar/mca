package pes;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuestBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String n = sc.nextLine();
		System.out.println("Enter email");
		String em = sc.nextLine();
		System.out.println("Enter Message: ");
		String msg = sc.nextLine();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.seleniummaster.com/seleniumguestbook/Guestbook.aspx");
		
		driver.findElement(By.id("nameTextBox")).sendKeys(n);
		driver.findElement(By.id("emailTextBox")).sendKeys(em);
		driver.findElement(By.id("messageTextBox")).sendKeys(msg);
		
		driver.findElement(By.id("submitButton")).click();
		
		sc.close();
	}

}