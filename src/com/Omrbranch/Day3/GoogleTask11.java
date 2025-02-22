package com.Omrbranch.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleTask11 {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.manage().window().maximize();
		
		WebElement txtFirstName=driver.findElement(By.id("firstName"));
		
		txtFirstName.sendKeys("Dharan");
		
		WebElement txtLastName=driver.findElement(By.id("lastName"));
		
		txtLastName.sendKeys("Saker");
		
		WebElement clkNext = driver.findElement(By.xpath("//span[@jsname='V67aGc']"));
		
		clkNext.click();
		
		Thread.sleep(4000);
		
		WebElement clkmonth = driver.findElement(By.id("month"));
		
		Select Select=new Select(clkmonth);
		
		Select.selectByValue("9");
		
		WebElement clkYear = driver.findElement(By.id("day"));
		
		clkYear.sendKeys("2");
		
		WebElement clkDay = driver.findElement(By.id("year"));
		
		clkDay.sendKeys("2000");
		
		WebElement clkGender = driver.findElement(By.id("gender"));
		
		Select Select1=new Select(clkGender);
		
		Select1.selectByValue("1");
				
		driver.quit();
		
		
		
		
	}

}
