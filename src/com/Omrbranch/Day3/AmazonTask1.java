package com.Omrbranch.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask1 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement txtinputId=driver.findElement(By.id("twotabsearchtextbox"));
		
		txtinputId.sendKeys("iphone");
		
		WebElement txtId=driver.findElement(By.id("nav-search-submit-button"));
		
		txtId.click();
	}

}
