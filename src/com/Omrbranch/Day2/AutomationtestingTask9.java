package com.Omrbranch.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationtestingTask9 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement txtName=driver.findElement(By.xpath("//input[@type='text'][1]"));
		
		txtName.sendKeys("Dharan");
		
		WebElement txtLastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		
		txtLastName.sendKeys("Saker");
		
		WebElement txtAddress=driver.findElement(By.xpath("//textarea[@rows='3']"));
		
		txtAddress.sendKeys("12/57");
		
		WebElement txtEmailId=driver.findElement(By.xpath("//input[@type='email']"));
		
		txtEmailId.sendKeys("dharan94567@gmail.com");
		
		WebElement txtPhno=driver.findElement(By.xpath("//input[@type='tel']"));
		
		txtPhno.sendKeys("9994581797");
		
		driver.quit();
			
	}

}
