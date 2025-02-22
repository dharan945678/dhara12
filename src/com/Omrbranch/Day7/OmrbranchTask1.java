package com.Omrbranch.Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OmrbranchTask1 {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omrbranch.com/seleniumtraininginchennaiomr");
		
		WebElement txtCoures=driver.findElement(By.xpath("//a[text()='Courses ']"));
		txtCoures.click();
		Actions actions=new Actions(driver);
		actions.moveToElement(txtCoures).perform();
		
		WebElement txtOracleTraning=driver.findElement(By.xpath("//a[text()='Oracle Training']"));
		txtOracleTraning.click();
		actions.moveToElement(txtOracleTraning).perform();
		
		WebElement txtSQLCertificate=driver.findElement(By.xpath("//a[text()='SQL Certification']"));
		txtSQLCertificate.click();
		
		WebElement txtPrint=driver.findElement(By.xpath("//h1[text()='For Joining Automation Course']"));
		String Print=txtPrint.getText();
		System.out.println(Print);
	}

}
