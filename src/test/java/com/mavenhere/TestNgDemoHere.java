package com.mavenhere;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgDemoHere {
	
	RemoteWebDriver driver = null;
	
	@BeforeMethod
	public void bm() {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.get("http://localhost/crud-using-php-ajax/index.php");
	driver.manage().window().maximize();
		
	}
	
	@Test
	public void test1() throws IOException {
		
		driver.findElement(By.cssSelector("a.btn")).click();
		driver.findElement(By.cssSelector("input#fname")).sendKeys("Sumit");
		driver.findElement(By.cssSelector("input#lname")).sendKeys("Rathod");
		driver.findElement(By.cssSelector("input#gender")).sendKeys("Male");
		driver.findElement(By.cssSelector("input#country")).sendKeys("India");
		driver.findElement(By.cssSelector("input#age")).sendKeys("25");
		driver.findElement(By.cssSelector("input#date")).sendKeys("24/11/2005");
		driver.findElement(By.cssSelector("input#empid")).sendKeys("7822");
		driver.findElement(By.cssSelector("button#save")).click();
		
		File file = driver.getScreenshotAs(OutputType.FILE);
		File output = new File("screenshot1.png");
		Files.copy(file, output);
		
		
	}
	
	@Test
	public void test2() throws IOException {
		
		driver.findElement(By.cssSelector("a.btn")).click();
		driver.findElement(By.cssSelector("input#fname")).sendKeys("Sumit");
		driver.findElement(By.cssSelector("input#lname")).sendKeys("Rathod");
		driver.findElement(By.cssSelector("input#gender")).sendKeys("Male");
		driver.findElement(By.cssSelector("input#country")).sendKeys("India");
		driver.findElement(By.cssSelector("input#age")).sendKeys("25");
		driver.findElement(By.cssSelector("input#date")).sendKeys("24/11/2005");
		driver.findElement(By.cssSelector("input#empid")).sendKeys("7822");
		driver.findElement(By.cssSelector("button#save")).click();
		
		File file = driver.getScreenshotAs(OutputType.FILE);
		File output = new File("screenshot2.png");
		Files.copy(file, output);
		
	}
	
	@AfterMethod
	public void am() {
		
		driver.close();
		
		
	}
}
