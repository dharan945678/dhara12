package com.Omrbranch.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask1 {
	public static void main(String[] args) {
		//1 launch the Browser
		WebDriver driver=new ChromeDriver();
		//2 enter the Url
		driver.get("https://www.facebook.com/");
		// 3 maximize the window
		driver.manage().window().maximize();
		//find the locator
		WebElement txtEmailId= driver.findElement(By.id("Email"));
		//send keys
		txtEmailId.sendKeys("Greens Tech");
		
	}


}
