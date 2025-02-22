package com.Omrbranch.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTask13 {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtNo=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		
		txtNo.sendKeys("9994581797");
		
		WebElement txtcountinue=driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		
		txtcountinue.click();
	}

}
