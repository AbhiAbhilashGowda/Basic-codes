package com.abhi;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoworldcup {
	public static void main(String[]args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhi\\OneDrive\\Desktop\\selenium all jar file\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("worldcup");
		Thread.sleep(5000);
		List<WebElement>allsugg=driver.findElements(By.xpath("//div[@class='erkvQe']/div"));
		for(WebElement sug:allsugg)
		{
			System.out.println(sug.getText());
			String sugtn=sug.getText();
			if(sugtn.contains("world cup 2022"))
			{
				sug.click();
			}
		String result=driver.findElement(By.id("result-stats")).getText();
		System.out.println("***************************************");
		System.out.println(result);

		}
	}

}
