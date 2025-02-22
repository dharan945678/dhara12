package com.Omrbranch.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmrbranchTask3 {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.omrbranch.com/javatraininginchennaiomr");
		
		WebElement txtPrint= driver.findElement(By.xpath("//p[contains(text(),'We undertake')]"));
		
		String p=txtPrint.getText();
		
		System.out.println(p);
	}


}
