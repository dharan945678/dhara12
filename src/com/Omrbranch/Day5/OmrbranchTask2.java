package com.Omrbranch.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmrbranchTask2 {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omrbranch.com/");
		
		WebElement txtId=driver.findElement(By.id("email"));
		txtId.sendKeys("Dharan");
		
		boolean b=txtId.isEnabled();
		if(b=true) {
			
			System.out.println("Editable");
		}
		else {
			System.out.println("Disenable");
		
		}
		WebElement txtPass=driver.findElement(By.id("pass"));
		txtPass.sendKeys("dharan123");
		boolean a=txtPass.isEnabled();
		if(a=true) {
			
			System.out.println("Editable");
		}
		else {
			System.out.println("Disenable");
		}
		
		WebElement txtLogin=driver.findElement(By.xpath("//button[text()='Login']"));
		txtLogin.click();
		boolean c=txtPass.isEnabled();
		if(c=true) {
			
			System.out.println("Editable");
		}
		else {
			System.out.println("Disenable");
			
		}
			
	}


}
