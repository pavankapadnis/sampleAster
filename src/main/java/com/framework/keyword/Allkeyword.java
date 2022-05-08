package com.framework.keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Allkeyword {
	
	public static RemoteWebDriver driver = null;
	
	public static void openBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}else {
			System.err.print("Invalid Browser Name "+browserName);
		}
		
		
		
	}

	public static void openUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void cssOrvalue(String locator, String value) {
		driver.findElement(By.cssSelector(locator)).sendKeys(value);
	}

	public static void click(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
	}

	public static void selectValue(String locator, String value) {
		WebElement elem = driver.findElement(By.cssSelector(locator));
		Select sel = new Select(elem);
		sel.selectByVisibleText(value);
		
	}

	

	
	
	
}
