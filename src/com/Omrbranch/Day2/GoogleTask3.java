package com.Omrbranch.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTask3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtInputName=driver.findElement(By.id("APjFqb"));
		
		txtInputName.sendKeys("Selenium");
		
		driver.quit();
		}
	

}
