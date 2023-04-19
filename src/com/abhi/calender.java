package com.abhi;


import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\OneDrive\\Desktop\\selenium all jar file\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, 1);
		Date tommorowDate = cal.getTime();
		System.out.println(tommorowDate);
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String modifiedDate = sdf.format(tommorowDate);
		System.out.println(modifiedDate);
		driver.switchTo().frame(0);
		driver.findElement(By.id("datapicker")).sendKeys(modifiedDate, Keys.ESCAPE);

	}
}
