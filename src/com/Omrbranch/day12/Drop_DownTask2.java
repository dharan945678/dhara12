package com.Omrbranch.day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_DownTask2 {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement btnClk = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		
		btnClk.click();
		
		WebElement txtFirstName = driver.findElement(By.name("firstname"));
		
		txtFirstName.sendKeys("dharan");
		
		WebElement txtLastName = driver.findElement(By.name("lastname"));
		
		txtLastName.sendKeys("saker");
		//drop-down
		WebElement enterDay = driver.findElement(By.id("day"));
		
		Select select=new Select(enterDay);
		
		select.selectByIndex(1);
		
		//to get all option
		
		List<WebElement> options = select.getOptions();
		
		for (WebElement element : options) {
			
			String text = element.getText();
			
			System.out.println(text);
			
		}
		
		System.out.println("****complete days*****");
		
		WebElement enterMonth = driver.findElement(By.id("month"));
		
		Select select1=new Select(enterMonth);
		
		select1.selectByVisibleText("Sep");
		
		//to get all option
		
		List<WebElement> options2 = select1.getOptions();
		
		for (WebElement element1 : options2) {
			
			String text1 = element1.getText();
			
			System.out.println(text1);
			
		}
		
		System.out.println("*****complete months*****");
		
		WebElement enterYear = driver.findElement(By.id("year"));
		
		Select select2=new Select(enterYear);
		
		select2.selectByValue("2000");
		
		//get all options
		
		List<WebElement> options3 = select2.getOptions();
		
		for (WebElement element2 : options3) {
			
			String text2 = element2.getText();
			
			System.out.println(text2);
		}
		System.out.println("********complete years**********");
		
		//is multiple using to boolean method
		
		boolean multiple = select.isMultiple();
		
		System.out.println(multiple);
	
		driver.quit();
	}

}
