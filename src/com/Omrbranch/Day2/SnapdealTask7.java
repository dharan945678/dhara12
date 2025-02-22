package com.Omrbranch.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealTask7 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/login");
		
		driver.manage().window().maximize();
		
		WebElement txtinputId=driver.findElement(By.id("userName"));
		
		txtinputId.sendKeys("Dharan");
		
		driver.quit();

	}


}
