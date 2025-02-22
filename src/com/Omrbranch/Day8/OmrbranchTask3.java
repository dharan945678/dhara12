package com.Omrbranch.Day8;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OmrbranchTask3 {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys("SElenium Traning in chennai").keyUp(Keys.SHIFT).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
	}

}
