package com.Omrbranch.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTask6 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.swiggy.com");
		
		driver.manage().window().maximize();
		
		WebElement txtInputId=driver.findElement(By.id("location"));
		
		txtInputId.sendKeys("Sholinganallur");
		
		driver.quit();
	}

}
