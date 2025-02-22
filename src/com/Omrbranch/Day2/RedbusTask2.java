package com.Omrbranch.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusTask2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		WebElement txtFromId=driver.findElement(By.id("src"));
		
		txtFromId.sendKeys("salem");
		
		WebElement txtToId=driver.findElement(By.id("dest"));
		
		txtToId.sendKeys("chennai");
		
		driver.quit();
		
		
	}

}
