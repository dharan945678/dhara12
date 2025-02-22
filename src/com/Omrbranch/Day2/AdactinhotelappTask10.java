package com.Omrbranch.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinhotelappTask10 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtinputId= driver.findElement(By.id("username"));
		
		txtinputId.sendKeys("Dharan");
		
		WebElement txtinputPas=driver.findElement(By.id("password"));
		
		txtinputPas.sendKeys("Dharan12345");
		
		driver.quit();
		
	}

}
