package com.Omrbranch.Day3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationtestingTask3 {
	
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement txtName=driver.findElement(By.xpath("//input[@type='text'][1]"));
		
		txtName.sendKeys("Dharan");
		
		WebElement txtLastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		
		txtLastName.sendKeys("Saker");
		
		WebElement txtAddress=driver.findElement(By.xpath("//textarea[@rows='3']"));
		
		txtAddress.sendKeys("12/57");
		
		WebElement txtEmailId=driver.findElement(By.xpath("//input[@type='email']"));
		
		txtEmailId.sendKeys("dharan94567@gmail.com");
		
		WebElement txtPhno=driver.findElement(By.xpath("//input[@type='tel']"));
		
		txtPhno.sendKeys("9994581797");
		
		WebElement txtGender=driver.findElement(By.xpath("//input[@value='Male']"));
		
		txtGender.click();
		
		WebElement txtHobbies=driver.findElement(By.id("checkbox1"));
		
		txtHobbies.click();
				
		WebElement clkSkils=driver.findElement(By.id("Skills"));
		
		Select Select = new Select(clkSkils);
		
		Select.selectByValue("Java");
		
		WebElement clkYear=driver.findElement(By.id("yearbox"));
		
		Select select1=new Select(clkYear);
		
		select1.selectByValue("2000");
		
		WebElement clkMonth=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		
		Select select2=new Select(clkMonth);
		
		select2.selectByValue("September");
		
		WebElement clkDay=driver.findElement(By.id("daybox"));
		
		Select select3=new Select(clkDay);
		
		select3.selectByIndex(2);
		
		WebElement clkPass=driver.findElement(By.id("firstpassword"));
		
		clkPass.sendKeys("dharan123");
		
		WebElement clkConformPass=driver.findElement(By.id("secondpassword"));
		
		clkConformPass.sendKeys("dharan123");
		
		WebElement txtsubmit=driver.findElement(By.id("submitbtn"));
		
		txtsubmit.click();
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_WINDOWS);
		robot.keyPress(KeyEvent.VK_PRINTSCREEN);
		robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
		robot.keyRelease(KeyEvent.VK_WINDOWS);
		
		driver.quit();
	}

}
