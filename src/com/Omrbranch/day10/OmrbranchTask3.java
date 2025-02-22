package com.Omrbranch.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmrbranchTask3 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omrbranch.com/javatraininginchennaiomr");
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame("selenium");
		
		driver.switchTo().frame("actions");
				
		WebElement txtPrint = driver.findElement(By.xpath("//li[text()='Right Click']"));
		
		String text = txtPrint.getText();
		System.out.println(text);
		
		driver.quit();
		
	}


}
