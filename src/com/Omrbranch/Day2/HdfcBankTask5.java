package com.Omrbranch.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBankTask5 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("login_page");
		
		WebElement txtUserId=driver.findElement(By.xpath("//input[@style='width: 245px;height: 30px']"));
		
		txtUserId.sendKeys("dharan123");
		
		driver.quit();
		
		
	}


}
