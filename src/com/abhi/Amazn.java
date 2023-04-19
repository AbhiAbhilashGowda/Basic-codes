package com.abhi;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazn {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\OneDrive\\Desktop\\selenium all jar file\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement screen = driver.findElement(By.id("nav-logo-sprites"));
		File src = screen.getScreenshotAs(OutputType.FILE);
		File trg = new File("./Screenshot/amazonlogo.png");
		FileUtils.copyFile(src, trg);
	}

}
