package com.Omrbranch.Day9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OmrbranchTask1 {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
		
		WebElement txtClass=driver.findElement(By.xpath("//button[text()='Right click to enter past date']"));
		Actions actions=new Actions(driver);
		actions.contextClick(txtClass).perform();
		
		Alert al=driver.switchTo().alert();
		al.sendKeys("Dharan");
		al.accept();
		
		WebElement txtPrint=driver.findElement(By.id("demo"));
		String p=txtPrint.getText();
		System.out.println(p);
		
		driver.quit();
		
	}


}
