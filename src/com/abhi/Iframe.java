package com.abhi;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\OneDrive\\Desktop\\selenium all jar file\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		driver.switchTo().frame(0);
		WebElement frame1=driver.findElement(By.xpath("//font[text()='Free Mock Tests']"));
		Actions act=new Actions(driver);
		act.moveToElement(frame1).click().build().perform();
		String mainid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			if(!(mainid.equals(id)))
			{
				driver.switchTo().window(id);
			}
		}
	driver.findElement(By.xpath("//a[text()='Insurance'][1]")).click();
	WebElement sc=driver.findElement(By.xpath("//h1[text()='Insurance Exam Mock Test Series | FREE Online Tests'][1]"));
	File src=sc.getScreenshotAs(OutputType.FILE);
	File trg=new File("./screenshot/sc tests.png");
	FileUtils.copyFile(src, trg);	
	driver.close();
	driver.switchTo().window(mainid);
	String title=driver.getTitle();
	System.out.println(title);
		


	}

}
