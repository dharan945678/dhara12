package com.Omrbranch.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraninginomrTask2 {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://traininginchennai.in/selenium-training-in-chennai.html");
		
		WebElement txtclick=driver.findElement(By.xpath("//span[contains(text(),'Overview')]"));
		
		txtclick.click();
		
		WebElement txtparagape=driver.findElement(By.xpath("//p[contains(text(),'Greens Technologys Selenium training program')]"));
		
		String p=txtparagape.getText();
		
		System.out.println(p);
		
		txtparagape.getText();
	}

}
