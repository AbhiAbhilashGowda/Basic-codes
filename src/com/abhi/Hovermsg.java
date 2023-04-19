package com.abhi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hovermsg {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\OneDrive\\Desktop\\selenium all jar file\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButtonContainer")).click();
		Thread.sleep(5000);
		WebElement erormsg = driver.findElement(By.xpath("//span[contains(text(),'Please try again.')]"));
		String eror = erormsg.getText();
		Thread.sleep(5000);
		System.out.println(eror);
		WebElement font = driver.findElement(By.id("errorMessagesArea"));
		String value = font.getCssValue("style");
		Thread.sleep(5000);
		System.out.println(value);

	}
}