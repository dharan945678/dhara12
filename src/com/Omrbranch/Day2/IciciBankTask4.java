package com.Omrbranch.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBankTask4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		driver.manage().window().maximize();
		
		WebElement userLogin=driver.findElement(By.id("user-id-goahead"));
		
		userLogin.click();
		
		WebElement userId=driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		
		userId.sendKeys("6573476");
		
		WebElement userPass=driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		
		userPass.sendKeys("687687");
		
		driver.quit();
	}


}
