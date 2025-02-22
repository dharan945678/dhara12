package com.Omrbranch.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmrbranchTask1 {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		
		WebElement txtFirstName=driver.findElement(By.id("first_name"));
		txtFirstName.sendKeys("Dharan");
		String value1=txtFirstName.getDomProperty("value");
		System.out.println(value1);
		
		WebElement txtLastName=driver.findElement(By.id("last_name"));
		txtLastName.sendKeys("Saker");
		String value2=txtLastName.getDomProperty("value");
		System.out.println(value2);
		
		WebElement txtAddress=driver.findElement(By.xpath("//textarea[@class='form-control address']"));
		txtAddress.sendKeys("12/57");
		String value3=txtAddress.getDomProperty("value");
		System.out.println(value3);
		
		WebElement txtEmail=driver.findElement(By.id("email"));
		txtEmail.sendKeys("dharan94567@gmail.com");
		String value4=txtEmail.getDomProperty("value");
		System.out.println(value4);
		
		WebElement txtPhone=driver.findElement(By.id("phone"));
		txtPhone.sendKeys("9994581797");
		String value5=txtPhone.getDomProperty("value");
		System.out.println(value5);
		
		WebElement txtPass=driver.findElement(By.id("password"));
		txtPass.sendKeys("dharan123");
		String value8=txtPass.getDomProperty("value");
		System.out.println(value8);
		
		WebElement txtConformPass=driver.findElement(By.id("confirm-password"));
		txtConformPass.sendKeys("dharan123");
		String value9=txtConformPass.getDomProperty("value");
		System.out.println(value9);
		}

}
