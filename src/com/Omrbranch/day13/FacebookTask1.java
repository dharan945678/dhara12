package com.Omrbranch.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask1 {
	
	public void main(String[]args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	WebElement txtUserName = driver.findElement(By.id("email"));
	
	js.executeScript("arguments[0].setAttribute('value','dharan@123')", txtUserName);
	
	WebElement txtPass = driver.findElement(By.id("pass"));
	
	js.executeScript("arguments[0].setAttribute('value','dharan@123')", txtPass);
	
	//WebElement btnLogin = driver.findElement(By.name("login"));
	
	//js.executeScript("arguments[0].click()", btnLogin);
	
	Object object= js.executeScript("return arguments[0].getAttribute('value')", txtUserName);
	
	String s=(String) object;
	
	System.out.println(s);
	
	WebElement down = driver.findElement(By.xpath("//li[text()='English (UK)']"));
	
	js.executeScript("argurments[0].scrollIntoview(true)", down);
	//webdirver
	
	Object object1=js.executeScript("return arguments[0].getAttribute('value')", txtPass);
	
	String s2=(String) object1;
	
	System.out.println(s2);
	
	driver.quit();
	
	
	
	
	
}

}
