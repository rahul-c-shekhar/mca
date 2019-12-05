package pes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///home/rahul-c-shekhar/Dropbox/MCA/4th%20Semester/Testing%20Seminar/DropDown.html");
		
		WebElement hotelList = driver.findElement(By.id("PES"));
		
		Select sel = new Select(hotelList);
		Thread.sleep(1000);
		
		//Select by index
		sel.selectByIndex(1);
		Thread.sleep(1000);
		
		//Select by value
		sel.selectByValue("p");
		Thread.sleep(1000);
		
		//Select by Visible Text
		sel.selectByVisibleText("Chicken Roll");
		Thread.sleep(1000);
		
		//Select among multiple Visible Text
		sel.selectByVisibleText("Fish");
		Thread.sleep(1000);
		
		//To count and print all the options in the List box
		List<WebElement> allOption = sel.getOptions();
		System.out.println("All the options in the List box : ");
		int count = allOption.size();
		System.out.println("Number of options : "+count);
		System.out.println("Options : ");
		for(int j = 0; j < count; j++)
		{
			WebElement aoption = allOption.get(j);
			String texts = aoption.getText();
			System.out.println(texts);
		}

		//To get the address of all the selected options
		List<WebElement> allOptions = sel.getAllSelectedOptions();
				
		//To count the number of selected options
		int n = allOptions.size();
		System.out.println("Selected options count = "+n);
				
		//To print all the selected options
		System.out.println("Selected options : ");
		for(int i = 0; i < n; i++)
		{
			WebElement option = allOptions.get(i);
			String text = option.getText();
			System.out.println(text);			
		}
		
		//To print the first selected option
		WebElement firstOption = sel.getFirstSelectedOption();
		System.out.println("The first selected option is : "+ firstOption.getText());
		
		//Deselect by Visible Text
		sel.deselectByVisibleText("Fish");
		Thread.sleep(1000);
		
		//Deselect by index
		sel.deselectByIndex(1);
		Thread.sleep(1000);
		
		//Deselect by value
		sel.deselectByValue("p");
		Thread.sleep(1000);
		
		//Deselect all
		sel.deselectAll();
		Thread.sleep(1000);
		
		//To select all the options in the List box
		for(int m = 0; m < count; m++)
		{
			sel.selectByIndex(m);
		}
		
		//To check whether the list box is single or multiple
		System.out.println("Is it a multiselect List box : "+sel.isMultiple());
				
		driver.close();
	}

}