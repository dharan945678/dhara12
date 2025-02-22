package com.Omrbranch.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealTask12 {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtSign=driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(txtSign).perform();
		
		WebElement txtReg=driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		
		txtReg.click();
		
		Thread.sleep(2500);
		
		WebElement txtframe=driver.findElement(By.id("loginIframe"));
		
		driver.switchTo().frame(txtframe);
				
		WebElement txtNo=driver.findElement(By.id("userName"));
		
		txtNo.sendKeys("9994581797");
		
		WebElement clkCountinue=driver.findElement(By.id("checkUser"));
		
		clkCountinue.click();
		
		
	}

}
