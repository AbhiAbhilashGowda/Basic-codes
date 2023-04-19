package com.abhi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeanddate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\OneDrive\\Desktop\\selenium all jar file\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='World Weather']/../..//form/input")).sendKeys("ban");
		Thread.sleep(5000);
		List<WebElement>allsug=driver.findElements(By.xpath("//div[@id='po1']"));
		for(WebElement sug:allsug)
		{
			System.out.println(sug.getText());


	}

	}
}
