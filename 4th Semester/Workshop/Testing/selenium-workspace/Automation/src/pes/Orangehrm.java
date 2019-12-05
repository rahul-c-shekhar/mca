package pes;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the username : ");
		String uname = sc.nextLine();
		System.out.println("Enter the password : ");
		String pwd = sc.nextLine();
		
		//Open the browser
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//Enter valid user name
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		
		//Enter valid password
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		
		//Click on login
		driver.findElement(By.id("btnLogin")).click();
		//To wait for 3secs after login
		//Thread.sleep(3000);
		
		//To log out
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		
		//Close the browser
		driver.close();
		
		sc.close();
		
	}

}
