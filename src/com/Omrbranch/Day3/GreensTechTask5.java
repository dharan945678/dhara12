package com.Omrbranch.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechTask5 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://omrbranch.com/api/documentation");
		
		driver.manage().window().maximize();
		
		
		WebElement txtInterview=driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		
		txtInterview.click();
		
		WebElement txtCtsQus=driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/interview-questions/cts.pdf#toolbar=0']"));
		
		txtCtsQus.click();
		
		driver.quit();
	}

}
