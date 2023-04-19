package com.abhi;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Withouttread {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\OneDrive\\Desktop\\selenium all jar file\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		String ti = driver.getTitle();
		System.out.println(ti);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('username').value='admin';");
		jse.executeScript("document.getElementsByName('pwd')[0].value='manager';");
		jse.executeScript("document.getElementById('loginButton').click();");
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		String tt = driver.getTitle();
		System.out.println(tt);

	}

}
