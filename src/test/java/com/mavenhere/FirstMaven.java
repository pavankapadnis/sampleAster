package com.mavenhere;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstMaven {

	static RemoteWebDriver driver = null;

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://localhost/crud-using-php-ajax/index.php");
		driver.manage().window().maximize();

		FileInputStream file = new FileInputStream("F:\\ExampleExcel.xls");
		HSSFWorkbook work = new HSSFWorkbook(file);
		HSSFSheet sheet = work.getSheet("Sheet1");
		HSSFRow row = sheet.getRow(0);
		int lastCellInd = row.getLastCellNum();
		int lastRowNum = sheet.getLastRowNum();

		System.out.println("Number of Rows = " + lastRowNum);
		System.out.println("Number of Coloumn = " + lastCellInd);

		for (int i = 1; i < lastRowNum; i++) {
			
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("a.btn")).click();
			String fname = sheet.getRow(i).getCell(1).getRichStringCellValue().toString();
			driver.findElement(By.cssSelector("input#fname")).sendKeys(fname);
			String lname = sheet.getRow(i).getCell(2).getRichStringCellValue().toString();
			driver.findElement(By.cssSelector("input#lname")).sendKeys(lname);
			String gender = sheet.getRow(i).getCell(3).getRichStringCellValue().toString();
			driver.findElement(By.cssSelector("input#gender")).sendKeys(gender);
			String country = sheet.getRow(i).getCell(4).getRichStringCellValue().toString();
			driver.findElement(By.cssSelector("input#country")).sendKeys(country);
			int age = (int) sheet.getRow(i).getCell(5).getNumericCellValue();
			driver.findElement(By.cssSelector("input#age")).sendKeys(String.valueOf(age));
			String date = sheet.getRow(i).getCell(6).getRichStringCellValue().toString();
			driver.findElement(By.cssSelector("input#date")).sendKeys(date);
			int empid = (int) sheet.getRow(i).getCell(7).getNumericCellValue();
			driver.findElement(By.cssSelector("input#empid")).sendKeys(String.valueOf(empid));

		}
	}

}
