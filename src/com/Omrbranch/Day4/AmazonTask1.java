package com.Omrbranch.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask1 {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement txtcondent=driver.findElement(By.xpath("//a[contains(text(),'Conditions of Use')]"));
		
		String txt=txtcondent.getText();
		
		System.out.println(txt);
	}

}
