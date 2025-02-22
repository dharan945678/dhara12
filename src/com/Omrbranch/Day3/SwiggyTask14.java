package com.Omrbranch.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTask14 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtSign=driver.findElement(By.xpath("//a[@class='_5-C04']"));
		
		txtSign.click();
		
		WebElement clkLogin=driver.findElement(By.id("mobile"));
		
		clkLogin.sendKeys("9994581797");
		
		WebElement clkLogn=driver.findElement(By.xpath("//a[@class='lyOGZ']"));
		
		clkLogn.click();
		
		WebElement txtName=driver.findElement(By.xpath("//input[@tabindex='2']"));
		
		txtName.sendKeys("Dharan");
		
		
		
		
	}



}
