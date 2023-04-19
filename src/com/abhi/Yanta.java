package com.abhi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Yanta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\OneDrive\\Desktop\\selenium all jar file\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//span[text()='Buses']")).click();
		driver.findElement(By.id("BE_bus_from_station")).click();
		WebElement ban=driver.findElement(By.xpath("//div[@class='viewport']//li[3]"));
		Actions act=new Actions(driver);
		act.moveToElement(ban).click().build().perform();
		WebElement chan=driver.findElement(By.xpath("//div[@class='viewport']//li[4]"));
		act.moveToElement(chan).click().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.id("BE_bus_depart_date")).click();
		WebElement dat=driver.findElement(By.id("30/12/2022"));
		act.moveToElement(dat).click().build().perform();
		driver.findElement(By.id("BE_bus_search_btn")).click();
		String result=driver.findElement(By.xpath("//h1[contains(text(),'We have got')]")).getText();
		System.out.println(result);
		
		
		
		

	}

}
