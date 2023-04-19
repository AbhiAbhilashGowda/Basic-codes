package com.abhi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzonimg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\OneDrive\\Desktop\\selenium all jar file\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement>allimage=driver.findElements(By.xpath("//img"));
	   for(WebElement img:allimage) 
	    {
		   String imagess=img.getAttribute("src");
		   System.out.println(imagess);
		//System.out.println(img.getAttribute("src"));
		}
	}
}