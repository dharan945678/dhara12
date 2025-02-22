package com.Omrbranch.Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OmrbranchTask2 {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omrbranch.com/seleniumtraininginchennaiomr");
		
		WebElement sClass=driver.findElement(By.xpath("//a[contains(text(),'String')]"));
		WebElement dClass=driver.findElement(By.id("java-class"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(sClass, dClass).perform();
		
		WebElement s1Class=driver.findElement(By.xpath("//a[contains(text(),'List')]"));
		WebElement d1Class=driver.findElement(By.id("java-interface"));
		actions.dragAndDrop(s1Class, d1Class).perform();
		
		WebElement s2Class=driver.findElement(By.xpath("//a[contains(text(),'Actions ')]"));
		WebElement d2Class=driver.findElement(By.id("selenium-class"));
		actions.dragAndDrop(s2Class, d2Class).perform();
		
		WebElement s3Class=driver.findElement(By.xpath("//a[contains(text(),' Webdriver ')]"));
		WebElement d3Class=driver.findElement(By.id("selenium-interface"));
		actions.dragAndDrop(s3Class, d3Class).perform();
		
		WebElement txtPrint=driver.findElement(By.id("result"));
		String p=txtPrint.getText();
		System.out.println(p);
		
	}



}
