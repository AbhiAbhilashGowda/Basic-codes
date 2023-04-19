package com.abhi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Muliti {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\OneDrive\\Desktop\\selenium all jar file\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://C:/Users/abhi/OneDrive/Desktop/html/dropdown2.html");
		WebElement movies=driver.findElement(By.id("movie"));
		movies.click();
		Select s=new Select(movies);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		s.deselectByIndex(2);
		s.deselectAll();
		
		
		

	}

}
