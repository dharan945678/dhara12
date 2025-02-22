package com.Omrbranch.day12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreensShotTask4 {
	
public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		
		System.out.println(file);
		
		File destfile=new File("D:\\Day 1 task\\s\\adaction.png");
		
		FileUnit.copyFile(file,destfile);
		
		driver.quit();
		
		
	}


}
