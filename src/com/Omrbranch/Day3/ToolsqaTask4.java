package com.Omrbranch.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsqaTask4 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");
		
		driver.manage().window().maximize();
		
		WebElement txtFirstName= driver.findElement(By.id("first-name"));
		
		txtFirstName.sendKeys("Dharan");
		
		WebElement txtLastName= driver.findElement(By.id("last-name"));
		
		txtLastName.sendKeys("Saker");
		
		WebElement txtEmail= driver.findElement(By.id("email"));
		
		txtEmail.sendKeys("dharan94567@gmail.com");
		
		WebElement txtMobileNo= driver.findElement(By.id("mobile"));
		
		txtMobileNo.sendKeys("9994581797");
		
		WebElement txtCity= driver.findElement(By.id("city"));
		
		txtCity.sendKeys("chennai");
		
		WebElement Country = driver.findElement(By.name("country"));
		
		Select Select = new Select(Country);
		
		Select.selectByValue("4");
		
		driver.quit();
	}

}
