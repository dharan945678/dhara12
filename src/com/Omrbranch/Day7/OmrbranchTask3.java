package com.Omrbranch.Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OmrbranchTask3 {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
		
		WebElement txtClass=driver.findElement(By.xpath("//button[text()='Double click to see future date']"));
		Actions actions=new Actions(driver);
		actions.doubleClick(txtClass).perform();
	}


}
