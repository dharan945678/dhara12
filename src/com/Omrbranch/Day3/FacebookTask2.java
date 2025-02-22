package com.Omrbranch.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask2 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtEmailId=driver.findElement(By.id("email"));
		
		txtEmailId.sendKeys("Dharan Saker");
		
		WebElement txtPass=driver.findElement(By.id("pass"));
		
		txtPass.sendKeys("dharan@123");
		
		WebElement txtLogin=driver.findElement(By.xpath("//button[@value='1']"));
		
		txtLogin.click();
	}


}
