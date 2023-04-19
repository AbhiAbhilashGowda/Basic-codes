package com.abhi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone {
	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Iphone ip = new Iphone();
		ip.launchBrowser();
		ip.login();
		String result = ip.getresult();
		System.out.println(result);
		ip.adclik();
	}

	public void launchBrowser()

	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\OneDrive\\Desktop\\selenium all jar file\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void login() throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	}

	public String getresult() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphonex");
		driver.findElement(By.className("_34RNph")).click();
		Thread.sleep(2000);
		String Result = driver.findElement(By.xpath("//span[contains(text(),'Showing ')]")).getText();
		Thread.sleep(5000);
		return Result;
	}

	public void adclik() {
		driver.findElement(By.xpath("(//span[text()='Add to Compare'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Add to Compare'])[last()]")).click();
	}
}
