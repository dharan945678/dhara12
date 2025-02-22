package com.Omrbranch.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramTask8 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		driver.manage().window().maximize();
		
		WebElement txtinputName=driver.findElement(By.name("username"));
		
		txtinputName.sendKeys("Dharan");
		
		WebElement txtinputPas=driver.findElement(By.name("password"));
		
		txtinputPas.sendKeys("dhran1234");
		
		driver.quit();
	}


}
