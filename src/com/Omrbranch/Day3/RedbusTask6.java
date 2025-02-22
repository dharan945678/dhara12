package com.Omrbranch.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusTask6 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		WebElement txtFromId=driver.findElement(By.xpath("//span[text()='Account']"));
		
		txtFromId.click();
		
		WebElement txtLoginId=driver.findElement(By.id("user_sign_in_sign_up"));
		
		txtLoginId.click();
		
		WebElement element = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
			
		driver.switchTo().frame(element);
		
		Thread.sleep(2500);		
		
		WebElement txtNo=driver.findElement(By.className("IP"));
		
		txtNo.sendKeys("9994581797");
		
		WebElement element2 = driver.findElement(By.xpath("//iframe[@title='reCAPTCHA'][1]"));
		
		driver.switchTo().frame(element2);
		
		Thread.sleep(2500);
		
		WebElement txtClk = driver.findElement(By.xpath("//div[@role='presentation'][1]"));
	
		txtClk.click();
		
		driver.quit();	
		}

}
