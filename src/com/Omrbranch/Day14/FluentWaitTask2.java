package com.Omrbranch.Day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitTask2 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		
		
		
		WebElement txtUserName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		txtUserName.sendKeys("dharan94567@gmail.com");
		
		WebElement txtPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		
		txtPassword.sendKeys("dhran@123");
		
		WebElement btnClk = wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		
		btnClk.click();
		
		
	}


}
