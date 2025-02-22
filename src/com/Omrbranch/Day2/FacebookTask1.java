package com.Omrbranch.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtEmailId=driver.findElement(By.id("email"));
		
		txtEmailId.sendKeys("GreensOmr");
		
		WebElement txtPass=driver.findElement(By.id("pass"));
		
		txtPass.sendKeys("Hello@12342");	
	}


}
