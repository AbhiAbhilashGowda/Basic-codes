package com.abhi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\abhi\\OneDrive\\Desktop\\selenium all jar file\\chromedriver_win32 (1)\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(by
  
	}

}
