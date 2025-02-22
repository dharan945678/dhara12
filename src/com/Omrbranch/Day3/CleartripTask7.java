package com.Omrbranch.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CleartripTask7 {
	
	public static void main(String[] args) {
		WebDriver driver=new  ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		
		driver.manage().window().maximize();
		
		WebElement txtFromId=driver.findElement(By.id("from_station"));
		
		txtFromId.sendKeys("chennai");
		
		WebElement txtToId=driver.findElement(By.id("to_station"));
		
		txtToId.sendKeys("Salem");
		
		WebElement txtSearchId=driver.findElement(By.id("trainFormButton"));
		
		txtSearchId.click();
		
		driver.quit();
		
	
	}

}
