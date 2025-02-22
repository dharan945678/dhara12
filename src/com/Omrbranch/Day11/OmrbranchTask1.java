package com.Omrbranch.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmrbranchTask1 {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.omrbranch.com/javatraininginchennaiomr");
		
		WebElement txtprint= driver.findElement(By.xpath("//p[contains(text(),'We undertake')]"));
		String txt1=txtprint.getText();
		System.out.println(txt1);
		
		driver.switchTo().frame(1);
		
		WebElement txtAutomantion=driver.findElement(By.xpath("//h2[text()='Automation']"));
		
		String text2 = txtAutomantion.getText();
		System.out.println(text2);
		
		driver.switchTo().frame("core-java");
		
		driver.switchTo().frame("oops");
		
		WebElement txtOOPS= driver.findElement(By.xpath("//p[contains(text(),'1.1 OOPS')]"));
		
		String text3 = txtOOPS.getText();
		System.out.println(text3);
		
		WebElement txtInterface = driver.findElement(By.xpath("//li[text()='Inheritance']"));
		String text4 = txtInterface.getText();
		System.out.println(text4);
		
		WebElement txtAbstraction = driver.findElement(By.xpath("//li[text()='Abstraction']"));
		String text5 = txtAbstraction.getText();
		System.out.println(text5);
		
		WebElement txtPolymorphism = driver.findElement(By.xpath("//li[text()='Polymorphism']"));
		
		String text6 = txtPolymorphism.getText();
		System.out.println(text6);
		
		WebElement txtEncapsulation = driver.findElement(By.xpath("//li[text()='Encapsulation']"));
		
		String text7 = txtEncapsulation.getText();
		System.out.println(text7);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("collections");
		WebElement txtcollections=driver.findElement(By.xpath("//p[text()='1.2 Collections']"));
		String text8= txtcollections.getText();
		System.out.println(text8);
		
		
		WebElement txtList=driver.findElement(By.xpath("//li[text()='List']"));
		String text9 = txtList.getText();
		System.out.println(text9);
		
		WebElement txtSet=driver.findElement(By.xpath("//li[text()='Set']"));
		String text10 = txtSet.getText();
		System.out.println(text10);
		
		WebElement txtMap=driver.findElement(By.xpath("//li[text()='Map']"));
		String text11 = txtMap.getText();
		System.out.println(text11);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
				
		driver.switchTo().frame("selenium");
		WebElement txtselenium=driver.findElement(By.xpath("//h4[text()='Selenium']"));
		String text12= txtselenium.getText();
		System.out.println(text12);
		
		driver.switchTo().frame("actions");
		WebElement txtactions=driver.findElement(By.xpath("//p[text()='Actions']"));
		String text13= txtactions.getText();
		System.out.println(text13);
		
		WebElement txtMove=driver.findElement(By.xpath("//li[text()='Move to Ele']"));
		String text14= txtMove.getText();
		System.out.println(text14);
		
		WebElement txtClick=driver.findElement(By.xpath("//li[text()='Click']"));
		String text15= txtClick.getText();
		System.out.println(text15);
		
		WebElement txtDoubleClick=driver.findElement(By.xpath("//li[text()='Double Click']"));
		String text16= txtDoubleClick.getText();
		System.out.println(text16);
		
		WebElement txtRightClick=driver.findElement(By.xpath("//li[text()='Right Click']"));
		String text17= txtRightClick.getText();
		System.out.println(text17);
		
		System.out.println(text16);
		driver.switchTo().parentFrame();
		System.out.println(text15);
		
		driver.switchTo().parentFrame();
		System.out.println(text14);
		
		driver.switchTo().parentFrame();
		System.out.println(text13);
		
		driver.switchTo().parentFrame();
		System.out.println(text12);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.switchTo().frame("core-java");
		driver.switchTo().frame("collections");
		System.out.println(text11);
		System.out.println(text10);
		System.out.println(text9);
		driver.switchTo().parentFrame();
		driver.switchTo().frame("oops");
		System.out.println(text8);
		System.out.println(text7);
		System.out.println(text6);
		System.out.println(text5);
		System.out.println(text4);
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		System.out.println(text3);
		driver.switchTo().defaultContent();
		System.out.println(text2);
		System.out.println(txt1);
		driver.quit();
	}

}
