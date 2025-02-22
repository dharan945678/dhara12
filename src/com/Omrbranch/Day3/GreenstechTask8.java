package com.Omrbranch.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenstechTask8 {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		WebElement txtResume=driver.findElement(By.id("heading201"));
		
		txtResume.click();
		
		WebElement txtModel=driver.findElement(By.xpath("//a[text()='Resume Model-1 ']"));
		
		txtModel.click();
		
		driver.quit();
		
	
	}

}
